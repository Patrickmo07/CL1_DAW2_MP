package pe.edu.cibertec.app_feign_client1.cliente.dommyjson.isuerservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.cibertec.app_feign_client1.cliente.dommyjson.model.User;

@FeignClient(name = "userClient",
        url = "https://dummy-json.mock.beeceptor.com")
public interface UserClient {

    @GetMapping("/users/{id}")
    User obtenerUsuarioXId(@PathVariable("id") Long id);
    @PostMapping("/users")
    User crearUsuario(@RequestBody User usuario);

}
