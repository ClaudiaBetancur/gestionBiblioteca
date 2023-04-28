package com.springBoot.gestionBiblioteca;

import com.springBoot.gestionBiblioteca.model.Libro;
import com.springBoot.gestionBiblioteca.repository.LibroRepository;
import com.springBoot.gestionBiblioteca.repository.PrestamoRepository;
import com.springBoot.gestionBiblioteca.repository.UsuarioRepository;
import com.springBoot.gestionBiblioteca.service.LibroServiceImp;
import com.springBoot.gestionBiblioteca.service.PrestamoServiceImp;
import com.springBoot.gestionBiblioteca.service.UsuarioServiceImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

@SpringBootTest
class GestionBibliotecaApplicationTests {

	LibroRepository libroRepository;
	UsuarioRepository usuarioRepository;
	PrestamoRepository prestamoRepository;

	UsuarioServiceImp usuarioServiceImp;
	LibroServiceImp libroServiceImp;
	PrestamoServiceImp prestamoServiceImp;


	@BeforeEach
	void setUp() {
		libroRepository = mock(libroRepository.getClass());
		when(libroRepository.findAll()).thenReturn(Arrays.asList());

		usuarioRepository = mock(usuarioRepository.getClass());
		when(usuarioRepository.findAll()).thenReturn(Arrays.asList());

		prestamoRepository = mock(prestamoRepository.getClass());
		when(prestamoRepository.findAll()).thenReturn(Arrays.asList());

		libroServiceImp = new LibroServiceImp(libroRepository);
		usuarioServiceImp = new UsuarioServiceImp(usuarioRepository);
		prestamoServiceImp = new PrestamoServiceImp(prestamoRepository);
	}



	@Test
	void disponibles() {
		List<Libro> disponibles = libroRepository.disponibles();
		Assertions.assertEquals(1, libroRepository.findById(1));
	}


}
