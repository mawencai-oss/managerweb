package com.qf;

import com.qf.domain.DrugMsg;
import com.qf.sevice.Esservice;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestEs {
    @Autowired
    Esservice esservice;
    @Test
    public void test(){
        esservice.insert(new DrugMsg());
    }
}
