package cn.itsource.aigou.repository;

import cn.itsource.aigou.doc.ProductEs;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository  // controller  repository  service  component?区别
public interface EsRepository extends ElasticsearchRepository<ProductEs,Long> {
}
