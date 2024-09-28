package pe.edu.cibertec.app_feign_client1.cliente.dommyjson.model;


import lombok.Data;

@Data
public class User {

    private Long id;
    private String firstName;
    private String username;
    private String email;
}
