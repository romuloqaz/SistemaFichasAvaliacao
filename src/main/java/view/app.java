package view;
import Model.FichaAvaliacao;
import Model.FichaAvaliacaoDAO;

import java.sql.SQLException;
import java.time.LocalDate;

public class app {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        FichaAvaliacaoDAO dao = new FichaAvaliacaoDAO();

        FichaAvaliacao paciente1 = new FichaAvaliacao("Raul","111.111.111-11",19,"Masculino","Condomalacia Patelar", LocalDate.now());
        FichaAvaliacao paciente2 = new FichaAvaliacao("Raul","222.222.222-22",19,"Masculino","Condomalacia Patelar", LocalDate.now());


        System.out.println(dao.salvarFicha(paciente2));
        System.out.println(dao.salvarFicha(paciente1));
        System.out.println(dao.listarFichas());
        System.out.println(dao.removeByCpf("111.111.111-11"));
        System.out.println(dao.listarFichas());
    }
}

