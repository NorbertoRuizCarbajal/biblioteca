package com.fca.biblioteca.presentation;

import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.domain.LibroDomain;
import org.hibernate.mapping.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LibroController {

    @Autowired
    private LibroDomain libroDomain;

    @RequestMapping(value = "/Libros", method = RequestMethod.GET)
    public List<Libro> librosPorTitulo(@RequestParam String titulo, @RequestParam String edicion) {

        return libroDomain.buscarLibroPorTitulo(titulo, edicion);
    }

}
