package br.edu.iffar.alegrete.bunnybase.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iffar.alegrete.bunnybase.model.Bunny;
import br.edu.iffar.alegrete.bunnybase.services.BunnyServices;


@RestController
@RequestMapping("/bunny")
public class BunnyController {
     private final BunnyServices bunnyServices;


     public BunnyController(BunnyServices bunnyServices){
            this.bunnyServices = bunnyServices;
        }
        
@RequestMapping
public List<Bunny>ListarCoelhos(){
    return bunnyServices.listarCoelhos();
}
    
@GetMapping("/{id}")
public ResponseEntity<Bunny> BuscarCoelhoPorId(@PathVariable long id) {
    return bunnyServices.BuscarCoelhoPorId(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());

}

@PostMapping
public Bunny CriarCoelho(@RequestBody Bunny bunny) {
    return bunnyServices.AdicionarCoelho(bunny);
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> DeletarCoelho(@PathVariable long id) {
     bunnyServices.DeletarCoelho(id);
    return ResponseEntity.noContent().build();
}
}