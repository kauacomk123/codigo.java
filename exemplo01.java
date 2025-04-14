import java.util.Locale;
import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double salario01,salario02;
    String nome01,nome02;
    int idade,idade2;
    char sexo,sexo2;
    System.out.print("Nome da primeira pessoa:");
    nome01=sc.nextLine();
    System.out.print("Salario de "+nome01+":");
    salario01=sc.nextDouble();
    System.out.print("Nome da segunda pessoa:");
    sc.nextLine();
    nome02=sc.nextLine();
    System.out.print("salario de "+nome02+":");
    salario02=sc.nextDouble();
    System.out.print("Digite a idade de "+nome01);
    idade= sc.nextInt();
    System.out.print("Digite a idade de "+nome02);
    idade2= sc.nextInt();
    System.out.print("digite o sexo de "+nome01+"(F/M)");
    sexo=sc.next().charAt(0);
    System.out.print("digite o sexo de"+nome02+"(F/M)");
    sexo2=sc.next().charAt(0);
    System.out.println("\nNome1:"+nome01);
    System.out.println("Salario1:"+String.format("%.2f",salario01));
    System.out.println("idade:"+idade);
    System.out.println("Sexo:"+sexo);

    System.out.println("\nNome2:"+nome02);
    System.out.println("Salario2:"+String.format("%.2f",salario02));
    System.out.println("idade:"+idade2);
    System.out.println("Sexo:"+sexo2);
    sc.close();
    }
}

