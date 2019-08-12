package cn.itsource.aigou.client;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class PageFall implements  PageClient{
    @Override
    public void createPage(Map<String, Object> map) {

    }
}
