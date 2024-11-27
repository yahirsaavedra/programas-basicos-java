package poo_marisela.Almacen;

public class AguaMineral extends Bebida {
	private String origen;

	public AguaMineral() {
		super();
		this.origen = null;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "AguaMineral [origen=" + origen + "]";
	}
	
}
