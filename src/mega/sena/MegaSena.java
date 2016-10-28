
package mega.sena;
import java.util.Random;



public class MegaSena {

    public static void main(String[] args) {
        int m [][] = new int [3000][6];
       int v[] = new int[65];
       
       Random  gerador = new Random ();
         
       for (int i=0; i < 3000  ; i++)
       {
           for(int j = 1 ; j <= 60 ; j++)
               v[j] = 0;
           
           int j = 0;
           
            while(j < 6)   
            {
                int aux = gerador.nextInt(60) + 1;

                if(v[aux] == 0){

                    m[i][j++] = aux;
                    v[aux] = 1;

                }
            }        
        }
       
       for(int k = 0 ; k < 3000 ; k++){
            
           for(int i = 0 ; i < 6 ; i++){

                for(int j = i ; j > 0 ; j--){

                    if(m[k][j] < m[k][j - 1]){

                        int aux = m[k][j];
                            m[k][j] = m[k][j - 1];
                            m[k][j - 1] = aux;
                    }

                    else
                        break;
                }
            }
       }
       
       
              
      
       for (int i=0; i < 3000; i++)
       {
         
           System.out.print("\n Sorteio ["+(i+1)+"]:  \n "); 
           for (int j=0; j < 6; j++)
              
                                         
               System.out.printf("\n %d \n ", m[i][j]);     
               
                     
       }
                
 
    
    }
        
    }