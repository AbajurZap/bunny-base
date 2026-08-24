package br.edu.iffar.alegrete.bunnybase.repository;

import br.edu.iffar.alegrete.bunnybase.model.Bunny;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BunnyRepository extends JpaRepository<Bunny, Long> {
}
