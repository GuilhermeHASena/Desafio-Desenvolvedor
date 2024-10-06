package FaturamentoDiario;

public class CalcularFaturamentoDiario {

	public static void main(String[] args) {
		double[] faturamentoAnual = {}; /*Vetor de Faturamento anual carregado*/

        double menorFaturamento = faturamentoAnual[1];
        double maiorFaturamento = faturamentoAnual[1];
        double somaFaturamento = 0;
        int diasFaturamento = 0;

        for (double faturamento : faturamentoAnual) {
            if (faturamento > 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasFaturamento++;
            }
        }

        double mediaAnual = (diasFaturamento > 0) ? somaFaturamento / diasFaturamento : 0;
        int diasAcimaMedia = 0;

        for (double faturamento : faturamentoAnual) {
            if (faturamento > mediaAnual) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Dias no ano com faturamento diário acima da média anual: " + diasAcimaMedia);

	}

}
