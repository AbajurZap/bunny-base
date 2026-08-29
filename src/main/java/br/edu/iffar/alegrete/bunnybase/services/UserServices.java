package br.edu.iffar.alegrete.bunnybase.services;

import br.edu.iffar.alegrete.bunnybase.model.User;
import br.edu.iffar.alegrete.bunnybase.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

public List<User> listarUsuarios() {
    return userRepository.findAll();
}


public Optional<User>BuscarUsuarioPorId(long id){
   return userRepository.findById(id);
}

public User AdicionarUsuario(User user){
   return userRepository.save(user);
}

public void DeletarUsuario(Long id){
userRepository.deleteById(id);


}
}