/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Botones {
    
    private static frmformulario formulario;
    private static Persona persona[];
    private static int contador;
    
    public static void main(String[]args){
        formulario =new frmformulario();
        persona =new Persona[100];
        
        for (int i = 0; i < 100; i++) {
            persona[i]=new Persona();
        }
        contador=0;
        
        formulario.setVisible(true);
        }
    
    public static void guardar( String c,String n,String a,String s,String d,String l,String m,String o,String f)
        {
        //Codigo c, Nombre n, Apellido a, Sexo s, Dirección d, Lugar l, Motivo m, Medico o, Fecha f
          persona[contador].setCodigo(c);
          persona[contador].setNombre(n);
          persona[contador].setApellido(a);
          persona[contador].setSexo(s);
          persona[contador].setDirección(d);
          persona[contador].setLugar(l);
          persona[contador].setMotivo(m);
          persona[contador].setMedico(o);
          persona[contador].setFecha(f);
          
          contador++;
    }
        public static void buscar(String bus){
            for (int j = 0; j < persona.length; j++){
                if(persona[j].getNombre().equals(bus)){
                    formulario.cargardatos(persona[j]);
                    
                }
                
            } 
              for (int j = 0; j < persona.length; j++){
                if(persona[j].getMedico().equals(bus)){
                    formulario.cargardatos(persona[j]);
                    
                }
                
            } 
                for (int j = 0; j < persona.length; j++){
                if(persona[j].getLugar().equals(bus)){
                    formulario.cargardatos(persona[j]);
                    
                }
                
            } 
            
        }

}
