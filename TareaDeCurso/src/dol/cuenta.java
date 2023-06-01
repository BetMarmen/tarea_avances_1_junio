package dol;

public class cuenta {
private double valor;
private String tipo;
private String Nombre;
private String suptipo;
public String getSuptipo() {
	return suptipo;
}
public void setSuptipo(String suptipo) {
	this.suptipo = suptipo;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
@Override
public String toString() {
	return "cuenta [valor=" + valor + ", tipo=" + tipo + ", Nombre=" + Nombre + "]";
}

}
