package br.edu.iffar.alegrete.bunnybase.services;

import br.edu.iffar.alegrete.bunnybase.model.Bunny;
import br.edu.iffar.alegrete.bunnybase.repository.BunnyRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class BunnyServices {

    private final BunnyRepository bunnyRepository;

    public BunnyServices(BunnyRepository bunnyRepository) {
        this.bunnyRepository = bunnyRepository;
    }

public List<Bunny> listarCoelhos() {
    return bunnyRepository.findAll();
}


public Optional<Bunny>BuscarCoelhoPorId(long id){
   return bunnyRepository.findById(id);
}

public Bunny AdicionarCoelho(Bunny Bunny){
   return bunnyRepository.save(Bunny);



}

public void DeletarCoelho(Long id){
bunnyRepository.deleteById(id);


}









}











