package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<String> listaCandidatos = new HashSet<String>();
		SortedSet<String> listaCandidatos = new TreeSet<String>();
		listaCandidatos.add("Ana");
		listaCandidatos.add("Carlos");
		listaCandidatos.add("Lucas");
		listaCandidatos.add("Pedro");
		
		
		for(String candidato : listaCandidatos){
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for(int i : nums){
			System.out.println(i);
		}
	}

}
