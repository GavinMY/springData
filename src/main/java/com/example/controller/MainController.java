package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserRepository;
import com.example.entity.User;

/** 
* @author Gavin 
* @version 创建时间：2018年3月21日 下午2:20:32 
* 类说明 
*/
@RestController
public class MainController {
	 @Autowired//自动从spring容器中加载userRepository
	 private UserRepository userRepository;
	@RequestMapping("hello")
	@ResponseBody
    public  String addNewUser () {
		User user=new User();
		user.setName("yuanyuan");
		user.setAge(20);
		userRepository.save(user);
        return "Saved";
    }
}
