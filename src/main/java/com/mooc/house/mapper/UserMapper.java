package com.mooc.house.mapper;

import com.mooc.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author YangCH
 * create on 2019/4/14
 */
@Mapper
public interface UserMapper {
    List<User> selectUsers();
}
