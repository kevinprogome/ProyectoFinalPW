package com.registro.usuarios.controlador.dto;

public class UsuarioRegistroDTO {

	private Long id;
	private String nombre;
	private String apellido;
	private String candidato;
	private String email;
	private String password;
	private Integer votos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCandidato() {
		return candidato;
	}

	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}

	public Integer getVotos() {
		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public UsuarioRegistroDTO(String nombre, String apellido, String candidato, String email, String password,
			Integer votos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.candidato = candidato;
		this.email = email;
		this.password = password;
		this.votos = votos;
	}

	public UsuarioRegistroDTO() {

	}

}
