package com.springBoot.gestionBiblioteca.service;

import com.springBoot.gestionBiblioteca.repository.PrestamoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PrestamoServiceImpTest {

    PrestamoRepository prestamoRepository;

    PrestamoServiceImp prestamoServiceImp;

    @BeforeEach
    void setUp() {
        prestamoRepository = mock(PrestamoRepository.class);
        when(prestamoRepository.findAll()).thenReturn(Arrays.asList());
    }

    @Test
    void registro() {
    }

    @Test
    void prestamosUsuario() {
    }

    @Test
    void eliminarPrestamo() {
    }


}