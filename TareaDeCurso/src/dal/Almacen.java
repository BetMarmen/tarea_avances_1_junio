package dal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author HP
 */
public class Almacen {
    public static void AlmacenarEstadoFinanciero(String string,String Archivo){
        File archivo =new File(Archivo+".txt");
        if(!archivo.exists()){
            try{
            archivo.createNewFile();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(string);
            bw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
