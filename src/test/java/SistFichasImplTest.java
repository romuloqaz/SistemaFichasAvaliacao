import Model.FichaAvaliacao;
import Model.FichaAvaliacaoDAO;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;

public class SistFichasImplTest {

    @Mock
    private FichaAvaliacaoDAO fichaAvaliacaoDAOMock;

    private FichaAvaliacao fichaAvaliacaoMock;

    public SistFichasImplTest(){
        MockitoAnnotations.initMocks(this);
        fichaAvaliacaoMock = new FichaAvaliacao();
    }

    public FichaAvaliacao FichaFake(){
        FichaAvaliacao ficha = new FichaAvaliacao();
        ficha.setNome("Raul");
        ficha.setCpf("111.111.111-11");
        ficha.setIdade(19);
        ficha.setSexo("Masculino");
        ficha.setDiagnostico("Enxaqueca");
        ficha.setData(LocalDate.now());
        return ficha;
    }


}
