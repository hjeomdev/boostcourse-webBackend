package com.yazbyz.daoexam.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yazbyz.daoexam.config.ApplicationConfig;
import com.yazbyz.daoexam.dao.RoleDao;
import com.yazbyz.daoexam.dto.Role;

public class SelectAllTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
		
		RoleDao roleDao =ac.getBean(RoleDao.class);

		List<Role> list = roleDao.selectAll();
		
		for(Role role: list) {
			System.out.println(role);
		}

	}

}