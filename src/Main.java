import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      Prenda[]almacen= new Prenda[3];
      for(int i=0; i<almacen.length;i++) {
          System.out.println("Ingrese el color de la camiseta");
          String color = sc.nextLine();

          Prenda camisetauno = new Prenda(color);
          almacen[i] = camisetauno;

          System.out.println("Almacen:");
          for (i = 0; i < almacen.length; i++){
              System.out.println("Camiseta:"+almacen[i]);
      }
      sc.close();
      }



    }


}