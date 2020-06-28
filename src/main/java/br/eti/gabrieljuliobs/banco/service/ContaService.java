package br.eti.gabrieljuliobs.banco.service;

import br.eti.gabrieljuliobs.banco.domain.Conta;
import br.eti.gabrieljuliobs.banco.repositories.ContaRepository;
import br.eti.gabrieljuliobs.banco.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContaService {
    @Autowired
    private ContaRepository repositorio;

    public Conta buscar(Integer id) {
        Optional<Conta> conta = repositorio.findById(id);
        return conta.orElseThrow(() -> new ObjectNotFoundException("Não foi encontrado nenhuma conta com o id: ID.".replace("ID", Integer.toString(id))));
    }
}
