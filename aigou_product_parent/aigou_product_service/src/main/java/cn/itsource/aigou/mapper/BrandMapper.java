package cn.itsource.aigou.mapper;

import cn.itsource.aigou.domain.Brand;
import cn.itsource.aigou.query.BrandQuery;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 *
 * @author wbtest
 * @since 2019-05-09
 */
public interface BrandMapper extends BaseMapper<Brand> {

    /**
     * 分页查询的总条数
     * @param brandQuery 查询条件
     * @return
     */
    long queryPageCount(BrandQuery brandQuery);


    /**
     * 分页查询的当前页的数据
     * @param brandQuery 查询条件
     * @return
     */
    List<Brand> queryPageList(BrandQuery brandQuery);

}
