package com.joe.mapper;

import com.joe.domain.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author qh
* @description 针对表【tag】的数据库操作Mapper
* @createDate 2024-03-01 15:07:14
* @Entity com.joe.domain.Tag
*/
@Mapper
public interface TagMapper extends BaseMapper<Tag> {

}




