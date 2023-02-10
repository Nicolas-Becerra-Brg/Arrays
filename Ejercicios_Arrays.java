package ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios_Arrays {
	 
	public static void main(String[] args) {
	
	int opcion;
	String opcion_2;
	Scanner scan= new Scanner(System.in);	
	int[] array_int = new int[] {1, 5, 2, 7, 9, 8, 7, 6, 78, 5, 11, 40, 7, 9, 2};
	String[] array_nombres = new String[20];
	Estudiantes[] array_estudiantes = new Estudiantes[100];
	Estudiantes estudiantes_1 = new Estudiantes();
	array_nombres[0] = "Fracisco";
	array_nombres[1] = "Ana";
	array_nombres[2] = "Eduardo";
	array_nombres[3] = "Fernando";
	array_nombres[4] = "Diego";
	array_nombres[5] = "Karina";
	array_nombres[6] = "Itzel";
	array_nombres[7] = "Sebastian";
	array_nombres[8] = "Nico";
	for (int x=0; x< array_int.length;x++) {
		System.out.print(", "+array_int[x]);	
	}
	
	for(int index = 0; index < array_int.length; index++){
		System.out.println(array_int[index]);
		}
	for(int index_02 = 0; index_02 < array_nombres.length; index_02++){
		System.out.println(array_nombres[index_02]);
		}
	for(int index_03 = 0; index_03 < array_estudiantes.length; index_03++){
		System.out.println(array_estudiantes[index_03]);
		}
	
	
	System.out.println("\nEscribe el valor que deseas buscar de la clase numeros:");
	opcion= scan.nextInt();

    int objetivo = opcion;
    boolean found = false;
    for (int i = 0; i < array_int.length; i++) {
        if (array_int[i] == objetivo) {
            System.out.println("Valor encontrado en el lugar " + i);
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Valor no encontrado en el arreglo");
    }
    
   
    System.out.println("Escribe el valor que deseas borrar de la clase nombres:");
	opcion_2= scan.next();
    
        String objetivo_1 = opcion_2;
        
        array_nombres = estudiantes_1.borrar(array_nombres, objetivo_1);
        System.out.println("Arreglo despues de borrar el valor " + Arrays.toString(array_nombres));
		}
}

