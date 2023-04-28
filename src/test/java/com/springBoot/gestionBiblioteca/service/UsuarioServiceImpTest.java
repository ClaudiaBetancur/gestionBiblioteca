package com.springBoot.gestionBiblioteca.service;

import com.springBoot.gestionBiblioteca.model.Usuario;
import com.springBoot.gestionBiblioteca.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UsuarioServiceImpTest {

    UsuarioServiceImp usuarioServiceImp;

    UsuarioRepository usuarioRepository;


    @BeforeEach
    void setUp() {

        usuarioRepository = mock(usuarioRepository.getClass());
        when(usuarioRepository.findAll()).thenReturn(Arrays.asList());
    }

    @Test
    void prestarLibro() {

        UsuarioRepository usuarioRepository;
        Usuario registro = usuarioServiceImp.prestarLibro(1, "12345");
        assertEquals("12345", registro);

    }

    @Test
    void buscarConDocumento() {
    }

    @Test
    void prestamos() {
    }

    @Test
    void devolverLibro() {
    }
}