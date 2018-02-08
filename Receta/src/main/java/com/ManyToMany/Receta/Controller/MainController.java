package com.ManyToMany.Receta.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ManyToMany.Receta.Model.DaoIngrediente;
import com.ManyToMany.Receta.Model.DaoReceta;
import com.ManyToMany.Receta.Model.DaoRecetaIng;
import com.ManyToMany.Receta.Model.Receta;
import com.ManyToMany.Receta.Model.RecetaIng;

@Controller
public class MainController {
	
	@Autowired
	private DaoReceta daoReceta;
	
	@Autowired
	private DaoIngrediente daoIngrediente;
	
	@Autowired
	private DaoRecetaIng daoRecetaIng;
	
	
	@RequestMapping(value="/formulario",
			method=RequestMethod.GET)
	public String crearRecetaGet(Model model){
		
		model.addAttribute("receta", new Receta());
		return "formulario";
	}
	
	@RequestMapping(value = "/formulario",
			method = RequestMethod.POST)
	public String crearRecetaPost(Model model,
			@ModelAttribute Receta receta){
		
		daoReceta.save(receta);
		model.addAttribute("lista", daoReceta.findAll());
		
		return "index";
	}
	
	@RequestMapping(value="/listaRecetas",
			method=RequestMethod.GET)
	public String Lista(Model model){
		
		model.addAttribute("lista", daoReceta.findAll());
		
		return "index";
	}
	
	@RequestMapping(value="/ingredientes",
			method=RequestMethod.GET)
	public String agregarIngredientesGet(Model model,
			@RequestParam("idReceta") long idReceta){
	
		Receta receta = daoReceta.findOne(idReceta);
		model.addAttribute("receta", receta);
		model.addAttribute("ingredientes", daoIngrediente.findAll());
		
		return "agregar";
	}
	
	@RequestMapping(value = "/ingredientes",
			method = RequestMethod.POST)
	public String agregarIngredientesPost(Model model,
			@RequestParam("idIngrediente") long idIngrediente,
			@ModelAttribute Receta recetaHTML){
		
			RecetaIng recetaIng = new RecetaIng();
			Receta receta = daoReceta.findOne(recetaHTML.getIdReceta());
			
			recetaIng.setReceta(receta);
			recetaIng.setIngrediente(daoIngrediente.findOne(idIngrediente));
			
			daoRecetaIng.save(recetaIng);
			
			model.addAttribute("lista", daoReceta.findAll());
			
			return "index";
	}
	
	@RequestMapping(value="/detalle", 
			method = RequestMethod.GET)
		public String detalle(Model model){
		
			Receta receta = daoReceta.findOne((long)1);
			model.addAttribute("receta", receta.getListaRecetaIngA());
			
			return "detalle";
	}
	
}
	
	
