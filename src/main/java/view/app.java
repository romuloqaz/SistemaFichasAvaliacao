package view;
import Model.FichaAvaliacaoDAO;

public class app {
    public static void main(String[] args) {
        FichaAvaliacaoDAO dao = new FichaAvaliacaoDAO();
        //        System.out.println(dao.salvarFicha(new FichaAvaliacao("romulo","1111-01",19,"masculino","Lesão Muscular Posterior", "2019-01-18")));
        System.out.println(dao.buscarFichaPaciente("1111-01"));
    }
}

