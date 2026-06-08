/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lívia Martins Bastos
 */
public class Main {

    public static void main(String[] args) {

        LivroDAO dao = new LivroDAO();

        // Lista os livros cadastrados
        dao.listarLivros();
    }
}