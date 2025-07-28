package spring_boot.literalura.main;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Main {
  public void main(){
    Scanner sc = new Scanner(System.in);
    int option = 0;

    do {
      System.out.println("""
          \t\t\tBem vindo ao LiterAlura\t\t\t
          Por favor digite o número da opção que deseja:
          [1] - Buscar Livros
          [2] - Listar livros registrados
          [3] - Listar autores registrados
          [4] - Listar autores vivos em um determinado ano
          [5] - Listar livros de um determinado idioma
          [0] - Sair
          """);
          option = sc.nextInt();

      switch (option) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        
        case 4: 
          break;

        case 5:
          break;

        case 0:
          System.out.println("Obrigado por usar a biblioteca literAlura");
          break;
      
        default:
        System.out.println("Digite uma opção válida");
          break;
      }
    } while (option != 0);
  }
}
