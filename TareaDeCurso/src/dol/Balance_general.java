package dol;

import dal.Almacen;
import misc.controlador;

public class Balance_general extends Estado_financiero{
    public String BG(){
        String text=
	"""
        -------------------------------------------------------------------------------
        ACTIVOS
        ACTIVOS CIRCULANTES
        """+
	controlador.mostrar(a, "activo", "circulante")+"\n"+
	"El total de Activos Circulantes es:"+controlador.Suma(a, "activo", "circulante")+"\n"+
	"ACTIVOS FIJOS\n"+
    controlador.mostrar(a, "activo", "fijo")+"\n"+
    "El total de Activos FIjos es:"+controlador.Suma(a, "activo", "fijo")+"\n"+
    "ACTIVOS DIFERIDOS\n"+
    controlador.mostrar(a, "activo", "diferidos")+"\n"+
    "El total de Activos Diferidos es:"+controlador.Suma(a, "activo", "diferidos")+"\n"+
    "El total de los ACTIVOS es:"+(controlador.Suma(a, "activo", "circulante")+controlador.Suma(a, "activo", "fijo")+ controlador.Suma(a, "activo", "diferidos" ))+"\n"+
    "-------------------------------------------------------------------------------\n"+
	"PASIVOS\n"+
        "PASIVOS CIRCULANTES\n"+
	controlador.mostrar(a, "pasivo", "circulante")+"\n"+
	"El total de pasivos Circulantes es:"+controlador.Suma(a, "pasivo", "circulante")+"\n"+
	"PASIVOS NO CIRCULANTES\n"+
    controlador.mostrar(a, "pasivo", "nocirculante")+"\n"+
    "El total de pasivos no circulantes es:"+controlador.Suma(a, "pasivo", "nocirculante")+"\n"+
    "El total de los PASIVOS es:"+(controlador.Suma(a, "pasivo", "circulante")+controlador.Suma(a, "pasivo", "nocirculante"))+"\n"+
    "El capital contable es :"+((controlador.Suma(a, "activo", "circulante")+controlador.Suma(a, "activo", "fijo")+ controlador.Suma(a, "activo", "diferidos" ))-(controlador.Suma(a, "pasivo", "circulante")+controlador.Suma(a, "pasivo", "nocirculante")));
return text;
    }
@Override
public void realizar() {
    System.out.println(BG());
}
    @Override
    public void Almacenar(){
    Almacen.AlmacenarEstadoFinanciero(BG(), "Balance General");
}
}
