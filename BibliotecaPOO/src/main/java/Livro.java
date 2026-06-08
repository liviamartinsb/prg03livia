/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lívia Martins Bastos
 */
public class Livro {

    // Atributos da classe Livro
    private int id;
    private String titulo;
    private String isbn;
    private int anoPublicacao;
    private int quantidadeDisponivel;

    // Construtor vazio
    public Livro() {
    }

    // Construtor utilizado para cadastrar livros
    public Livro(String titulo, String isbn,
                 int anoPublicacao,
                 int quantidadeDisponivel) {

        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    // Métodos getters para acessar os atributos

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
}
