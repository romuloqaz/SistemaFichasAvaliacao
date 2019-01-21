package Model;

import Exceptions.CampoVazioException;
import Exceptions.CpfInvalidoException;
import Exceptions.DataConsultaException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FichaAvaliacaoDAO {

    private List<FichaAvaliacao> fichas;

    public FichaAvaliacaoDAO(){
        fichas = new ArrayList<>();
    }

    public boolean salvarFicha(FichaAvaliacao fichaAvaliacao) {
        try {
            validarFicha(fichaAvaliacao);
            if (buscarByCpf(fichaAvaliacao.getCpf())== null){
                fichas.add(fichaAvaliacao);
                return true;
            }
        } catch (CampoVazioException | DataConsultaException | CpfInvalidoException e) {
            e.printStackTrace();
        }

        return false;

    }


    public FichaAvaliacao buscarByCpf(String cpf){
       if (fichas.isEmpty()){
           return null;
       }
        for (FichaAvaliacao ficha: fichas) {
            if (ficha.getCpf().equals(cpf)){
                return ficha;
            }
        }
        return null;
    }

    public List<FichaAvaliacao> listarFichas(){
        return fichas;
    }

    public boolean removeByCpf(String cpf){
        if (fichas.isEmpty()){
            return false;
        }
        for (FichaAvaliacao ficha:fichas) {
            if (ficha.getCpf().equals(cpf)){
                return fichas.remove(ficha);
            }

        }
        return false;
    }

    public static void validarFicha(FichaAvaliacao fichaAvaliacao) throws CpfInvalidoException, DataConsultaException, CampoVazioException {
        if (fichaAvaliacao.getCpf().equals("   .   .   -  ") || fichaAvaliacao.getCpf() == null ||
                fichaAvaliacao.getCpf().equals("00000000000") ||
                fichaAvaliacao.getCpf().equals("11111111111") ||
                fichaAvaliacao.getCpf().equals("22222222222") ||
                fichaAvaliacao.getCpf().equals("33333333333") ||
                fichaAvaliacao.getCpf().equals("44444444444") ||
                fichaAvaliacao.getCpf().equals("55555555555") ||
                fichaAvaliacao.getCpf().equals("66666666666") ||
                fichaAvaliacao.getCpf().equals("77777777777") ||
                fichaAvaliacao.getCpf().equals("88888888888") ||
                fichaAvaliacao.getCpf().equals("99999999999") ||
                fichaAvaliacao.getCpf().length() < 14
        ){
            throw new CpfInvalidoException();
        }
        if (fichaAvaliacao.getCpf().equals(" ")){
            throw new CampoVazioException();
        }
        if (fichaAvaliacao.getData().isAfter(LocalDate.now())){
            throw new DataConsultaException();
        }
        if (fichaAvaliacao.getData().isBefore(LocalDate.now())){
            throw new DataConsultaException();
        }
    }
}
