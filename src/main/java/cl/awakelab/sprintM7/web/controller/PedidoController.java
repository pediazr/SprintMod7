package cl.awakelab.sprintM7.web.controller;

import cl.awakelab.sprintM7.model.domain.dto.PedidoDTO;
import cl.awakelab.sprintM7.web.service.CamareroService;
import cl.awakelab.sprintM7.web.service.PedidoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pedido")
public class PedidoController {
private final PedidoService service;
private final CamareroService camareroService;
private final PedidoRestController pedidoRestController;
private final CamareroRestController camareroRestController;

    public PedidoController(PedidoService service, CamareroService camareroService, PedidoRestController pedidoRestController, CamareroRestController camareroRestController) {
        this.service = service;
        this.camareroService = camareroService;
        this.pedidoRestController = pedidoRestController;
        this.camareroRestController = camareroRestController;
    }


    @GetMapping
public String listPedidos(Model model){
    List<PedidoDTO> pedidos = pedidoRestController.findAll().getBody();
    System.out.println(pedidos);
    model.addAttribute("pedidos",pedidos);
    return "listPedidos";
}
    @GetMapping("/u/{Id}")
    public String editPedido(@PathVariable int Id
            , Model model){
        model.addAttribute("pedido", service.findById(Id).get());
        model.addAttribute("camarero",
                camareroService.findById(service.findById(Id).get().getId()).get());
        model.addAttribute("op","u");
        return "pedido";
    }
}
