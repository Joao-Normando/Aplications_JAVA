package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Funcionario> list = new ArrayList <Funcionario>();
		
		System.out.println("Quantos funcionarios a ser registrados ? ");
		int n = sc.nextInt();
		
		for(int i=0; i < n; i++) {
			System.out.println("Funcionario #1"+(i+1)+ ":");
			System.out.println("id : ");
			Integer id = sc.nextInt();
			System.out.print("Nome:  ");
			
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Funcionario func = new Funcionario(id, nome , salario);
			
			list.add(func);
		}
		
		System.out.print("Entre com o id do funcionario a ter aumento : ");
		int idsalario = sc.nextInt();
		
		
		Integer pos = posicao(list, idsalario);
		if(pos == null) {
			System.out.println("Esse ID nao existe !");
		}
		else {
			System.out.print("Entre com a porcentagem : ");
			double porcentagem = sc.nextDouble();
			list.get(pos).aumentoSalario(porcentagem);
		}
		System.out.println();
		System.out.println("Lista de Funcionario : ");
		for (Funcionario func : list) {
			System.out.println(func);
		}
		
		
		sc.close();
	}
	
	public static Integer posicao(List<Funcionario> list, int id) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getId() == id ) {
				return i;
			}
		}
		return null;
	}

}
