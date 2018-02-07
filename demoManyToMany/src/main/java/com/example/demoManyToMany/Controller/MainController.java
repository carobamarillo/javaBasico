package com.example.demoManyToMany.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demoManyToMany.model.DaoIngrediente;
import com.example.demoManyToMany.model.DaoReceingre;
import com.example.demoManyToMany.model.DaoReceta;
import com.example.demoManyToMany.model.Ingrediente;
import com.example.demoManyToMany.model.Receingre;
import com.example.demoManyToMany.model.Receta;
import com.example.demoManyToMany.services.Pasos;

@Controller
@SessionAttributes("carritopasos")
public class MainController {
	
	@Autowired
	DaoReceta daoreceta;
	
	@Autowired
	DaoIngrediente daoingrediente;
	
	@Autowired
	DaoReceingre daoreceingre;
	
//	ArrayList<Pasos> listaPasos = new ArrayList<Pasos>();
	
	
	public MainController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value="/nuevareceta", method = RequestMethod.GET)
	public String nuevareceta (Model model)
	{
		Receta rec = new Receta();
		model.addAttribute("receta",rec);
		if(!model.containsAttribute("carritopasos"))
		{
            model.addAttribute("carritopasos", new ArrayList<Pasos>());
        }
		return "nuevareceta";
	}
	
	@RequestMapping(value="/crearreceta", method = RequestMethod.POST)
	public String creareceta (Model model, @ModelAttribute Receta receta,
			@ModelAttribute("carritopasos") ArrayList<Pasos> listaPasos)
			/*,
			@ModelAttribute("carritopasos") ArrayList<Pasos> listaPasos) */
	{
		daoreceta.save(receta);
		System.out.println("id de receta:" + receta.getId());
		model.addAttribute("receta",receta);
		model.addAttribute("listaingredientes",daoingrediente.findAll());
		
		
		 model.addAttribute("carritopasos", listaPasos);
		
		return "listadeingredientes";
	}
	@RequestMapping(value="/agregaingrediente", method = RequestMethod.POST)
	public String agregaingrediente (Model model, @ModelAttribute Receta receta, 
			@RequestParam long idingrediente, @RequestParam int qty,
			@RequestParam String um, @ModelAttribute("carritopasos") ArrayList<Pasos> listaPasos)
	{
		Pasos pas = new Pasos(daoingrediente.findOne(idingrediente),qty,um);
		listaPasos.add(pas);
		
		model.addAttribute("receta",receta);
		model.addAttribute("listaingredientes",daoingrediente.findAll());
		model.addAttribute("carritopasos",listaPasos);
		
		
		
		return "listadeingredientes";
	}
	@RequestMapping(value="/grabarpasosreceta", method = RequestMethod.GET)
	public String grabarpasos (Model model, @RequestParam long id,
			@ModelAttribute("carritopasos") ArrayList<Pasos> listaPasos)
	{
		Receta rec = daoreceta.findOne(id);
		
		for(Pasos pas: listaPasos)
		{ 
			Receingre receingre = new Receingre(rec, pas.getIngrediente(), pas.getQty(), pas.getUm());
			rec.agregoingrediente(receingre);
			
		}
		
		daoreceta.save(rec);
		model.addAttribute("receta",rec);	
		
		return "pasoscreado";
	}
	
	@RequestMapping(value="/crear", method = RequestMethod.GET)
	public String crear (Model model)
	{
		
		Receta receta1 = new Receta("Tarta de Jamon");
		Ingrediente ingrediente1 = new Ingrediente("Jamon","Paladini");
		Ingrediente ingrediente2 = new Ingrediente("Masa","La Salteña");
		
		Receingre receingre1 = new Receingre(receta1,ingrediente1,300,"g");
		Receingre receingre2 = new Receingre(receta1,ingrediente2,600,"g");
		
		receta1.agregoingrediente(receingre1);
		receta1.agregoingrediente(receingre2);
		
		daoreceta.save(receta1);
		
		
		return "home";
	}
	
	

}
