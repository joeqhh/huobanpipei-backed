package com.joe.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
@TableName("user1")
public class User {
    @TableId(type = IdType.ASSIGN_UUID)
    private int id;
    private String username;
    private String password;
    private Integer money;
    @TableLogic
    private Integer isDelete;
}
