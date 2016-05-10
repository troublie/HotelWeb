/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelaria.persistencia;

import hotelaria.modelo.Hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juliano.lopes
 */
public class HotelBd {

    public List<Hotel> ler() {
        List<Hotel> hoteis = new ArrayList<Hotel>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String dbUrl = "jdbc:derby://localhost:1527/Hotelaria";
            Connection connection = DriverManager.getConnection(dbUrl, "app", "app");
            Statement statement = connection.createStatement();
            String query = "SELECT id, nome, logradouro, numero FROM app.hotel";
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                Hotel h = new Hotel();
                h.setId(result.getLong("id"));
                h.setNome(result.getString("nome"));
                h.setLogradouro(result.getString("logradouro"));
                h.setNumero(result.getInt("numero"));
                hoteis.add(h);
            }
        } catch (ClassNotFoundException e) {
            System.err.println("erro carregando o driver: " + e);
        } catch (SQLException e) {
            System.err.println("erro SQL: " + e);
        }
        return hoteis;
    }

    public boolean addNovo(String nome, String logradouro, long numero) {
        String sql = "INSERT INTO hotel VALUES (?,?,?)";

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String dbUrl = "jdbc:derby://localhost:1527/Hotelaria";
            Connection connection = DriverManager.getConnection(dbUrl, "app", "app");
            Statement statement = connection.createStatement();
            PreparedStatement stInsert = connection.prepareStatement(sql);

        } catch (ClassNotFoundException e) {
            System.err.println("erro carregando o driver: " + e);
        } catch (SQLException e) {
            System.err.println("erro SQL: " + e);
        }
    }
}
