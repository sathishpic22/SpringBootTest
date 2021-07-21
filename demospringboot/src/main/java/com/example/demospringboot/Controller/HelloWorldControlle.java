package com.example.demospringboot.Controller;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demospringboot.Model.Tutorial;
import com.example.demospringboot.Repositary.TutorialRepositary; 
@RestController  
public class HelloWorldControlle {
	
	@Autowired
	TutorialRepositary tutrepo;
	
	@RequestMapping("/")
	public String login() {
	
		return "Welcome to spring boot page...welcome to spring boot lksdjfhalsdkjfhadskjlfhsdjklfasl";	
	}
	
	
	@RequestMapping("/save")
	public void Save() {
		
		Tutorial tut1=new Tutorial();
		
	tut1.setTitle("First");
	tut1.setDescription("First Datbase save");
	tut1.setPublished(true);
	
	tutrepo.save(tut1);
	
	}
	
	


}
