package cl.awakelab.sprintM7.web.controller;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.model.domain.dto.MesaDTO;
import cl.awakelab.sprintM7.model.domain.dto.PedidoDTO;
import cl.awakelab.sprintM7.web.service.CamareroService;
import cl.awakelab.sprintM7.web.service.MesaService;
import cl.awakelab.sprintM7.web.service.PedidoService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("/pedido")
public class PedidoController {
private final PedidoService service;
private final CamareroService camareroService;
private final MesaService mesaService;
private final PedidoRestController pedidoRestController;
private final CamareroRestController camareroRestController;
private final MesaRestController mesaRestController;

    public PedidoController(PedidoService service, CamareroService camareroService, MesaService mesaService, PedidoRestController pedidoRestController, CamareroRestController camareroRestController, MesaRestController mesaRestController) {
        this.service = service;
        this.camareroService = camareroService;
        this.mesaService = mesaService;
        this.pedidoRestController = pedidoRestController;
        this.camareroRestController = camareroRestController;
        this.mesaRestController = mesaRestController;
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
    @PostMapping("/up")
    public String saveEditPedido(
            @ModelAttribute PedidoDTO pedidoDTO, @ModelAttribute CamareroDTO camareroDTO, @ModelAttribute MesaDTO mesaDTO,
            Model model, HttpServletRequest request){

        System.out.println(pedidoDTO.getFecha());
        System.out.println(camareroDTO.toString());
        System.out.println(Integer.valueOf(request.getParameter("Id")));
        pedidoDTO.setFecha(Date.valueOf(request.getParameter("fecha")));
        camareroDTO.setId(Integer.valueOf(request.getParameter("Id")));
        mesaDTO.setId(Integer.valueOf(request.getParameter("Id")));
        mesaRestController.update(mesaDTO);
        camareroRestController.update(camareroDTO);
        pedidoRestController.update(pedidoDTO);
        return "redirect:/pedido";
       }
}
