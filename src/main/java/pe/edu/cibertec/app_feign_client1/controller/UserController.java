package pe.edu.cibertec.app_feign_client1.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.app_feign_client1.cliente.dommyjson.model.User;
import pe.edu.cibertec.app_feign_client1.service.UserService;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping("/usuario/{id}")
    public User obtenerUsuarioXid(@PathVariable("id")Long id){
return userService.obtenerUsuarioXid(id);
    }
    @PostMapping("/usuario")
    public User crearUsuario(@RequestBody User usuario){
        return userService.crearUsuario(usuario);
    }
}
