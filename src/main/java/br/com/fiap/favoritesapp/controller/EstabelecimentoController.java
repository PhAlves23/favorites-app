package br.com.fiap.favoritesapp.controller;

import br.com.fiap.favoritesapp.dto.EstabelecimentoDTO;
import br.com.fiap.favoritesapp.dto.UsuarioDTO;
import br.com.fiap.favoritesapp.service.EstabelecimentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/estabelecimentos")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService service;

//    @GetMapping
//    public ResponseEntity<List<EstabelecimentoDTO>> findAll() {
//        List<EstabelecimentoDTO> estabelecimentos = service.findAll();
//        return ResponseEntity.ok().body(estabelecimentos);
//    }

    @GetMapping
    public ResponseEntity<Page<EstabelecimentoDTO>> findAll(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
            @RequestParam(value = "direction", defaultValue = "ASC") String direction,
            @RequestParam(value = "orderBy", defaultValue = "nome") String orderBy,
            @RequestParam(value = "nome", defaultValue = "") String nome
    ) {

        Pageable pageable = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        Page<EstabelecimentoDTO> estabelecimentos = service.findByNomeContainingIgnoreCase(nome, pageable);
        return ResponseEntity.ok().body(estabelecimentos);
    }

    @GetMapping("{id}")
    public ResponseEntity<EstabelecimentoDTO> findById(@PathVariable Long id) {
        EstabelecimentoDTO estabelecimento = service.findById(id);
        return ResponseEntity.ok().body(estabelecimento);
    }

    @PostMapping
    public ResponseEntity<EstabelecimentoDTO> insert(@RequestBody @Valid EstabelecimentoDTO dto) {
        var estabelecimento = service.insert(dto);
        var uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(estabelecimento.id()).toUri();
        // var uri = uriBuilder.path("/api/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(estabelecimento);
    }

    @PutMapping("{id}")
    public ResponseEntity<EstabelecimentoDTO> update(@PathVariable Long id, @RequestBody @Valid EstabelecimentoDTO dto) {
        var estabelecimento = service.update(id, dto);
        return ResponseEntity.ok().body(estabelecimento);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
