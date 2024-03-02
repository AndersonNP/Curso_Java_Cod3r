package streams;

public class Lancamento {
	
	int recdesp;
	double valor;
	String vencimento;
	public Lancamento(int recdesp, double valor, String vencimento) {
		this.recdesp = recdesp;
		this.valor = valor;
		this.vencimento = vencimento;
	}
	@Override
	public String toString() {
		return "Lancamento [recdesp=" + recdesp + ", valor=" + valor
				+ ", vencimento=" + vencimento + "]";
	}
	
	
	
	
}
