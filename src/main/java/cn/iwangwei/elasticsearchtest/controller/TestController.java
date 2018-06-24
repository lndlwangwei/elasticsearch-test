package cn.iwangwei.elasticsearchtest.controller;

import cn.iwangwei.elasticsearchtest.es.domain.EsUser;
import cn.iwangwei.elasticsearchtest.es.service.EsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    EsUserService esUserService;

    @GetMapping("/test")
    public EsUser test() {
        return esUserService.getById(1);
    }
}
