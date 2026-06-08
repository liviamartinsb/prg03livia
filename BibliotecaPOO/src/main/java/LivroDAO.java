/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lívia Martins Bastos
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LivroDAO {

    // Método responsável por inserir um livro no banco
    public void inserir(Livro livro) {

        // Comando SQL para cadastrar um livro
        String sql =
        "INSERT INTO livro(titulo,isbn,ano_publicacao,quantidade_disponivel) VALUES(?,?,?,?)";

        try {

            // Abre a conexão com o banco
            Connection conn = Conexao.conectar();

            // Prepara o comando SQL
            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            // Preenche os parâmetros do SQL
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getIsbn());
            stmt.setInt(3, livro.getAnoPublicacao());
            stmt.setInt(4, livro.getQuantidadeDisponivel());

            // Executa o cadastro
            stmt.executeUpdate();

            System.out.println("Livro cadastrado com sucesso!");

        } catch(Exception e) {

            // Exibe mensagem caso ocorra erro
            e.printStackTrace();
        }
    }

    // Método responsável por listar os livros cadastrados
    public void listarLivros() {

        String sql = "SELECT * FROM livro";

        try {

            Connection conn = Conexao.conectar();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                System.out.println("ID: " +
                        rs.getInt("id"));

                System.out.println("Título: " +
                        rs.getString("titulo"));

                System.out.println("ISBN: " +
                        rs.getString("isbn"));

                System.out.println("Ano: " +
                        rs.getInt("ano_publicacao"));

                System.out.println("Quantidade: " +
                        rs.getInt("quantidade_disponivel"));

                System.out.println("----------------------");
            }

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
    
    // Método responsável por atualizar a quantidade de um livro
public void atualizarQuantidade(int id, int novaQuantidade) {

    String sql =
    "UPDATE livro SET quantidade_disponivel = ? WHERE id = ?";

    try {

        Connection conn = Conexao.conectar();

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        stmt.setInt(1, novaQuantidade);
        stmt.setInt(2, id);

        stmt.executeUpdate();

        System.out.println("Livro atualizado com sucesso!");

    } catch (Exception e) {

        e.printStackTrace();
    }
}
// Método responsável por excluir um livro
public void excluirLivro(int id) {

    String sql =
    "DELETE FROM livro WHERE id = ?";

    try {

        Connection conn = Conexao.conectar();

        PreparedStatement stmt =
                conn.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.executeUpdate();

        System.out.println("Livro excluído com sucesso!");

    } catch (Exception e) {

        e.printStackTrace();
    }
}
}