import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        List<Funcionarios> funcionarios = new ArrayList<>();
        String nome,CPF,endereco,telefone,setor = null;
        

        for (int i = 0; i < 5; i++) {

            do {
                System.out.print("Informe o setor do funcionario:\n(A)ssalariado ou (H)orista:");
                setor = sc.nextLine();

                switch (setor){
                    case "A":
                    setor = "Assalariado";
                    System.out.println(setor);
    
                    
                    System.out.print("Digite o nome do funcionario: ");  
                    nome = sc.nextLine(); 
            
                    System.out.print("Digite o CPF do funcionario: ");
                    CPF = sc.nextLine(); 
            
                    System.out.print("Digite o endereco do funcionario: ");
                    endereco = sc.nextLine();
            
                    System.out.print("Digite o telefone do funcionario: ");
                    telefone = sc.nextLine();
            
                    System.out.print("Digite o salario do funcionario: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();
                    funcionarios.add(new Assalariados(nome,CPF,endereco,telefone,setor,salario));
                    break;

                    case "H":
                    setor = "Horista";
                    System.out.println(setor);
    
                    
                    System.out.print("Digite o nome do funcionario: ");
                    nome = sc.nextLine(); 
            
                    System.out.print("Digite o CPF do funcionario: ");
                    CPF = sc.nextLine(); 
            
                    System.out.print("Digite o endereco do funcionario: ");
                    endereco = sc.nextLine();
            
                    System.out.print("Digite o telefone do funcionario: ");
                    telefone = sc.nextLine();
    
                    System.out.print("Digite quantas horas trabalhadas: ");
                    int horaTrabalhadas = sc.nextInt();
    
                    System.out.print("Digite o valor das horas trabalhada: ");
                    double valorDaHora = sc.nextDouble();
                    sc.nextLine();
                    funcionarios.add(new Horistas(nome,CPF,endereco,telefone,setor,horaTrabalhadas,valorDaHora));
    
                    break;
                    default:
                        System.out.println();
                        System.out.println("Alternativa invalida: ");
                        System.out.println();
                    break;
                }

            } while (setor.equals("A") || setor.equals("H"));

        } 


        System.out.println();
        System.out.println("Mostrando funcionarios:");
        System.out.println();

        for (Funcionarios x : funcionarios) {
            System.out.println("Funcionario------------------");
            System.out.println();
            x.mostraDados();
            System.out.println();  
        }
        
        for (Funcionarios x : funcionarios) {
            System.out.println("Quantos % você que da de aumento para "+x.getNome());
            int pocentagem = sc.nextInt();
        }

        for (Funcionarios x : funcionarios) {
            x.mostraDados();
            System.out.println("Valor a receber: "+x.pocentagem(pocentagem));
        }

        System.out.println();
        System.out.println("Fim do programa: ");   

    }
}
