package classes;

import java.sql.Date;

public class Relatorio {
	public String n1,n2,n3,n4,n5;
	public String nArray[] = {n1,n2,n3,n4,n5};
		
	public void gerarData(){
		Date data = new Date(System.currentTimeMillis());
		System.out.println("Diário "+data);	
	}
	
	public void gerarLista(){
		for (int i=0; i<nArray.length; i++){
		System.out.println(nArray[i]);		
	}	
}
}
