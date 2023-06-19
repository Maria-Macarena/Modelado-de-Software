package modelado.com.Parcial.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modelado.com.Parcial.dao.IPersonaDao;
import modelado.com.Parcial.entity.Persona;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	@Autowired
public IPersonaDao personaDao;
	
	
	@GetMapping("mensaje")
	public String mensaje() {

		return "Hola mundo";
	}

	@GetMapping
	public List<String> listarPersonas() {

		return List.of("Viviana", "Ricardo", "Pablo");
	}

	@GetMapping("/v2")
	public Persona listarUsuarios() {

		Persona p = new Persona();
		p.setId(22);
		p.setNombre("Guadalupe");
		p.setApellido("Jacobi");
		p.setTelefono("265658889");
		p.setEmail("becka@gmail.com");
		p.setPassword("becka=)");

		return p;
	}

	
	@GetMapping( "/{id}")
	public Persona getUsuario(@PathVariable Long id) {

		Persona p = new Persona();
		
		p.setId(5);
		p.setNombre("Amparo");
		p.setApellido("Padilla");
		p.setTelefono("265143247");
		p.setEmail("ampi@gmail.com");
		p.setPassword("123*=)");

		return p;
	}
	
	
	@GetMapping("/lista")
	public List<Persona> listarVariasPersonas() {

         
          List<Persona> ps = new ArrayList<>();
          
          Persona p = new Persona();
          Persona p1 = new Persona();
		
		p.setId(3);
		p.setNombre("Ana");
		p.setApellido("kaiser");
		p.setTelefono("26516988");
		p.setEmail("muma@gmail.com");
		p.setPassword("9510=)");
		
		p1.setId(9);
		p1.setNombre("Victorina");
		p1.setApellido("Fredes");
		p1.setTelefono("265148957");
		p1.setEmail("victorina@gmail.com");
		p1.setPassword("casaFredes");
		
		ps.add(p);
		ps.add(p1);

		return ps;
	}
	
	@GetMapping("/listas")
	public List<Persona> getUsuario(){

		List<Persona> user = personaDao.obtenerPersona();
		return user;
	}
	

}
