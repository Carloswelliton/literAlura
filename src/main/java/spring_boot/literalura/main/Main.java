package spring_boot.literalura.main;

import java.awt.print.Book;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import spring_boot.literalura.models.Books;
import spring_boot.literalura.models.GutendexResponse;
import spring_boot.literalura.service.DataConverter;
import spring_boot.literalura.service.HttpConnection;

@Component
public class Main {

  public void menu(){
    Scanner sc = new Scanner(System.in);
    DataConverter converter = new DataConverter();
    HttpConnection con = new HttpConnection();
    var address = "https://gutendex.com/books/?search=";
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
          sc.nextLine();
          System.out.println("Digite o nome do livro que deseja buscar: ");
          var livro = sc.nextLine().toLowerCase();
          var json = con.connection(address+livro.replace(" ", "+"));
          GutendexResponse resposta = converter.dataConverter(json, GutendexResponse.class);

          if(resposta.result().isEmpty()){
            System.out.println("Nenhum livro encontrado com esse nome");
          }else{
            Books livrosProcessados = resposta.result().get(0);
            System.out.println("Titulo: "+livrosProcessados.titulo());
            System.out.println("Autor: "+livrosProcessados.autor());
            System.out.println("idioma: "+livrosProcessados.idioma());
            System.out.println("Quantidade de downloads: "+livrosProcessados.quantidadeDownload());
          }
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
