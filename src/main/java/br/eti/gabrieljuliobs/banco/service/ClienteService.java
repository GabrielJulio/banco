package br.eti.gabrieljuliobs.banco.service;

import br.eti.gabrieljuliobs.banco.domain.Cliente;
import br.eti.gabrieljuliobs.banco.repositories.ClienteRepository;
import br.eti.gabrieljuliobs.banco.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repositorio;

    public Cliente buscar(Integer id) {
        Optional<Cliente> cliente = repositorio.findById(id);
        return cliente.orElseThrow(() -> new ObjectNotFoundException("Não foi encontrado nenhum cliente com o id: ID.".replace("ID", Integer.toString(id))));
    }
}
