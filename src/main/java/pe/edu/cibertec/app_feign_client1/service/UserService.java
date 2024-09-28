package pe.edu.cibertec.app_feign_client1.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_feign_client1.cliente.dommyjson.isuerservice.UserClient;
import pe.edu.cibertec.app_feign_client1.cliente.dommyjson.model.User;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserClient userClient;


    public User obtenerUsuarioXid(Long id){
        return userClient.obtenerUsuarioXId(id);
    }

    public User crearUsuario(User usuario){
        return userClient.crearUsuario(usuario);
    }

}
