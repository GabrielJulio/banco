package br.eti.gabrieljuliobs.banco.resource;

import br.eti.gabrieljuliobs.banco.domain.Cliente;
import br.eti.gabrieljuliobs.banco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    ClienteService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> buscar(@PathVariable Integer id) {
        Cliente cliente = service.buscar(id);
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("Cliente", cliente);
        map.put("Endereço(s)", cliente.getEnderecos());
        map.put("Conta(s)", cliente.getContas());
        return ResponseEntity.ok().body(map);
    }

}
