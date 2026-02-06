package com.calcu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//TAREA
//CALCULADORA CON @PathVariable, @RequestParam y @RequestBody

@RestController
public class CalcuController {

    @RequestMapping("/")
    public String root() {
        return "Hola";
    }

    @PostMapping("/prod")
    public String createProduct(@RequestBody Product product) {
        return "Producto recibido: " + product.getName();
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello " + name;
    }
    
    
    @GetMapping("/calcu")
    public String calcuHome() {
    	return "Bienvenido a una calculadora bien basica";
    }

    @GetMapping("/calcu/{oper}/{n1}/{n2}") //SUMA
    public String suma(@PathVariable int n1, @PathVariable int n2) {
			
			int resultado= n1 + n2;
   
        return "Resultado = " + resultado;
    }
    
    
    
    
}
  