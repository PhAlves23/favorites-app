package br.com.fiap.favoritesapp.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.favoritesapp.model.Credencial;
import br.com.fiap.favoritesapp.model.Usuario;
import br.com.fiap.favoritesapp.repository.UsuarioRepository;
import br.com.fiap.favoritesapp.service.TokenService;
import br.com.fiap.favoritesapp.service.UsuarioService;

@RestController
//@RequestMapping("/api/usuarios")
public class UsuarioController {

  @Autowired
  UsuarioService service;

  @Autowired
  UsuarioRepository repository;

  @Autowired
  AuthenticationManager manager;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  TokenService tokenService;


  @PostMapping("/api/registrar")
  public ResponseEntity<Usuario> registrar(@RequestBody @Valid Usuario usuario){
      usuario.setSenha(encoder.encode(usuario.getSenha()));
      repository.save(usuario);
      return ResponseEntity.ok(usuario);
  }

  @PostMapping("/api/login")
  public ResponseEntity<Object> login(@RequestBody Credencial credencial){
      manager.authenticate(credencial.toAuthentication());
      var token = tokenService.generateToken(credencial);
      return ResponseEntity.ok(token);
  }
  





}