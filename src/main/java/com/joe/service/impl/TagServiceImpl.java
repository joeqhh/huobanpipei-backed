package com.joe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.joe.domain.Tag;
import com.joe.service.TagService;
import com.joe.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author qh
* @description 针对表【tag】的数据库操作Service实现
* @createDate 2024-03-01 15:07:14
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




