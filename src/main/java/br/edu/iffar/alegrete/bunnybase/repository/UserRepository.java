package br.edu.iffar.alegrete.bunnybase.repository;

import br.edu.iffar.alegrete.bunnybase.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
