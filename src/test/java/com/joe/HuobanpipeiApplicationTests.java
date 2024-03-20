package com.joe;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.joe.domain.User;
import com.joe.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HuobanpipeiApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        //查询
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        lqw.gt(User::getMoney,30).lt(User::getMoney,70);
//        List<User> userList = userMapper.selectList(lqw);

        //分页
//        IPage page = new Page(1,2);
//        IPage iPage = userMapper.selectPage(page, null);
//        System.out.println("当前页码"+iPage.getCurrent());
//        System.out.println("页码大小"+iPage.getSize());
//        System.out.println("---"+iPage.getPages());
//        System.out.println("---"+iPage.getRecords());
//        System.out.println("---"+iPage.getTotal());


        //逻辑删除
//        int i = userMapper.deleteById(3);
//        System.out.println(i);

        User user = new User();
        user.setPassword("sadasd");
        user.setUsername("qiqiqiqiqi");
        userMapper.insert(user);


    }

}
