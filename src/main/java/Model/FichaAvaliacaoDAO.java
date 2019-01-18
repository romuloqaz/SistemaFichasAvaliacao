package Model;

import Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FichaAvaliacaoDAO {
    private ConnectionFactory factory;

    public FichaAvaliacaoDAO(){
        factory = new ConnectionFactory();
    }
    public boolean salvarFicha (FichaAvaliacao fichaAvaliacao) {
       String sql = "INSERT INTO fichaavaliacao (nome, cpf, idade, sexo, diagnostico, dataConsulta) VALUES (?, ?, ?, ?, ?, ?)";

       try (Connection connection = factory.getConnection()){
           PreparedStatement st = connection.prepareStatement(sql);
           st.setString(1, fichaAvaliacao.getNome());
           st.setString(2, fichaAvaliacao.getCpf());
           st.setInt(3, fichaAvaliacao.getIdade());
           st.setString(4, fichaAvaliacao.getSexo());
           st.setString(5, fichaAvaliacao.getDiagnostico());
           st.setString(6, fichaAvaliacao.getData());

           ResultSet rs = st.executeQuery();

       }catch (SQLException e) {
           System.out.println(e);
           return false;}
       catch (ClassNotFoundException e) {
           System.out.println(e);
           return false;
       }
       return true;
    }

    public List<FichaAvaliacao> buscarFichaPaciente(String cpf){
        String sql = "SELECT * FROM fichaavaliacao WHERE cpf = ? ";
        List<FichaAvaliacao> fichaAvaliacaos =null;
        try (Connection connection = factory.getConnection()){
            PreparedStatement st = connection.prepareStatement(sql);

            st.setString(1,cpf);

            ResultSet rs = st.executeQuery();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            return null;}

        return fichaAvaliacaos;
    }
}
