package classe;

public class Usuario {
	String nome;
	String email;
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario){
			Usuario outro = (Usuario) obj;
			boolean igualNome = outro.nome.equals(this.nome);
			boolean igualEmail = outro.nome.equals(this.nome);
			
			return igualNome && igualNome;
		}else{
			return false;
		}
	}
}
