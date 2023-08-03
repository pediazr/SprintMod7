package cl.awakelab.sprintM7.web.controller;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.web.service.CamareroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/camarero")
public class CamareroController {
private final CamareroService service;
private final CamareroRestController camareroRestController;

    public CamareroController(CamareroService service, CamareroRestController camareroRestController) {
        this.service = service;
        this.camareroRestController = camareroRestController;
    }
@GetMapping
public String listCamareros(Model model){
    List<CamareroDTO> camareros = camareroRestController.findAll().getBody();
    System.out.println(camareros);
    model.addAttribute("camareros",camareros);
    return "listVisitas";
}
}
