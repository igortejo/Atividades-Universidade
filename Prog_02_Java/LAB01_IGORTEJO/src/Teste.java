import java.util.Scanner;

public class Teste{
  public static void main(String[] args) {
    int i = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um texto:");
    while(sc.hasNext()){
      i++;
      System.out.print("Token: "+sc.next());
    }
    sc.close(); //Encerra o programa
  }
}