package dol;

import misc.controlador;


public class Estado_resultado extends Estado_financiero {
	
        @Override
	public void realizar() {
		Double e1,e2,e3,e4;
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Ventas Totales: "+controlador.Suma(a, "venta", "total"));
		System.out.println("DEVOLUCIONES S/V: "+controlador.Suma(a, "devolucion", "venta"));
		System.out.println("REBAJAS S/V: "+controlador.Suma(a, "rebaja", "venta"));
		System.out.println("DESCUENTO S/V: "+controlador.Suma(a, "descuento", "venta"));
		e1=(controlador.Suma(a, "venta", "total")-controlador.Suma(a, "devolucion", "venta"))-controlador.Suma(a, "rebaja", "venta")-controlador.Suma(a, "descuento", "venta");
		System.out.println("VENTAS NETAS: "+e1);
		System.out.println("INVENTARIO INICIAL: "+controlador.Suma(a, "inventario", "inicial"));
		System.out.println("COMPRAS TOTALES: "+controlador.Suma(a, "compra", "total"));
		System.out.println("DEVOLUCIONES S/C: "+controlador.Suma(a, "devolucion", "compra"));
		System.out.println("REBAJAS S/C: "+controlador.Suma(a, "rebaja", "compra"));
		System.out.println("DESCUENTO S/C: "+controlador.Suma(a, "descuento", "compra"));
		e2=controlador.Suma(a, "compra", "total")+controlador.Suma(a, "devolucion", "compra")+controlador.Suma(a, "rebaja", "compra")+controlador.Suma(a, "descuento", "compra");
		System.out.println("COMPRAS NETAS: "+e2);
		System.out.println("INVENTARIO FINAL: "+controlador.Suma(a, "inventario", "final"));
		e3=e1-(e2+controlador.Suma(a, "inventario", "inicial")-controlador.Suma(a, "inventario", "final"));
		System.out.println("UTILIDAD/PERDIDA BRUTA: "+e3);
		System.out.println("GASTOS DE OPERACION");
		controlador.mostrar(a, "gasto", "venta");
		System.out.println("TOTAL DE GASTOS DE VENTA: "+controlador.Suma(a, "gasto", "venta"));
		controlador.mostrar(a, "gasto", "administracion");
		System.out.println("TOTAL DE GASTOS DE ADMINISTRACION: "+controlador.Suma(a, "gasto", "administracion"));
		controlador.mostrar(a, "gasto", "financiero");
		System.out.println("TOTAL DE GASTOS FINANCIEROS: "+controlador.Suma(a, "gasto", "financiero"));
		e4=controlador.Suma(a, "gasto", "financiero")+controlador.Suma(a, "gasto", "venta")+controlador.Suma(a, "gasto", "administracion");
		System.out.println("TOTALIDAD GASTOS DE OPERACION: "+e4);
		System.out.println("UTILIDAD/PERDIDA ANTES DE IR: "+(e3-e4));
		if(0<(e3-e4)) {
		System.out.println("IR 30%: "+((e3-e4)*0.3));
		System.out.println("UTILIDAD DESPUES DE IR: "+((e3-e4)-((e3-e4)*0.3)));
		}
		System.out.println("-------------------------------------------------------------------------------");
	}
}
