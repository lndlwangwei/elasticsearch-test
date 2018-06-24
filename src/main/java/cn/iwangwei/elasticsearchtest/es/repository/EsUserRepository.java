package cn.iwangwei.elasticsearchtest.es.repository;

import cn.iwangwei.elasticsearchtest.es.domain.EsUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface EsUserRepository extends ElasticsearchRepository<EsUser, Integer> {

    List<EsUser> findByUsername(String username);
}
