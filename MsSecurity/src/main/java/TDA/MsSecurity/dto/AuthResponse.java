package TDA.MsSecurity.dto;

import java.io.Serializable;
 
public class AuthResponse implements Serializable {

    private final String userName;

    public AuthResponse(String userName) {
        this.userName = userName;    
    }
    
    public String getUserName() {
        return userName;
    }
}
