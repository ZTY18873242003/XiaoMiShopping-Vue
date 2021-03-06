package com.zty.xiaomi.server.Dao;

import com.zty.xiaomi.server.Entity.Suggest.SuggestBig;
import com.zty.xiaomi.server.Entity.Suggest.SuggestFoot;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Suggest {

    @Select("select * from goodsuggefoot")
    List<SuggestFoot> getSuggest();

    @Select("select * from goodsuggebig where category_id = #{categoryId}")
    List<SuggestBig> getSuggestBig(int categoryId);
}
