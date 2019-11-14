package com.qf.config;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101300674767";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDbieKuAXkEYgBxK9ig3BcJD1IAPeTzcTZg9I1s6NzsmqEsnOJLcgwUR3Y9ssyWwzD6P//u6e2SxQg5ZZpCaXPpfe/q56iQCvd2eRLrt0Y7hnvwUgGJHfGU7Wumi3B1DGv2pHOW9tOZbCrkUghJkdg1eu8a4UX5v3d3XaP3ZyDZhorIEt9GgZ8/B/kK3GH5lUi+ooXZ7KwxSN/ABQGfjLU9FswW/bi7FD86qp5yDxAHfIS8FqtntJHMSThDSBJ0RChJ+tfnTl5LV6S5ZCqZP/wIdPVZOF8J+2CfNxvyRM3Z04xkIfnF3+2wzUAHlR1x5tfF8j2K7NfsIz/M5H5XVullAgMBAAECggEAV17eyeVoJihiiKeshQhSWpawScxYK9Jok9l/11ItajR35GtjXCc9S2zNT+yyo2V3PoDt+EU8+WZUyZL3+2pAaTJnoxMi8ICMz6eLsie0WchB1visB8fU9zIt35Aq50pURUpZfkEpISv9PfSvu6fBZjdQpV/2G1jp0KWBtdpjJm45/m6IdGDiEV++Zq6UPRBMcTzJ1Xmin1xPbSbyQHNRseJDYeU7LZ+70agzGjA0kdCQQuUbpscHUsYTp19VqwTobln94Jmu+PapE9K9MP2w+XZTi1nXC0y7SkTgkG3xuvoLZKHRR2buMgICtP9/A8p3whWqN9f3msOT/rS+yBsaGQKBgQD9KS5iz/prAG1Hd1WxKEzpBWmNsWJqViKGiOyfTX56b1Pi9aw7+jrArucHNsU/TAe5dUqPyc6MxKJg6FeM0ErHsJzoutayM8GuZ406KQuIGpk1qfDjF617oSyp2OyVaNjC1ec5BjiSG+JOh0qoAOZajU03ew5/pCSUpygda1+s2wKBgQDeACzz8bwpmjOY1nnN2rg7lqk0mQcG73pMy2Et7tQBKDf5UtwCLDgKLtVjWDr3o7ZCu5q2YktAq0HgvnS4+HUsCUGL5aAshwf5oenudVHcCZVYIzPopgDM1k6nNL5gH/yhAx3bnFYrnY2YBBFVjIxmP49oWzBElbMupg1wAlh2vwKBgQDv6Ei3B1TOdfcZVLN2UTShVqmyxzj2gG3zhGqIhI2pRTr/x8TSic2Hr7fsFDFUTJ69V7OzE5GTwPwITeY54WIcXvgzbGvtMDMJLcSeKytsbZhnTIalDlku4YxL4PBCnrtb2A1o8sZFX/tUY82R7Fhf06wrOYiB2XF5Ffdj+c8PJQKBgEPmj9lJLcEXvgJYT0cMR99J9JT23TRc2O5WInIXI1b7QyuKEWrEtZs/udq56MdHln6QvQBdziCIgQzJlA/jRotihV7RrA0Se/j5cgCSd6gycjBUDBNzerksL0BrHHNwNSfWOTKrfZu3g9BkJh0hcOvxMt67TWcc1oJFHcUNopsnAoGAD/eVBP3KANBMpGBV+DWJ43o+pqsgEv0TBz6TlinaaIwNvPmVJz9X+ILpeQcgHTNGMEywgo59u3bkmZw7TIIgd3T+KHyg0dvmjWcX7rVjE1sqmRho1HSk9tU2YG/QvjsGZegNMhVFbzOkz0xq2/dshj3uMcdCch0KwAP1Jbxv8C8=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuTZKX5zBpa8cMqflTUctGZvBO3yImvAc2cx42kx3usR1tueNmH3aMWLbdZRJz0EUTS9jE7N5sh9z0kSdwJDiMhsGdzrlhc4Jwh4oKn5E2taDH4Z6kKPI6obXCCjbT1eIMU1DqS3Z5w8+xJFOWBYziM0zROaxYJJLR0zR1DI1quZEMOa++MNepVot2ktyaQlGz0uXAZzGEyBJSlCBCgPq/ZUzzF4CqOddfN92L+G9hL1KlMK9dVj0Mk1cmHCg9wkROJ2RoaFW1z4MUTA00VsDdP5AcXGd2bGK6SSxeONqPQuRwhKWR8yulMHLOJEfBbGLTVmXpB1xtO5Vhs4kYyE4CwIDAQAB";


    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    //public static String notify_url = "http://localhost:8080/pay/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    //public static String return_url = "http://localhost:8080/pay/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
