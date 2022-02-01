package ec.edu.ups.pweb.servicioSoap.business;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.pweb.servicioSoap.model.Automovil;

@Local
public interface AutomovilONLocal {
	public void insertar(Automovil a) throws Exception;
	public List<Automovil> getAutomoviles();
	public Automovil buscarautomovil(String placa) throws Exception;
	public void guardar(Automovil a) throws Exception;
	public Automovil getAutomovil(String placa) throws Exception;
}
