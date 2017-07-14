package pe.com.bbva.visitame.dominio.dto;

public class PayloadAccount {

	private String documentNumber;

	private String documentType;

	private String desDocumentType;

	private String captchaResponse;

	private String ipRemote;

	private String codOficina;
	
	private String email;
	
	private String telefono;
	
	private String tipoOperador;

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDesDocumentType() {
		return desDocumentType;
	}

	public void setDesDocumentType(String desDocumentType) {
		this.desDocumentType = desDocumentType;
	}

	public String getCaptchaResponse() {
		return captchaResponse;
	}

	public void setCaptchaResponse(String captchaResponse) {
		this.captchaResponse = captchaResponse;
	}

	public String getIpRemote() {
		return ipRemote;
	}

	public void setIpRemote(String ipRemote) {
		this.ipRemote = ipRemote;
	}

	public String getCodOficina() {
		return codOficina;
	}

	public void setCodOficina(String codOficina) {
		this.codOficina = codOficina;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoOperador() {
		return tipoOperador;
	}

	public void setTipoOperador(String tipoOperador) {
		this.tipoOperador = tipoOperador;
	}

}
