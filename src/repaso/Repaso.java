
package repaso;


public class Repaso {

   
    public static void main(String[] args) {
        int notas[][] = {{10,20,30},{40,50,60}, {70,90,80}};
        System.out.println("La diagonala principal es " + diagonalPrincipal(notas));
    }
   public static String diagonalPrincipal(int matriz[][]){
      String resultado = " ";
       for (int v = 0; v < matriz.length; v++) {
           resultado = resultado + String.valueOf(matriz[v][v]) + "|";
           
       }
       return resultado;
   } 
}
