package cn.itsource.aigou.client;

import cn.itsource.aigou.doc.ProductEs;
import cn.itsource.aigou.util.AjaxResult;
import cn.itsource.aigou.util.PageList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@FeignClient(value = "COMMON-PROVIDER", fallback = EsFall.class)
public interface EsClient {

    //上架：写入es
    @RequestMapping(value = "/common/es/save", method = RequestMethod.POST)
    void save(@RequestBody ProductEs t);


    @RequestMapping(value = "/common/es/saveAll", method = RequestMethod.POST)
    void saveAll(@RequestBody List<ProductEs> list);

    //下架：删除es
    @RequestMapping(value = "/common/es/delete", method = RequestMethod.POST)
    void delete(@RequestBody Long id);


    //下架：删除es
   /* @RequestMapping(value = "/es/deleteAll",method = RequestMethod.POST)
     void deleteAll(@RequestBody List<Long> ids);*/

    @RequestMapping(value = "/common/es/queryProductsFromEs", method = RequestMethod.POST)
    PageList<ProductEs> queryProductsFromEs(@RequestBody Map<String, Object> map);


}
