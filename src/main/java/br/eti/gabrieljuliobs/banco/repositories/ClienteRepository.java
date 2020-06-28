package br.eti.gabrieljuliobs.banco.repositories;

import br.eti.gabrieljuliobs.banco.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
