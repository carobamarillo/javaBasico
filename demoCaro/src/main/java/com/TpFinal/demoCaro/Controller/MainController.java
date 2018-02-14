package com.TpFinal.demoCaro.Controller;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.TpFinal.demoCaro.Model.DaoEmpleado;
import com.TpFinal.demoCaro.Model.DaoOrdenDeTrabajo;
import com.TpFinal.demoCaro.Model.DaoOrdenRepuesto;
import com.TpFinal.demoCaro.Model.DaoPropietario;
import com.TpFinal.demoCaro.Model.DaoRepuesto;
import com.TpFinal.demoCaro.Model.DaoUsuario;
import com.TpFinal.demoCaro.Model.OrdenDeTrabajo;
import com.TpFinal.demoCaro.Model.OrdenRepuesto;
import com.TpFinal.demoCaro.Model.Propietario;
import com.TpFinal.demoCaro.Model.Usuario;

@Controller
@SessionAttributes("usuario")
public class MainController {
	
	@Autowired
	private DaoEmpleado daoEmpleado;
	
	@Autowired
	private DaoPropietario daoPropietario;
	
	@Autowired
	private DaoRepuesto daoRepuesto;
	
	@Autowired
	private DaoOrdenDeTrabajo daoOrdenDeTrabajo;
	
	@Autowired
	private DaoOrdenRepuesto daoOrdenRepuesto;
	
	@Autowired
	private DaoUsuario daoUsuario;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView login(Model model){
		ModelAndView modelAndView = new ModelAndView();
		if(!model.containsAttribute("usuario")){
			model.addAttribute("usuario", new Usuario());
			modelAndView.setViewName("login");
			return modelAndView;
		}
		ArrayList<OrdenDeTrabajo> listaDeOrdenes = 
				(ArrayList<OrdenDeTrabajo>)(daoOrdenDeTrabajo.findByCerrada(false));
		modelAndView.addObject("ordenesDeTrabajo", listaDeOrdenes);
		modelAndView.addObject("propietarioBusqueda", new Propietario());
		modelAndView.setViewName("paginaPrincipal");
		return modelAndView;
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView loginPost(@ModelAttribute ("usuario") Usuario usuario){
		ModelAndView modelAndView = new ModelAndView();
		Usuario aux = daoUsuario.findByUsuarioAndContrasenia(usuario.getUsuario(), usuario.getContrasenia());
		if(aux != null){
			ArrayList<OrdenDeTrabajo> listaDeOrdenes = 
					(ArrayList<OrdenDeTrabajo>)(daoOrdenDeTrabajo.findByCerrada(false));
			modelAndView.addObject("ordenesDeTrabajo", listaDeOrdenes);
			modelAndView.addObject("propietarioBusqueda", new Propietario());
			modelAndView.setViewName("paginaPrincipal");
			return modelAndView;
		}
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping(value = "/paginaPrincipal", method = RequestMethod.GET)
	public ModelAndView cargarPaginaPrincipal(){
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<OrdenDeTrabajo> listaDeOrdenes = 
					(ArrayList<OrdenDeTrabajo>)(daoOrdenDeTrabajo.findByCerrada(false));
		modelAndView.addObject("ordenesDeTrabajo", listaDeOrdenes);
		modelAndView.addObject("propietarioBusqueda", new Propietario());
		modelAndView.setViewName("paginaPrincipal");
		return modelAndView;
	}
	
	@RequestMapping(value = "detallarOrdenDeTrabajo", method = RequestMethod.GET)
	public ModelAndView detallarOrdenDeTrabajo(@RequestParam ("idOrdenDeTrabajo") long idOrdenDeTrabajo){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("ordenDeTrabajo", daoOrdenDeTrabajo.findOne(idOrdenDeTrabajo));
		modelAndView.setViewName("detalleOrdenDeTrabajo");
		return modelAndView;
	}
	
	@RequestMapping(value = "formularioPropietario", method = RequestMethod.GET)
	public ModelAndView formularioPropietarioGet(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("propietario", new Propietario());
		modelAndView.setViewName("formularioPropietario");
		return modelAndView;
	}
	
	@RequestMapping(value = "nuevoPropietario", method = RequestMethod.POST)
	public ModelAndView nuevoPropietario(@ModelAttribute Propietario propietario){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("empleados", daoEmpleado.findAll());
		OrdenDeTrabajo ordenDeTrabajo = new OrdenDeTrabajo();
		Propietario p = daoPropietario.findByDni(propietario.getDni());
		if(p == null){
			ordenDeTrabajo.setPropietario(propietario);
			daoPropietario.save(propietario);
			modelAndView.addObject("ordenDeTrabajo", ordenDeTrabajo);
			modelAndView.setViewName("formularioOrdenConPropietario");
			return modelAndView;
		}
		modelAndView.addObject("ordenDeTrabajo", new OrdenDeTrabajo());
		modelAndView.addObject("propietarios", daoPropietario.findAll());
		modelAndView.addObject("usuario");
		modelAndView.setViewName("formularioOrdenSinPropietario");
		return modelAndView;
	}
	
	@RequestMapping(value = "formularioOrden", method = RequestMethod.GET)
	public ModelAndView formularioOrdenGet(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("ordenDeTrabajo", new OrdenDeTrabajo());
		modelAndView.addObject("propietarios", daoPropietario.findAll());
		modelAndView.addObject("usuario");
		modelAndView.setViewName("formularioOrdenSinPropietario");
		return modelAndView;
	}
	
	@RequestMapping(value = "modificarOrden", method = RequestMethod.GET)
	public ModelAndView modificarOrdenGet(@RequestParam ("idOrdenDeTrabajo") long idOrdenDeTrabajo){
		ModelAndView modelAndView = new ModelAndView();
		OrdenDeTrabajo ordenDeTrabajo = daoOrdenDeTrabajo.findOne(idOrdenDeTrabajo);
		modelAndView.addObject("ordenDeTrabajo", ordenDeTrabajo);
		modelAndView.addObject("usuario");
		modelAndView.setViewName("modificacionDeOrden");
		return modelAndView;
	}
	
	@RequestMapping(value = "nuevaOrden", method = RequestMethod.POST)
	public ModelAndView nuevaOrden(@ModelAttribute OrdenDeTrabajo ordenDeTrabajo,
					@ModelAttribute ("usuario") Usuario usuarioSesion){
		ModelAndView modelAndView = new ModelAndView();
		Usuario usuario = daoUsuario.findByUsuarioAndContrasenia
					(usuarioSesion.getUsuario(), usuarioSesion.getContrasenia());
		ordenDeTrabajo.setEmpleado(usuario.getEmpleado());
		ordenDeTrabajo.getPropietario().getListaDeOrdenDeTrabajo().add(ordenDeTrabajo);
		ordenDeTrabajo.getEmpleado().getListaDeOrdenDetrabajo().add(ordenDeTrabajo);
		daoOrdenDeTrabajo.save(ordenDeTrabajo);
		daoPropietario.save(ordenDeTrabajo.getPropietario());
		daoEmpleado.save(ordenDeTrabajo.getEmpleado());
		ArrayList<OrdenDeTrabajo> listaDeOrdenes = 
					(ArrayList<OrdenDeTrabajo>)(daoOrdenDeTrabajo.findByCerrada(false));
		modelAndView.addObject("ordenesDeTrabajo", listaDeOrdenes);
		modelAndView.addObject("propietarioBusqueda", new Propietario());
		modelAndView.setViewName("paginaPrincipal");
		return modelAndView;
	}
	
	@RequestMapping(value = "modificarOrden", method = RequestMethod.POST)
	public ModelAndView modificarOrdenPost(@ModelAttribute OrdenDeTrabajo ordenDeTrabajo){
		ModelAndView modelAndView = new ModelAndView();
		daoOrdenDeTrabajo.save(ordenDeTrabajo);
		ArrayList<OrdenDeTrabajo> listaDeOrdenes = 
					(ArrayList<OrdenDeTrabajo>)(daoOrdenDeTrabajo.findByCerrada(false));
		modelAndView.addObject("ordenesDeTrabajo", listaDeOrdenes);
		modelAndView.addObject("propietarioBusqueda", new Propietario());
		modelAndView.setViewName("paginaPrincipal");
		return modelAndView;
	}
	
	@RequestMapping(value = "agregarRepuesto", method = RequestMethod.GET)
	public ModelAndView agregarRepuestoGet(@RequestParam ("idOrdenDeTrabajo") long idOrdenDeTrabajo){
		ModelAndView modelAndView = new ModelAndView();
		OrdenDeTrabajo ordenDeTrabajo = daoOrdenDeTrabajo.findOne(idOrdenDeTrabajo);
		OrdenRepuesto ordenRepuesto = new OrdenRepuesto();
		ordenRepuesto.setOrdenDeTrabajo(ordenDeTrabajo);
		modelAndView.addObject("repuestos", daoRepuesto.findAll());
		modelAndView.addObject("ordenRepuesto", ordenRepuesto);
		modelAndView.setViewName("agregarRepuesto");
		return modelAndView;
	}
	
	@RequestMapping(value = "agregarRepuesto", method = RequestMethod.POST)
	public ModelAndView agrearRepuestoPost(@ModelAttribute OrdenRepuesto ordenRepuesto){
		ModelAndView modelAndView = new ModelAndView();
		OrdenRepuesto o = daoOrdenRepuesto.findByOrdenDeTrabajoAndRepuesto
					(ordenRepuesto.getOrdenDeTrabajo(), ordenRepuesto.getRepuesto());
		if(o != null){
			o.aumentarCantidad(ordenRepuesto.getCantidad());
			o.calcularTotal();
			daoOrdenRepuesto.save(o);
		}else{
			ordenRepuesto.calcularTotal();
			daoOrdenRepuesto.save(ordenRepuesto);
		}
		modelAndView.addObject("ordenDeTrabajo", ordenRepuesto.getOrdenDeTrabajo());
		modelAndView.setViewName("detalleOrdenDeTrabajo");
		return modelAndView;
	}

	@RequestMapping(value = "cerrarOrden", method = RequestMethod.GET)
	public ModelAndView cerrarOrden(@RequestParam ("idOrdenDeTrabajo") long idOrdenDeTrabajo){
		ModelAndView modelAndView = new ModelAndView();
		OrdenDeTrabajo ordenDeTrabajo = daoOrdenDeTrabajo.findOne(idOrdenDeTrabajo);
		ordenDeTrabajo.cerrar();
		daoOrdenDeTrabajo.save(ordenDeTrabajo);
		modelAndView.addObject("ordenDeTrabajo", ordenDeTrabajo);
		modelAndView.setViewName("detalleOrdenDeTrabajo");
		return modelAndView;
	}
	
	@RequestMapping(value = "filtrarOrdenes", method = RequestMethod.POST)
	public ModelAndView filtrarOrdenes(@ModelAttribute Propietario propietarioAux){
		String apellido = propietarioAux.getApellido();
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<OrdenDeTrabajo> listaDeOrdenes = new ArrayList<>();
		ArrayList<Propietario> propietarios = daoPropietario.findByApellido(apellido);
		for(Propietario p : propietarios){
			ArrayList<OrdenDeTrabajo> listaAux = daoOrdenDeTrabajo.findByPropietario(p);
			listaDeOrdenes.addAll(listaAux);
		}
		Collections.sort(listaDeOrdenes);
		modelAndView.addObject("ordenesDeTrabajo", listaDeOrdenes);
		modelAndView.addObject("propietarioBusqueda", new Propietario());
		modelAndView.setViewName("paginaPrincipal");
		return modelAndView;
	}
	
	@RequestMapping(value = "verOrdenesCerradas", method = RequestMethod.GET)
	public ModelAndView verOrdenesCerradas(){
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<OrdenDeTrabajo> listaDeOrdenes = 
				(ArrayList<OrdenDeTrabajo>)(daoOrdenDeTrabajo.findByCerrada(true));
		modelAndView.addObject("ordenesDeTrabajo", listaDeOrdenes);
		modelAndView.addObject("propietarioBusqueda", new Propietario());
		modelAndView.setViewName("paginaPrincipal");
		return modelAndView;
	}
	
	@RequestMapping(value = "cerrarSesion", method = RequestMethod.GET)
	public ModelAndView cerrarSesion(WebRequest request){
		ModelAndView modelAndView = new ModelAndView();
		request.removeAttribute("usuario", WebRequest.SCOPE_SESSION);
		modelAndView.setViewName("login");
		return modelAndView;
	}
}
