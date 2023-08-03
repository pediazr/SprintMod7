package cl.awakelab.sprintM7.web.controller;

import cl.awakelab.sprintM7.model.domain.dto.CamareroDTO;
import cl.awakelab.sprintM7.model.domain.dto.PedidoDTO;
import cl.awakelab.sprintM7.web.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedido")
public class PedidoRestController {
    private final PedidoService service;

    public PedidoRestController(PedidoService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<PedidoDTO>> findAll() {
        return service.findAll().map(pedidoDTOS -> new ResponseEntity<>(pedidoDTOS,
                        HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/create")
    public ResponseEntity<PedidoDTO> create(@RequestBody PedidoDTO pedidoDTO){
        return service.create(pedidoDTO)
                .map(t-> new ResponseEntity<>(t, HttpStatus.CREATED))
                .orElse(new ResponseEntity<>(HttpStatus.CONFLICT));
    }
    @PatchMapping("/update")
    public ResponseEntity<PedidoDTO> update(@RequestBody PedidoDTO pedidoDTO){
        return service.update(pedidoDTO)
                .map(t -> new ResponseEntity<>(t, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable int id){
        return new ResponseEntity<Boolean>(service.delete(id), HttpStatus.OK);
    }
}
