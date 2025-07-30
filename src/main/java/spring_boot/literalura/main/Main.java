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
  private Scanner sc = new Scanner(System.in);
  private DataConverter converter = new DataConverter();
  private HttpConnection con = new HttpConnection();
  private String address = "https://gutendex.com/books/?search=";


  public void menu(){
    // Scanner sc = new Scanner(System.in);
    // DataConverter converter = new DataConverter();
    // HttpConnection con = new HttpConnection();
    
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
        case 1 -> buscarLivro();
        case 2 -> listarLivrosRegistrados();
        case 3 -> listarAutoresRegistrados();
        case 4 -> listarAutoresVivos();
        case 5 -> listarIdiomas();
        

        case 0 -> {
          System.out.println("Obrigado por usar a biblioteca literAlura");
        }
      
        default -> {
          System.out.println("Digite uma opção válida");
        }
      }
    } while (option != 0);
  }

  private Object listarIdiomas() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarIdiomas'");
  }

  private Object listarAutoresVivos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarAutoresVivos'");
  }

  private Object listarAutoresRegistrados() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarAutoresRegistrados'");
  }

  private Object listarLivrosRegistrados() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarLivrosRegistrados'");
  }

  public void buscarLivro(){
    sc.nextLine();
    System.out.println("Digite o nome do livro que deseja buscar: ");
    var livro = sc.nextLine().toLowerCase();
    var json = con.connection(address+livro.replace(" ", "%20"));
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
  }

  
}
