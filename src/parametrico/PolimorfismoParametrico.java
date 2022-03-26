package parametrico;

import java.util.ArrayList;
import java.util.List;

public class PolimorfismoParametrico {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();
		Aluno a1 = new Aluno("Marcela");
		alunos.add(a1);
		Aluno a2 = alunos.get(0);
		System.out.println("Nome: " + a2.getNome());
		
		List<Professor> professores = new ArrayList<>();
		Professor p = new Professor("André", "Doutor");
		professores.add(p);
		System.out.println("\nNome: " + professores.get(0).nome+
							"\nTitulacao: " + professores.get(0).titulacao);	
	}
}
