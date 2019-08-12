package cn.itsource.ttt;

import cn.itsource.aigou.CommonApplication6699;
import cn.itsource.aigou.doc.ProductEs;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilter;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommonApplication6699.class)
public class EsTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


    @Test
    public void testInit() throws Exception {

        //1：创建索引
        elasticsearchTemplate.createIndex(ProductEs.class);

        //2:做映射
        elasticsearchTemplate.putMapping(ProductEs.class);
    }


}
