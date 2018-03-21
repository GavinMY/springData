package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.User;

/** 
* @author Gavin 
* @version 创建时间：2018年3月21日 下午12:07:14 
* 类说明 
*/

public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);

    User findByNameAndAge(String name, Integer age);

    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);
}
