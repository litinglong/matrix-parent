package com.chetax.security.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chetax.security.entity.OauthUserDetails;

public interface OauthUserDetailsMapper{
	  @Select("SELECT id,username,password FROM oauth_user_details WHERE username = #{username}")
	  OauthUserDetails findByUsername(@Param("username") String username);
}