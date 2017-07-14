package pe.com.bbva.visitame.rest;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestHeader;

import pe.com.bbva.visitame.dominio.dto.PayloadAccount;
import pe.com.bbva.visitame.dominio.dto.cuenta.CustomerDetail;
import pe.com.bbva.visitame.exception.NegocioException;
import pe.com.bbva.visitame.exception.SOAPException;
import pe.com.bbva.visitame.exception.ValidacionException;
import javax.servlet.http.*;

@Path("/account")
public interface IVISTServiceAccount {
	
	@GET
	@Path("/getCustomer")
	@Produces({MediaType.APPLICATION_JSON})
	public CustomerDetail getCustomer(
			@QueryParam("documentNumber") String documentNumber,
			@QueryParam("documentType") String documentType,
			@QueryParam("test") String test
			) throws ValidacionException, NegocioException;

	@POST
	@Path("/validarUsuario")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public Map<String, Object> validarUsuario(PayloadAccount account) throws ValidacionException, NegocioException;
	
	@PUT
	@Path("/actualizarDatosContacto")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public Map<String, Object> actualizarDatosContacto(PayloadAccount account) throws ValidacionException, NegocioException;
	
}
