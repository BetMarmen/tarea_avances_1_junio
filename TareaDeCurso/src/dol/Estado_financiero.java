package dol;

import java.util.ArrayList;

import misc.controlador;

public class Estado_financiero {
    public void Almacenar(){}
	public void realizar(){}
	ArrayList <cuenta> a=new ArrayList <cuenta> ();
	public cuenta datos() {
		cuenta c = new cuenta();
		
		System.out.println("Ingrese el tipo de cuenta que desee ingresar");
		c.setTipo(controlador.texto().toLowerCase());
		System.out.println("Ingrese la sub-categoria de cuenta: ");
		c.setSuptipo(controlador.texto().toLowerCase());
		System.out.println("Ingrese el nombre de la cuenta");
		c.setNombre(controlador.texto().toLowerCase());
		System.out.println("Ingrese el valor de dicha cuenta");
		c.setValor(controlador.decimales());
		return c;
	}
	public void menu() {
		int opc=1;
		while(opc!=6) 
		{
			
			opciones();
			opc=controlador.entero();
			switch(opc) {
			case 1:
				a.add(datos());//agrega datos al arrayList
				break;
			case 2:
				editar();
				break;
			case 3:
				eliminar();
				break;
			case 4:
				realizar();
				break;
			case 5:
                            Almacenar();
				break;
                        case 6:
                            System.out.println("Regresando al menu principal.");
                            break;
			default:
				break;
			}
			
		}
	}
	public void editar() {
		System.out.println("¿Que numero de  cuenta desea editar?");
		int n1=controlador.entero();//elemento que queres editar
		if(n1<a.size() & -1<n1)a.set(n1, datos());//remplazamos el valor
	}
	public void eliminar() {
		System.out.println("¿Que numero de  cuenta desea eliminar?");
		int n1=controlador.entero();
		if(n1<a.size()& -1<n1) a.remove(n1);
		}
	public void opciones() {
		System.out.println("1- Agregar cuenta \n2- Editar cuenta \n3- Eliminar cuenta\n4- Realizar\n5- Almacenar\n6- Salir");
		System.out.println("Ingrese la opcion a realizar:");
		
	}
}
