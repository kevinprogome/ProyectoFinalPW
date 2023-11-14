package com.registro.usuarios.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.registro.usuarios.servicio.UsuarioServicio;

@Controller
public class RegistroControlador {

	@Autowired
	private UsuarioServicio servicio;

	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}

	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		// Calcular la suma de votos para el candidato Amin
		int sumaVotosAmin = servicio.calcularSumaVotos("Amin");
		modelo.addAttribute("sumaVotosAmin", sumaVotosAmin);
		
		int sumaVotosDagoberto = servicio.calcularSumaVotos("Dagoberto");
		modelo.addAttribute("sumaVotosDagoberto", sumaVotosDagoberto);
		
		int sumaVotosCasagua = servicio.calcularSumaVotos("Casagua");
		modelo.addAttribute("sumaVotosCasagua", sumaVotosCasagua);
		
		int sumaVotosChicho = servicio.calcularSumaVotos("Chicho");
		modelo.addAttribute("sumaVotosChicho", sumaVotosChicho);
		
		int sumaVotosBotello = servicio.calcularSumaVotos("Botello");
		modelo.addAttribute("sumaVotosBotello", sumaVotosBotello);
		
		int sumaVotosJorge = servicio.calcularSumaVotos("Jorge");
		modelo.addAttribute("sumaVotosJorge", sumaVotosJorge);
		
		int sumaVotosWilker = servicio.calcularSumaVotos("Wilker");
		modelo.addAttribute("sumaVotosWilker", sumaVotosWilker);
		
		int sumaVotosWilmar = servicio.calcularSumaVotos("Wilmar");
		modelo.addAttribute("sumaVotosWilmar", sumaVotosWilmar);
		
		int sumaVotosYilber = servicio.calcularSumaVotos("Yilber");
		modelo.addAttribute("sumaVotosYilber", sumaVotosYilber);
		
		



		return "index";
	}

}
