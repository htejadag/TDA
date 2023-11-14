package TDA.MsSecurity.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import TDA.MsSecurity.model.UsuarioModel;
import TDA.MsSecurity.repository.IAuthRepository;
 
@Service
public class AuthService implements IAuthService {
 
    @Autowired
    IAuthRepository authRepository;

    @Override
    public UsuarioModel add(UsuarioModel model) {
        return authRepository.save(model);
    }

    @Override
    public UsuarioModel update(UsuarioModel model) {
        return authRepository.save(model);
    }

    @Override
    public boolean delete(int id) {        
        authRepository.deleteById(id);
        return true;
    }

    @Override
    public List<UsuarioModel> findAll() {
        return (List<UsuarioModel>) authRepository.findAll();
    }

    @Override
    public UsuarioModel findById(int id) {
        Optional<UsuarioModel> model = authRepository.findById(id);
        return model.get();
    }
    
}