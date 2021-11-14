package b_empresaFloripa;

public enum MarcacionTipo {
	ENTRADA("Entrada"),
	SALIDA("Salida");

	private final String desc;

	private MarcacionTipo(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return desc;
	}
}
