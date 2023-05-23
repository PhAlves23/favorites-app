package br.com.fiap.favoritesapp.config;


import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import br.com.fiap.favoritesapp.model.Avaliacao;
import br.com.fiap.favoritesapp.model.Categoria;
import br.com.fiap.favoritesapp.model.Estabelecimento;
import br.com.fiap.favoritesapp.repository.AvaliacaoRepository;
import br.com.fiap.favoritesapp.repository.EstabelecimentoRepository;
import br.com.fiap.favoritesapp.repository.CategoriaRepository;

public class DatabaseSeeder  implements CommandLineRunner{
    
    @Autowired
    AvaliacaoRepository  avaliacaoRepository;
    
    @Autowired
    EstabelecimentoRepository estabelecimentoRepository;

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public void run(String... args) throws Exception {
        seedData();
    }

    private void seedData() {
        Categoria categoria1 = new Categoria();
        categoria1.setNome("Categoria 1");
        categoriaRepository.save(categoria1);

        Categoria categoria2 = new Categoria();
        categoria2.setNome("Categoria 2");
        categoriaRepository.save(categoria2);

        Estabelecimento estabelecimento1 = new Estabelecimento();
        estabelecimento1.setNota(4.5f);
        estabelecimento1.setNome("Estabelecimento 1");
        estabelecimento1.setSite("www.estabelecimento1.com");
        estabelecimento1.setLogradouro("Rua 1");
        estabelecimento1.setContato("contato1@estabelecimento.com");
        estabelecimento1.setEndereco("Endereço 1");
        estabelecimento1.setDescricao("Descrição do Estabelecimento 1");
        estabelecimento1.setHorarioFuncionamento(LocalDateTime.now());
        estabelecimento1.getCategorias().add(categoria1);
        estabelecimentoRepository.save(estabelecimento1);

        Estabelecimento estabelecimento2 = new Estabelecimento();
        estabelecimento2.setNota(3.8f);
        estabelecimento2.setNome("Estabelecimento 2");
        estabelecimento2.setSite("www.estabelecimento2.com");
        estabelecimento2.setLogradouro("Rua 2");
        estabelecimento2.setContato("contato2@estabelecimento.com");
        estabelecimento2.setEndereco("Endereço 2");
        estabelecimento2.setDescricao("Descrição do Estabelecimento 2");
        estabelecimento2.setHorarioFuncionamento(LocalDateTime.now());
        estabelecimento2.getCategorias().add(categoria2);
        estabelecimentoRepository.save(estabelecimento2);

        Avaliacao avaliacao1 = new Avaliacao();
        avaliacao1.setUsuarioId(1L);
        avaliacao1.setCategoriaId(1L);
        avaliacao1.setNota(5);
        avaliacao1.setData(LocalDateTime.now().toLocalDate());
        avaliacao1.setComentario("Comentário da avaliação 1");
        avaliacao1.setEstabelecimento(estabelecimento1);
        avaliacaoRepository.save(avaliacao1);

        Avaliacao avaliacao2 = new Avaliacao();
        avaliacao2.setUsuarioId(2L);
        avaliacao2.setCategoriaId(2L);
        avaliacao2.setNota(4);
        avaliacao2.setData(LocalDateTime.now().toLocalDate());
        avaliacao2.setComentario("Comentário da avaliação 2");
        avaliacao2.setEstabelecimento(estabelecimento2);
        avaliacaoRepository.save(avaliacao2);
    }
}
