package ec.edu.ups.pweb.servicioSoap.bean;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.pweb.servicioSoap.business.AutomovilONLocal;
import ec.edu.ups.pweb.servicioSoap.model.Automovil;

@WebService
public class AutomolesServiceSOAP {
	@Inject
	private AutomovilONLocal automovilesON;
	
	@WebMethod
	public String registrarAuto(String marcaxml) {
		
		return "Auto registrado";
	}
	
	@WebMethod
	public String crearRegistro(Automovil automovil) {
		try {
			automovilesON.insertar(automovil);
			return "Ok";
		} catch (Exception e) {
			// TODO: handle exception
			return "ERROR";
		}
	}
	@WebMethod
	public  List<Automovil> getAutomoviles(){
		return automovilesON.getAutomoviles();
	}
}
