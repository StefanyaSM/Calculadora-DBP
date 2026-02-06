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

    
    //SUMA
    @GetMapping("/calcu/suma/{n1}/{n2}") 
    public String suma(@PathVariable int n1, @PathVariable int n2) {
			
			int Rsuma= n1 + n2;
   
        return "Resultado de sumar= " + n1 + "+" + n2 + " = " + Rsuma;
    }
    
    //RESTA
    @GetMapping("/calcu/resta/{n1}/{n2}")
    public String resta(@PathVariable int n1, @PathVariable int n2) {
			
			int Rresta= n1 - n2;
   
        return "Resultado de restar =" + n1 + "-" + n2 + "="+ Rresta;
    }
    
  //MULTIPLICACION
    @GetMapping("/calcu/multi/{n1}/{n2}")
    public String multi(@PathVariable int n1, @PathVariable int n2) {
			
			int Rmulti= n1 * n2;
   
        return "Resultado de multiplicar =" + n1 + "*" + n2 +"="+ Rmulti;
    }
    
    
}
  