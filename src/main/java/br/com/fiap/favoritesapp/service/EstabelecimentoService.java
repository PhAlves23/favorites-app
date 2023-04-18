package br.com.fiap.favoritesapp.service;

import br.com.fiap.favoritesapp.dto.EstabelecimentoDTO;
import br.com.fiap.favoritesapp.dto.UsuarioDTO;
import br.com.fiap.favoritesapp.model.Estabelecimento;
import br.com.fiap.favoritesapp.model.Usuario;
import br.com.fiap.favoritesapp.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository repository;

//    @Transactional(readOnly = true)
//    public List<EstabelecimentoDTO> findAll() {
//        List<Estabelecimento> list = repository.findAll();
//        return list.stream().map(e -> new EstabelecimentoDTO(e)).toList();
//    }

    @Transactional(readOnly = true)
    public Page<EstabelecimentoDTO> findAll(String nome, Pageable pageable) {

        if(nome == null){
            Page<Estabelecimento> estabelecimentos = repository.findAll(pageable);
            return estabelecimentos.map(e -> new EstabelecimentoDTO(e));
        }

        Page<Estabelecimento> estabelecimentos = repository.findByNomeContainingIgnoreCase(nome, pageable);
        return estabelecimentos.map(e -> new EstabelecimentoDTO(e));

    }

    @Transactional(readOnly = true)
    public Page<EstabelecimentoDTO> findByNomeContainingIgnoreCase(String nome, Pageable pageable) {
        Page<Estabelecimento> page = repository.findByNomeContainingIgnoreCase(nome, pageable);
        return page.map(e -> new EstabelecimentoDTO(e));
    }

    @Transactional(readOnly = true)
    public EstabelecimentoDTO findById(Long id){
        var estabelecimento = repository.findById(id).get();
        return new EstabelecimentoDTO(estabelecimento);
    }

    @Transactional
    public EstabelecimentoDTO insert(EstabelecimentoDTO estabelecimentoDTO){
        var estabelecimento = repository.save(new Estabelecimento(estabelecimentoDTO));
        return new EstabelecimentoDTO(estabelecimento);
    }

    @Transactional
    public EstabelecimentoDTO update(Long id, EstabelecimentoDTO estabelecimentoDTO){
        var estabelecimento = repository.getReferenceById(id);
        estabelecimento = repository.save(new Estabelecimento(estabelecimentoDTO));
        return new EstabelecimentoDTO(estabelecimento);
    }

    @Transactional
    public void  delete(Long id){
        repository.deleteById(id);
    }


}
