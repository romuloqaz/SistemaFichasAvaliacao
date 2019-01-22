package test;

import Model.FichaAvaliacao;
import Model.FichaAvaliacaoDAO;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class FichaTest {

    @Mock
    private FichaAvaliacaoDAO fichaAvaliacaoDAOMock;


    public FichaTest(){
        MockitoAnnotations.initMocks(this);
    }


    public FichaAvaliacao fichaFake(){
        return null;
    }
}
