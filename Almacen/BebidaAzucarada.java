package poo_marisela.Almacen;

public class BebidaAzucarada extends Bebida {
	private int porcentajeAzucar;
	private boolean promocion;
	
	public BebidaAzucarada() {
		super();
		this.porcentajeAzucar = 0;
		this.promocion = false;
	}

	public int getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(int porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	@Override
	public String toString() {
		return "BebidaAzucarada [porcentajeAzucar=" + porcentajeAzucar +
			   ", promocion=" + promocion + "]";
	}
}
