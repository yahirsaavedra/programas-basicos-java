package poo_marisela.Almacen;

import java.util.Arrays;

public class VectorBebida {
	private BebidaAzucarada[] almacen;
	private int ultimo;
	
	public VectorBebida(BebidaAzucarada[] almacen, int ultimo) {
		super();
		this.almacen = almacen;
		this.ultimo = ultimo;
	}
	public BebidaAzucarada[] getAlmacen() {
		return almacen;
	}
	public void setAlmacen(BebidaAzucarada[] almacen) {
		this.almacen = almacen;
	}
	public int getUltimo() {
		return ultimo;
	}
	public void setUltimo(int ultimo) {
		this.ultimo = ultimo;
	}
	@Override
	public String toString() {
		return "VectorBebida [almacen=" + Arrays.toString(almacen) + ", ultimo=" + ultimo + "]";
	}
	public void agregarProducto(Bebida newProducto) {
		ultimo++;
		newProducto.setId(ultimo + 1);
		almacen[ultimo] = newProducto;
	}
	public String mostrarProducto() {
		String info = "DATOS REGISTRADOS EN EL ALMACEN\n";
		for (int i = 0; i <= ultimo; i++) 
		{
			info += almacen[i].toString() + "\n"; 
		}
		return info;
	}
	public void eliminarProducto(Bebida eliminarProducto) {
		
	}
	public float precioTodasBebidas() {
		float precio = 0.0f;
		for (int i = 0; i <= ultimo; i++) {
			precio = precio + almacen[i].getPrecio(); 
		}
		return precio;
	}
	public float precioTotalMarca(String marca) {
		float precio = 0.0f;
		for (int i = 0; i <= ultimo; i++) {
			if (almacen[i].getMarca().equalsIgnoreCase(marca)) {
				precio = precio + almacen[i].getPrecio();
			}
		}
		return precio;
	}
	public float precioTotalEstante(String tipoEstante) {
		float precio = 0.0f;
		for (int i = 0; i <= ultimo; i++) {
			if (almacen[i].getMarca().equalsIgnoreCase(tipoEstante)) { //CORREGIR AQUI
				precio = precio + almacen[i].getPrecio();
			}
		}
		return precio;
	
	}
}
