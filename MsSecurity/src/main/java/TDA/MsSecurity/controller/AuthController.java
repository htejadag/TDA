package TDA.MsSecurity.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TDA.MsSecurity.model.UsuarioModel;
import TDA.MsSecurity.services.IAuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    IAuthService authService;

    @GetMapping("/getAll")
    public List<UsuarioModel> getAll() {
        return authService.findAll();
    } 
    
    @GetMapping("/getById")
    public UsuarioModel getById(int id) {
        return authService.findById(id);
    }

    @PostMapping("/create")
    public UsuarioModel create(@RequestBody UsuarioModel model) {
        return authService.add(model);
    }

    @PutMapping("/update")
    public UsuarioModel update(@RequestBody UsuarioModel model) {
        return authService.update(model);
    }

    @DeleteMapping("/delete")
    public boolean delete(int id) {
        return authService.delete(id);
    }

}