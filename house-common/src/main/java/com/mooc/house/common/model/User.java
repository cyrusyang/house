package com.mooc.house.common.model;

import lombok.Data;

/**
 * @author YangCH
 * create on 2019/4/15
 */
@Data
public class User {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
