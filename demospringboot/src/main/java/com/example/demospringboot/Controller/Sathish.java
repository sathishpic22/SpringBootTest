package com.example.demospringboot.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Sathish {
	private int no;
	private String name;
	
	
	public Sathish() {
		super();
	}
	
	public Sathish(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	}
