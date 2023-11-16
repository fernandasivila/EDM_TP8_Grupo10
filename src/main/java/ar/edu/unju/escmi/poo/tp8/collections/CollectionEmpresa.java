package ar.edu.unju.escmi.poo.tp8.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.tp8.model.Empresa;

public class CollectionEmpresa {
	
	public static List<Empresa> empresas = new ArrayList<Empresa>();
	
	public static void precargarEmpresas() {
		if(empresas.isEmpty()) {
			empresas.add(new Empresa(1,"Coca Cola",350,"3884529345","Estados Unidos"));
			empresas.add(new Empresa(2,"Nike",200,"3884529335","Mexico"));
			empresas.add(new Empresa(3,"Puma",221,"3884528615","Rusia"));
			empresas.add(new Empresa(4,"Netflix",501,"3884511145","Inglaterra"));
			empresas.add(new Empresa(5,"Amazon",456,"3884999345","Germania"));
		}
	}
}
