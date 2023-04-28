package com.springBoot.gestionBiblioteca.service;

import com.springBoot.gestionBiblioteca.model.Libro;
import com.springBoot.gestionBiblioteca.repository.LibroRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;

class LibroServiceImpTest {

    LibroRepository libroRepository;

    LibroServiceImp libroServiceImp;


    @BeforeEach
    void setUp() {

        libroServiceImp = new LibroServiceImp(libroRepository);

        libroRepository = mock((LibroRepository.class));
        when(libroRepository.findAll()).thenReturn(Arrays.asList());
    }

    @Test
    void disponibles() {

        List<Libro> disponibles = libroRepository.disponibles();
        Assertions.assertEquals(1, libroRepository.findById(1));
    }

}