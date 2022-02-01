package ec.edu.ups.pweb.EVA_MatuteJanneth_SRV.business;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.pweb.EVA_MatuteJanneth_SRV.model.Automovil;

@Remote
public interface AutomovilONRemote {
	public void insertar(Automovil a) throws Exception;
	public List<Automovil> getAutomoviles();
	public Automovil buscarautomovil(String placa) throws Exception;
}
