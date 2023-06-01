package misc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import dol.cuenta;

public class controlador{
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static String texto() {
	try {
	
	return br.readLine();
	} 
	catch(Exception e) {
		return "Usuario";
	}
	
}
public static String mostrar(ArrayList<cuenta> a,String tipo, String subtipo) {
    String text="";
	for(int i=0;i<a.size();i++) {
	if(a.get(i).getTipo().equals(tipo) & a.get(i).getSuptipo().equals(subtipo))text=text+a.get(i).toString()+"\n";
	}
	return text;
}
public static Double Suma(ArrayList<cuenta> a,String tipo,String subtipo) {
	Double sum=0.0;
	for(int i=0;i<a.size();i++) {
		if(a.get(i).getTipo().equals(tipo) & a.get(i).getSuptipo().equals(subtipo))sum=sum+a.get(i).getValor();
	}
	return sum;
}
public static double decimales() {
	try {
	return Double.parseDouble(br.readLine());
	}catch(Exception e) {
		return 0.0;
	}
}
public static int entero() {
	try {
	return Integer.parseInt(br.readLine());
	}catch (Exception e) {
		return 0;
	}
}
}
