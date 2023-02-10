package ejercicios;

public class Estudiantes {
	
	public Estudiantes() {}
		
		public String[] borrar(String[] array_nombres, String objetivo_1) {
		    int i, j;
		    for (i = 0; i < array_nombres.length; i++) {
		        if (array_nombres[i].equals(objetivo_1)) {
		            break;
		        }
		    }
		    if (i == array_nombres.length) {
		        System.out.println("Valor no encontrado");
		        return array_nombres;   
		    }
		    for (j = i; j < array_nombres.length - 1; j++) {
		        array_nombres[j] = array_nombres[j + 1];
		    }
		    
		    String[] nombresn = new String[array_nombres.length - 1];
		    System.arraycopy(array_nombres, 0, nombresn, 0, j);
		    return nombresn;
		}
		
		
	}


