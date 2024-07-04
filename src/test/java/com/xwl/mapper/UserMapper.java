package com.xwl.mapper;

import com.xwl.pojo.User;

public interface UserMapper {

  /**
   * 根据条件（id）查询用户
   */
  User findByCondition(int id);

}
