package ec.edu.ups.pweb.servicioSoap.business;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.pweb.servicioSoap.model.Automovil;

@Remote
public interface AutomovilONRemote {
	public void insertar(Automovil a) throws Exception;
	public List<Automovil> getAutomoviles();
	public Automovil buscarautomovil(String placa) throws Exception;
}
