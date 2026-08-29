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

import br.edu.iffar.alegrete.bunnybase.model.User;
import br.edu.iffar.alegrete.bunnybase.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController{
      private final UserServices userServices;


public UserController(UserServices userServices){
    this.userServices = userServices;

}

@RequestMapping
public List<User>ListarUsuarios(){  
    return userServices.listarUsuarios();

}

@PostMapping("/{id}")
public ResponseEntity<User> BuscarUsuarioPorId(@PathVariable long id) {
    return userServices.BuscarUsuarioPorId(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build()); 
}

@GetMapping("/{id}")
public ResponseEntity<User> BuscarUsuarioPorIdGet(@PathVariable long id) {
    return userServices.BuscarUsuarioPorId(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build()); 
}

@PostMapping
public ResponseEntity<User> CriarUsuario(@Deprecated @RequestBody User user) {
    return ResponseEntity.ok(userServices.AdicionarUsuario(user));
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> DeletarUsuario(@PathVariable long id) {
     userServices.DeletarUsuario(id);
    return ResponseEntity.noContent().build();

}
}











