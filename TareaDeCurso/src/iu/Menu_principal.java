package iu;

import dol.Balance_general;
import dol.Estado_resultado;
import misc.controlador;

public class Menu_principal {
private void opciones() {
	System.out.println("Bienvenido :)");
	System.out.println("1- Balance General\n2- Estado de Resultado\n3- Salida ");
	System.out.println("¿Qué tramite desea realizar?");
	
	
}
public void seleccion() {
	int n=2;
	while(n!=3) {
		opciones();
		n=controlador.entero();
		switch(n) {
		case 1:
			Balance_general bal = new Balance_general();
			bal.menu();
			break;
		case 2:
			Estado_resultado er=new Estado_resultado();
			er.menu();
			break;
		case 3:
			System.out.println("Saliendo del programa!");
			break;
		default:
			System.out.println("Opcion invalida.");
			break;
		}
	}
}
}
