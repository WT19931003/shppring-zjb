package cn.itsource.aigou.client;

import cn.itsource.aigou.doc.ProductEs;
import cn.itsource.aigou.util.AjaxResult;
import cn.itsource.aigou.util.PageList;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Component
public class EsFall implements  EsClient{

    @Override
    public void save(ProductEs o) {

    }

    @Override
    public void saveAll(List<ProductEs> list) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public PageList<ProductEs> queryProductsFromEs(Map<String, Object> map) {
        return null;
    }

}
