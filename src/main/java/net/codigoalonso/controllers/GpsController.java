package net.codigoalonso.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GpsController {
	
    @RequestMapping(value = "/")
    public String home(Model model) {        
        return "index";
    }
	
	@RequestMapping("/index")
	public String index(Model model) {
		
		/*GenericDao<Curriculum> daoCurriculum = new GenericDao<Curriculum>(Curriculum.class);
		
		List<Curriculum> lista = daoCurriculum.ListaFiltroString("Sob","nome");
		
		model.addAttribute("sob",lista.get(0).getDescricao());
		
		model.addAttribute("tela", "Index");*/
		
		return "index";
	}

	@RequestMapping("/resume")
	public String resume(Model model) {
		model.addAttribute("tela", "Resumo");
		return "resume";
	}

	@RequestMapping("/estudos")
	public String estudos(Model model) {
		model.addAttribute("tela", "Estudos");
		return "estudos";
	}

	@RequestMapping("/contacts")
	public String contacts(Model model) {
		model.addAttribute("tela", "Contato");
		return "contacts";
	}
}
