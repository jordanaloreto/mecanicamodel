package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Mecanico;

public class MecanicoRepository {

    private Connection connection;

    // public CategoriaRepository() throws SQLException {
    //     this.connection = DBConnection.getInstance().getConnection();
    // }

    public boolean save(Mecanico mecanico) {
        String sql = "INSERT INTO Mecanico (id, nome, endereco, cpf, cidade, telefone) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, mecanico.getId());
            stmt.setString(2, mecanico.getNome());
            stmt.setString(3, mecanico.getEndereco());
            stmt.setString(4, mecanico.getCpf());
            stmt.setString(5, mecanico.getCidade());
            stmt.setString(6, mecanico.getTelefone());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<String> getAllNomes() {
    List<String> nomes = new ArrayList<>();
    String sql = "SELECT nome FROM Mecanico";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        ResultSet result = stmt.executeQuery();
        while (result.next()) {
            nomes.add(result.getString("nome"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return nomes;
}

    public List<Mecanico> getAll() {
        List<Mecanico> mecanicos = new ArrayList<>();
        String sql = "SELECT * FROM Mecanico";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Mecanico mecanico = new Mecanico();
                mecanico.setId(result.getInt("id"));
                mecanico.setNome(result.getString("nome"));
                mecanico.setEndereco(result.getString("endereco"));
                mecanico.setCpf(result.getString("cpf"));
                mecanico.setCidade(result.getString("cidade"));
                mecanico.setTelefone(result.getString("telefone"));
                mecanicos.add(mecanico);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mecanicos;
    }

    public boolean update(Mecanico mecanico) {
        String sql = "UPDATE Mecanico SET nome = ?, endereco = ?, cpf = ?, cidade = ?, telefone = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, mecanico.getNome());
            stmt.setString(2, mecanico.getEndereco());
            stmt.setString(3, mecanico.getCpf());
            stmt.setString(4, mecanico.getCidade());
            stmt.setString(5, mecanico.getTelefone());
            stmt.setInt(6, mecanico.getId());
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Mecanico mecanico) {
        String sql = "DELETE FROM Mecanico WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, mecanico.getId());
            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean isMecanicoInUse(Mecanico mecanico) {
        String sql = "SELECT COUNT(*) FROM Os WHERE mecanico_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, mecanico.getId());
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                int count = result.getInt(1);
                System.out.println("Mecanico ID: " + mecanico.getId() + " está associado a " + count + " os.");
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Se houver um erro na consulta ou não houver resultado, retorne false, permitindo a exclusão.
        return false;
    }
    
    public int getIdByNome(String nome) {
        String sql = "SELECT id FROM Mecanico WHERE nome = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                return result.getInt("id");
            } else {
                throw new SQLException("Mecanico não encontrado: " + nome);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -1; // Erro
        }
    }
    
    public String getNomeById(int id) {
        String sql = "SELECT nome FROM Mecanico WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                return result.getString("nome");
            } else {
                throw new SQLException("Mecanico não encontrado: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null; // Erro
        }
    }
        
}
