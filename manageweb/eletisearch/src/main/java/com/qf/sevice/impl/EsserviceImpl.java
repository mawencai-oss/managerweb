package com.qf.sevice.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qf.domain.DrugMsg;
import com.qf.sevice.DrugFeign;
import com.qf.sevice.Esservice;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class EsserviceImpl implements Esservice {
    @Autowired
    RestHighLevelClient restHighLevelClient;
    @Autowired
    DrugFeign drugFeign;
    @Override
    public String insert(DrugMsg drugMsg) {
        List<DrugMsg> list = drugFeign.selectAllDru1();
        IndexRequest request = new IndexRequest("drug","doc");
        Map map=new HashMap();
        for (DrugMsg msg : list) {
            map.put("drugname",msg.getDrugName());
            map.put("drugapplication",msg.getDrugSyz());
            map.put("drugcompany",msg.getDrugManu());
            map.put("drugprice",msg.getDrugPrice());
            map.put("drugxhgg",msg.getDrugGgxh());
            request.source(map);
        }
        try {
            IndexResponse response = restHighLevelClient.index(request);
            return response.getResult().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String delete(Long id) {
        DeleteRequest deleteRequeste=new DeleteRequest("drug","doc",id+"");
        try {
            DeleteResponse deleteResponse = restHighLevelClient.delete(deleteRequeste);
            return deleteResponse.getResult().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String update(DrugMsg msg) {
        UpdateRequest updateRequest=new UpdateRequest("drug","doc",msg.getPkDrugid()+"");
        try {
            UpdateResponse response = restHighLevelClient.update(updateRequest);
            Map map=new HashMap();
            map.put("drugname",msg.getDrugName());
            map.put("drugapplication",msg.getDrugSyz());
            map.put("drugcompany",msg.getDrugManu());
            map.put("drugprice",msg.getDrugPrice());
            map.put("drugxhgg",msg.getDrugGgxh());
            updateRequest.doc(map);
            return response.status().name();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List selectAll() {
        List list=new ArrayList();
        SearchRequest searchRequest=new SearchRequest("drug");
        searchRequest.types("doc");
        SearchSourceBuilder searchSourceBuilder=new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchAllQuery());
        searchRequest.source(searchSourceBuilder);
        try {
            SearchResponse response = restHighLevelClient.search(searchRequest);
            for (SearchHit searchHit : response.getHits()) {
                Map<String, Object> map = searchHit.getSourceAsMap();
                DrugMsg drugMsg = (DrugMsg) JSONObject.parse(JSON.toJSONString(map));
                list.add(drugMsg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
