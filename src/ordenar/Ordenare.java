/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

/**
 *
 * @author usuario
 */
public class Ordenare {
    public static void burbujamenor(int t[ ])
    {int aux;
            for(int i=0;i<t.length-1;i++)
            for(int j=i+1;j<t.length;j++)
            if (t[i]>t[j])
            {aux=t[i];
            t[i]=t[j];
            t[j]=aux;
            }
    }//fin de burbuja
    public static void burbujamayor (int t[ ])
    {int aux;
            for(int i=0;i<t.length-1;i++)
            for(int j=i+1;j<t.length;j++)
            if (t[i]<t[j])
            {aux=t[i];
            t[i]=t[j];
            t[j]=aux;
            }
    }//fin de burbuja
    
    public static void insercionmenor(int t[ ])
    {int j,aux;
            for(int i=1;i<t.length;i++)
            {j=i;
            aux=t[i];
            while(j>0 && aux<t[j-1])
            {
            t[j]=t[j-1];
            j--;
            }
            t[j]=aux;
            }
    }//fin de insercion
     public static void insercionmayor(int t[ ])
    {int j,aux;
            for(int i=1;i<t.length;i++)
            {j=i;
            aux=t[i];
            while(j>0 && aux>t[j-1])
            {
            t[j]=t[j-1];
            j--;
            }
            t[j]=aux;
            }
    }//fin de insercion
    public static void seleccionmenor(int t[ ])
    {int imenor,aux;
            for(int i=0;i<t.length-1;i++)
            {imenor=i;
            for(int j=i+1;j<t.length;j++)
                {if (t[j]<t[imenor])
                imenor=j;
                }
            aux=t[i];
            t[i]=t[imenor];
            t[imenor]=aux;
            }
    }//fin de selección
    public static void seleccionmayor(int t[ ])
    {int imenor,aux;
            for(int i=0;i<t.length-1;i++)
            {imenor=i;
            for(int j=i+1;j<t.length;j++)
                {if (t[j]>t[imenor])
                imenor=j;
                }
            aux=t[i];
            t[i]=t[imenor];
            t[imenor]=aux;
            }
    }//fin de selección
}//FIN DE CLASE
 