package one.digital.gof.service.impl;

import one.digital.gof.model.Cliente;
import one.digital.gof.model.ClienteRepository;
import one.digital.gof.model.Endereco;
import one.digital.gof.model.EnderecoRepository;
import one.digital.gof.service.ClienteService;
import one.digital.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl  implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;
    @Override
    public  Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id){
         Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }
    @Override
    public void inserir(Cliente cliente){
        salvarClienteComCep(cliente);

    }

    @Override
    public void atualizar(Long id,Cliente cliente){
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if( clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }
    }
    @Override
    public void deletar(Long id){
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if( clienteBd.isPresent()) {
            clienteRepository.deleteById(id);
        }

    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        enderecoRepository.findById(cep);
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
