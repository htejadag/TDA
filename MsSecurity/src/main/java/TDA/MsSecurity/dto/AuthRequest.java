package TDA.MsSecurity.dto;

import java.io.Serializable;
 
public class AuthRequest implements Serializable {

    private String username;
    private String password;
 
    public AuthRequest() {
 
    }
 
    public AuthRequest(String usuario, String clave) {
        this.setUsername(usuario);
        this.setPassword(clave);
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String clave) {
        this.password = clave;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String usuario) {
        this.username = usuario;
    }
}

