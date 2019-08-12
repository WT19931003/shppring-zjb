package cn.itsource.aigou.client;

import cn.itsource.aigou.client.RedisClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class RedisFall implements RedisClient {

    @Override
    public void setRedis(String key, String value) {

    }

    @Override
    public String getRedis(String key) {
        return null;
    }
}
