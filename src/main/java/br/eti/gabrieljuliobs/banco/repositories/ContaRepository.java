package br.eti.gabrieljuliobs.banco.repositories;

import br.eti.gabrieljuliobs.banco.domain.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
}
