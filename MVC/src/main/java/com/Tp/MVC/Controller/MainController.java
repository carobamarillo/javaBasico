package com.Tp.MVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Tp.MVC.Model.DaoLibro;

@Controller
public class MainController {
	
	
	@Autowired 
	private DaoLibro daoLibro;
	
}
