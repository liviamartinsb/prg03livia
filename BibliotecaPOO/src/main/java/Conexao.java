/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lívia Martins Bastos
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    // Dados para conectar ao banco de dados
    private static final String URL =
        "jdbc:postgresql://db.plcaozzxqxirlzrozmog.supabase.co:5432/postgres";

    private static final String USUARIO = "postgres";

    private static final String SENHA = "(Polly)20192026";

    // Método responsável por abrir a conexão com o banco
    public static Connection conectar() {

        try {

            // Tenta realizar a conexão
            return DriverManager.getConnection(URL, USUARIO, SENHA);

        } catch (Exception e) {

            // Exibe o erro caso a conexão falhe
            e.printStackTrace();
            return null;
        }
    }
}