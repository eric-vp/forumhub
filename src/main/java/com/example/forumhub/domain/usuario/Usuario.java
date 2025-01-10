package com.example.forumhub.domain.usuario;

import com.example.forumhub.domain.perfil.Perfil;

import java.util.List;

public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private List<Perfil> perfis;
}
