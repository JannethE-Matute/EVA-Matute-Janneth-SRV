package ec.edu.ups.pweb.servicioSoap.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_Automovil")
public class Automovil implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id	
	@Column(name = "aut_placa")
	private String placa;
	@Column(name = "aut_marca")
	private String marca;
	@Column(name = "aut_modelo")
	private String modelo;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
