package TiposFuncionarios;

import Types.ImprimeTela;

public interface Bonifica {
    double calculaBonificacao();
    void enviaParaImpressaoSalario(ImprimeTela imprime);
}
