package simulador.forms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prueba {
	
	
	public static void main(String[] args) {
	
			//SolicitudForm();
			//iniciali
			SolicitudForm form = new SolicitudForm();
			
			
			ArrayList<SolicitudForm> practicas  = new ArrayList<SolicitudForm>();
			for (int i = 0; i < 10; i++) {
				List pieza = new ArrayList<CaraForm>(); 				 
				CaraForm caraform = new CaraForm();
				caraform.setDistal("001" +i );
				caraform.setLingual(null ) ;
				caraform.setOclusal("002" + i);
				caraform.setTambores(null);
				caraform.setVestibular("005" +i);
			     pieza.add(caraform);
			     form.getCodigoPracticasList().add(i, "code-> "+i);
			     form.getDescripcionPracticasList().add(i, "descripcion #" + i);
			      form.getPiezaList().add(i, "pieza :" + i );
			      form.getCarasList().add(i, pieza);
				//practicas.add(i  , pieza.toString());
			      practicas.add(form);
				
			}
//			Iterator<SolicitudForm> itera = practicas.iterator();
//			
//			while (itera.hasNext()){
//				String element = itera.next().codigoPracticasList.toString() + "elememnt" ;
//				System.out.println(element);
//			} 
			
			for (int i = 0; i < practicas.size(); i++) {
				System.out.println(practicas.get(i).getCodigoPracticasList().get(i) + " "+
						practicas.get(i).getDescripcionPracticasList().get(i) +" "+
							practicas.get(i).getCarasList().get(i) +" "+
							practicas.get(i).getPiezaList().get(i)); 
			}
		
			
			for (int i = 0; i < practicas.size(); i++) {
				if(!practicas.get(i).getCarasList().get(i).equals(" ")){
				 String	caras = practicas.get(i).getCarasList().get(i).toString().substring(1, 25);
				//String printScreen = caras.toString();
					System.out.println("caras ->" + caras);
					//System.out.println("print ->" + printScreen);
					String []vector = caras.split(" ");
					for (int j = 0; j < vector.length; j++) {
						System.out.println(vector[j] + " vl" + vector.length);
						if (vector[j].equals("null") )
								System.out.println("Pieza ----->" + vector[j]);
					}
					
				}
			}
		
		
		
	}

}
