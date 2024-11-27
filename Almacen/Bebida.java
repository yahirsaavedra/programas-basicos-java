package poo_marisela.Almacen;

public class Bebida {
	private int id, tamano;
	private String marca, unidadMedida;
	private float precio;
	
	public Bebida() {
		super();
		this.id = 0;
		this.tamano = 0;
		this.marca = null;
		this.unidadMedida = null;
		this.precio = 0.0f;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getTamano() {
		return tamano;
	}
	
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getUnidadMedida() {
		return unidadMedida;
	}
	
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Bebida [id=" + id + ", tamano=" + tamano + ", marca=" + marca +
			   ", unidadMedida=" + unidadMedida + ", precio=" + precio + "]";
	}
}
