/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

import mismetodos.CLeer;

/**
 *
 * @author usuario
 */
public class ORDENAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int e;
        do{
            System.out.print("¿Qué longitud quieres para tu matriz?-->");
            e=CLeer.datoInt();
        }while(e<1);
        int [] m = new int [e];
        for (int i=0;i<e;i++){
            m[i]=(int)(Math.random()*100+1);
            System.out.printf("%1$5d", m[i]);
        }
        System.out.println("");
//        Ordenare.burbujamenor(m);
//        Ordenare.burbujamayor(m);
//        Ordenare.insercionmenor(m);
//        Ordenare.insercionmayor(m);
//        Ordenare.seleccionmenor(m);
//        Ordenare.seleccionmayor(m);
        for (int j=0;j<e;j++){
            System.out.printf("%1$5d", m[j]);
            
        }
        System.out.println("");
    }
    
}
