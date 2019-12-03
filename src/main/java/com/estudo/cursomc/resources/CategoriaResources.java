package com.estudo.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	 @RequestMapping(method = RequestMethod.GET)
	 public List<Categoria> listar() {
         Categoria c = new Categoria(1,"Teste");
         Categoria c1 = new Categoria(2, "Teste2");
         List<Categoria> Lista  = new ArrayList<>();

         Lista.add(c1);
         Lista.add(c);
         
        return Lista;
	 }

}
