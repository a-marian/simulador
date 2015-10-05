package simulador.forms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class SolicitudForm extends BaseForm {
	
	private final long CANTIDAD_PRACTICAS = 10;
	
	public SolicitudForm(){
		super();
		codigoPracticasList = new ArrayList<String>();
		descripcionPracticasList = new ArrayList<String>();
		piezaList = new ArrayList<String>();
		carasList= new ArrayList<String>();
				
	}
//	descripcionPracticasList

	

	
	public void fillPracticas(){
	
		ArrayList<String> practicas = new ArrayList<String>();
		
		for(int i=0; i < CANTIDAD_PRACTICAS ; i++){
			practicas.add("Practica " + i);
		}
		practicas.add(2, "Practica 3");
		
		Iterator<String> itera = practicas.iterator();
		
		while(itera.hasNext() ){
			String elemento = itera.next();
			System.out.println(elemento+" / ");
					
		}
		
		
		int numElementos = practicas.size();
		
		System.out.println("nro elementos : " + numElementos + " elementos");
		
		System.out.println("Remove elements like 'Elemento 3' en el arraylist");
			
		itera = practicas.iterator();
		
		while(itera.hasNext()){
			String elemento = itera.next();
			if(elemento.equals("Practica 3"))
				 itera.remove(); //Remove element in iterator			
		}
		
		System.out.println("Imprimimos los elementos del arraylist tras realizar las eliminaciones: ");
		itera = practicas.iterator();
		while (itera.hasNext()) {
			String elemento = itera.next();
			
			System.out.println(elemento+ "/");
		}
		
	}

	

}
