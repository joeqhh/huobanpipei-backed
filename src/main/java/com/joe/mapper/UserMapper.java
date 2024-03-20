package com.joe.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.joe.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
