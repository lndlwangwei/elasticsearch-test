package cn.iwangwei.elasticsearchtest.es.service.impl;

import cn.iwangwei.elasticsearchtest.es.domain.EsUser;
import cn.iwangwei.elasticsearchtest.es.repository.EsUserRepository;
import cn.iwangwei.elasticsearchtest.es.service.EsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EsUserserviceImpl implements EsUserService {

    @Autowired
    private EsUserRepository esUserRepository;

    @Override
    public EsUser getById(int id) {
       return esUserRepository.findById(id).orElse(null);
    }

    public List<EsUser> getUsers() {
        return esUserRepository.findByUsername("wangwei");
    }

    static class A implements Iterable {
        @Override
        public Iterator iterator() {
            return null;
        }
    }

    public static void main(String[] args) {
        A a = new A();
        for (Object o : a) {

        }
    }
}
