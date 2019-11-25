import java.util.Scanner;

public class PruebaGrafo {
	
	public static void menu() {
		System.out.println("1. Añadir arista");
		System.out.println("2. Mostrar grafo");
		System.out.println("3. Obtener lista adyacencia vertice");
		System.out.println("4. Salir");
	}
	
	public static void addArista(Grafo g) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese v1 y v2");
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		System.out.println("Ingrese el peso de la arista");
		int peso = in.nextInt();
		g.inserteArista(v1,v2,peso);
	}
	
	public static void mostrarGrafo(Grafo g) {
		g.mostrarGrafo();
	}

	public static void main(String[] args) {
		int opcion;
		Grafo g = new Grafo(5);
		do {
			menu();
			System.out.println("Ingrese una opcion");
			Scanner in = new Scanner(System.in);
			opcion = in.nextInt();
			
			switch (opcion) {
			case 1: addArista(g);break;
			case 2: mostrarGrafo(g);break;
			default: System.out.println("Incorrect option");
			}
		}while (opcion != 4);

	}

}
