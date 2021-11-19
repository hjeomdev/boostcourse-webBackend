package com.yazbyz.daoexam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yazbyz.daoexam.config.ApplicationConfig;
import com.yazbyz.daoexam.dao.RoleDao;
import com.yazbyz.daoexam.dto.Role;

public class JDBCTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		RoleDao roleDao = ac.getBean(RoleDao.class);
		
		Role role = new Role();
		role.setRoleId(201);
		role.setDescription("PROGRAMMER");
		
//		int count = roleDao.insert(role);
//		System.out.println(count + "건 입력하였습니다.");
			
		int count = roleDao.update(role);
		System.out.println(count +  " 건 수정하였습니다.");
	}

}