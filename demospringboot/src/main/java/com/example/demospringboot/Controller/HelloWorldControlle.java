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
@RestController  
public class HelloWorldControlle {
	
	//jashsgdkijasdghaskdjh
	//rretreterterterter
	@RequestMapping("/")
	public String login() {
	
		return "Welcome to spring boot page...welcome to spring boot ";	
	}
/*@RequestMapping("/Login" )
public String Logsucc(@RequestParam("text1") String i,@RequestParam("text2") String j,Model m) {
	if((i.equals("10"))&&(j.equals("sathish")))
			{
	return "LogSuc.jsp";
	}
	Sathish s1=new Sathish(1,"Sath");
	Sathish s2=new Sathish(2,"Sath1");
	Sathish s3=new Sathish(3,"Sath2");
	Sathish s4=new Sathish(4,"Sath3");
	Sathish s5=new Sathish(5,"Sath4");
	List<Sathish> l=new ArrayList<Sathish>();
	l.add(s1);
	l.add(s2);
	l.add(s3);
	l.add(s4);
	l.add(s5);
m.addAttribute("msg", "The Username or Password you Entered Wrong...");
List<String> listStrings = new LinkedList<String>();
listStrings.add("Five");
listStrings.add("Six");
listStrings.add("Seven");
listStrings.add("Eight");
m.addAttribute("list",listStrings);
	m.addAttribute("slist",l);
	return "Login.jsp";
}
*/

}
