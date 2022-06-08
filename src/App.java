import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("informa o numero de quartos: ");
        
        
        Quartoestu[] quarto = new Quartoestu[10];
        
        int n = sc.nextInt();
       
       for(int i=0;i<n; i++){
           System.out.println();
           System.out.println("Quartoestu #" + i + ":");
           System.out.print("informe o nome: ");
           sc.nextLine();
           String nome = sc.nextLine();
           System.out.print("informe o email: ");
           String email = sc.nextLine();
           System.out.print("quarto: ");
           int room = sc.nextInt();
           
           quarto[room] = new Quartoestu(nome , email);
           
       }
       System.out.println();
       System.out.println("procura quarto: ");
       for(int i=0; i<10; i++){
        if(quarto[i] !=null){
            System.out.println(i+ ": " + quarto[i]);
        }
            
        }
        
      sc.close();
    }
}
