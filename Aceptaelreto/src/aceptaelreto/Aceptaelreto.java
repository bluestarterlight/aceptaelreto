
package aceptaelreto;
import java.util.Scanner;

public class Aceptaelreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scan=new Scanner(System.in);
        
        
        String texto0;
        String texto1;
        int casos;
        int i;
        
        
        casos=Scan.nextInt();
        //El scan me da un salto de linea
        Scan.nextLine();
        for(i=0;i<casos;i++){
            //System.out.println("Dime: ");
            texto0 = Scan.nextLine();
            texto1 = Scan.nextLine();
            
            //System.out.println("Dime dime: ");
            if(texto0.equals("Luke")&&texto1.equals("padre")){
                    System.out.println("TOP SECRET");
            }else{
                
                System.out.println( texto0 + ", yo soy tu " + texto1);
            }
        }
    }
    
}