package ec.edu.ups.pweb.EVA_MatuteJanneth_SRV.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pweb.EVA_MatuteJanneth_SRV.dao.AutomovilDAO;
import ec.edu.ups.pweb.EVA_MatuteJanneth_SRV.model.Automovil;

@Stateless
public class AutomovilON implements AutomovilONRemote, AutomovilONLocal{
	@Inject
	private AutomovilDAO automovilDAO;
	public void insertar(Automovil a) throws Exception{
		
		automovilDAO.insert(a);	
	}
	public void actualizarAutomovil(Automovil automovil) throws Exception {
		automovilDAO.update(automovil);
	}
	public List<Automovil> getAutomoviles(){
		return automovilDAO.getList();
	}
	
	public Automovil buscarautomovil(String placa) throws Exception{
		return automovilDAO.read(placa);
	}
	public void guardar(Automovil a) throws Exception {
		if (automovilDAO.read(a.getPlaca()) == null)
			automovilDAO.insert(a);
		else
			automovilDAO.update(a);
	}
	public Automovil getAutomovil(String placa) throws Exception {
		return automovilDAO.read(placa);
	}
}
