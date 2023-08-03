package cl.awakelab.sprintM7.web.controller;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.model.domain.dto.PedidoDTO;
import cl.awakelab.sprintM7.web.service.PedidoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/camarero")
public class PedidoController {
private final PedidoService service;
private final PedidoRestController pedidoRestController;

    public PedidoController(PedidoService service, PedidoRestController pedidoRestController) {
        this.service = service;
        this.pedidoRestController = pedidoRestController;
    }


    @GetMapping
public String listPedidos(Model model){
    List<PedidoDTO> pedidoDTOS = pedidoRestController.findAll().getBody();
    System.out.println(pedidoDTOS);
    model.addAttribute("pedidos",pedidoDTOS);
    return "listPedidos";
}
}
