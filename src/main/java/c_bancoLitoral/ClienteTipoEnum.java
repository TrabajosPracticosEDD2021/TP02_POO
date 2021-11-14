package c_bancoLitoral;

public enum ClienteTipoEnum {
	PERSONA("Persona"),
	COMERCIO("Comercio"),
	EMPRESA("Empresa de construccion");
	
	private final String desc;

	private ClienteTipoEnum(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return desc;
	}
}
