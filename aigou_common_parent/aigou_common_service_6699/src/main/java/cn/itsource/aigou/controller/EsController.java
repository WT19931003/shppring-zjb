package cn.itsource.aigou.controller;

import cn.itsource.aigou.client.EsClient;
import cn.itsource.aigou.doc.ProductEs;
import cn.itsource.aigou.service.IEsService;
import cn.itsource.aigou.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/common/es")
public class EsController implements EsClient{

    @Autowired
    private IEsService esService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @Override
    public void save(@RequestBody ProductEs t) {

        esService.save(t);
    }

    @RequestMapping(value = "/saveAll",method = RequestMethod.POST)
    @Override
    public void saveAll(@RequestBody List<ProductEs> list)    {

        esService.saveAll(list);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @Override
    public void delete(@RequestBody Long id) {
        esService.delete(id);

    }


    @RequestMapping(value = "/queryProductsFromEs", method = RequestMethod.POST)
    @Override
    public PageList<ProductEs> queryProductsFromEs(@RequestBody Map<String, Object> map) {
        return esService.queryProductsFromEs(map);
    }


}
