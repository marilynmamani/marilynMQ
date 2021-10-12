package crudvector01;

import java.util.ArrayList;
import java.util.Vector;

public class MetodosSistema {
    public ArrayList<DatosPersona> listaA=new ArrayList();
    public Vector lista= new Vector();
    
    public void registrarPersona(Object x){
        lista.add(x);
    }
    public void registrarPersonaLista(DatosPersona x){
        listaA.add(x);
    }
    
    
}
