package com.Gabriel.DemoOneToManyD.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Gabriel.DemoOneToManyD.Model.Alumno;
import com.Gabriel.DemoOneToManyD.Model.DaoAlumno;
import com.Gabriel.DemoOneToManyD.Model.DaoSede;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class MainController {

	@Autowired
	private DaoSede daoSede;
	
	@Autowired
	private DaoAlumno daoAlumno;
	
	@RequestMapping(value = "/", method = 
			RequestMethod.GET)
	public ModelAndView formularioGet(){
		
		ModelAndView modelAndView = new ModelAndView();
	
		modelAndView.addObject("sedes", daoSede.findAll());
		modelAndView.addObject("alumno", new Alumno());
		modelAndView.setViewName("formulario");
	
		return modelAndView;
	
	}
	
	@RequestMapping(value = "/formulario", 
			method = RequestMethod.POST)
	public ModelAndView formularioPost(@ModelAttribute Alumno alumno){
		
		ModelAndView modelAndView = new ModelAndView();
		
		daoAlumno.save(alumno);
		
		modelAndView.addObject("alu", alumno);
		modelAndView.setViewName("index");
		return modelAndView;

	}
}
