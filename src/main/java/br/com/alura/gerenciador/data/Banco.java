package br.com.alura.gerenciador.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.com.alura.gerenciador.models.Empresa;

public class Banco {

	private static Integer chaveSequencial = 0;
	private static List<Empresa> lista = new ArrayList<Empresa>();

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
	}

//	static  {
//	Empresa empresa = new Empresa("Alura");
//	empresa.setId(chaveSequencial++);
//	Empresa empresa2 = new Empresa("Caelum");
//	empresa2.setId(chaveSequencial++);
//	lista.add(empresa);
//	lista.add(empresa2);
//	
//	}

	public static void removeEmpresa(Integer index) {

		Iterator<Empresa> iterator = lista.iterator();

		while (iterator.hasNext()) {

			Empresa emp = iterator.next();

			if (emp.getId() == index) {
				iterator.remove();

				System.out.println("removendo" + index);

			}

		}

	}
	
	public static void changeEmpresaName(int id, String name) {
		for(Empresa empresa : lista) {
			if(empresa.getId() == id) {
				empresa.setNome(name);
				return;
			}
		}
	}
	
	public static Empresa getEmpresa(int id) {

		for (Empresa e : lista) {
			if (e.getId() == id) {
				return e;
			}

		}
		return null;
	}

	public static List<Empresa> getEmpresas() {
		return Collections.unmodifiableList(lista);
	}
}
