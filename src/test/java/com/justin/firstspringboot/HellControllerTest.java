package com.justin.firstspringboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author justin-zhu
 * <p>
 * 2022年10月05日 15:41
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FirstSpringbootApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HellControllerTest {
    @LocalServerPort
    private int port;
    private URL base;
    @Autowired
    private TestRestTemplate template;

    @Before
    public void setup() throws MalformedURLException {
        String url =String.format("http://localhost:%d/", port);
        System.out.println(String.format("port is : [%d]",port));
        this.base = new URL(url);
    }

    @Test
    public void test(){
        ResponseEntity<String> response = this.template.getForEntity(
                this.base.toString()+"/test", String.class,"");
        System.out.println(String.format("测试结果为：%s",response.getBody()));

    }
}
