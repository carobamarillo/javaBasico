package com.Tp.MVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Tp.MVC.Model.DaoGenero;
import com.Tp.MVC.Model.DaoLibro;
import com.Tp.MVC.Model.DaoLibroGenero;
import com.Tp.MVC.Model.Libro;
import com.Tp.MVC.Model.LibroGenero;

@Controller
public class MainController {
	
	
	@Autowired 
	private DaoLibro daoLibro;
	
	@Autowired
	private DaoGenero daoGenero;
	
	@Autowired
	private DaoLibroGenero daoLibroGenero;
	
	@RequestMapping(value = "/form",
			method = RequestMethod.GET)
	public ModelAndView crearLibro(){
		
		ModelAndView model = new ModelAndView();
		Libro libro = new Libro();
		
		model.addObject("libro", libro);
		model.addObject("generos", daoGenero.findAll());
		model.setViewName("index");
		
		return model;
		
	}
	
	@RequestMapping(value = "/form",
			method = RequestMethod.POST)
	public ModelAndView crearLibroPost(@ModelAttribute Libro libro){
		
		ModelAndView model = new ModelAndView();
		
		daoLibro.save(libro);
		
		for(Long idGenero : libro.getListaIdsGenero()) {
			
			LibroGenero libroGenero = new LibroGenero();
			libroGenero.setLibro(libro);
			libroGenero.setGenero(daoGenero.findOne(idGenero));
			daoLibroGenero.save(libroGenero);
		}
		model.addObject("lista", daoLibro.findAll());
		model.setViewName("index");
		
		return model;
		
	}
}
