package cn.itsource.aigou.service;


import cn.itsource.aigou.doc.ProductEs;
import cn.itsource.aigou.util.PageList;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

public interface IEsService  {

    //上架：写入es
    void save( ProductEs t);

    void saveAll( List<ProductEs> list);
    //下架：删除es
    void delete( Long id);

    PageList<ProductEs> queryProductsFromEs( Map<String, Object> map);

}
