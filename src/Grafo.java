
public class Grafo {
	private Nodo grafo [];
	private int numVertices;
	
	public Grafo(int numVertices) {
		this.numVertices = numVertices;
		grafo = new Nodo[this.numVertices];
		
		for(int i = 0; i < this.numVertices; i++) {
			grafo[i] = null;
		}
	}
	
	public boolean existeArista(int v1, int v2) {
		if (grafo[v1] ==  null) return false;
		Nodo actual = grafo[v1];
		while(actual != null) {
			if(actual.vertice == v2) return true;
			actual = actual.sig;
		}
		return false;
	}
	
	public void inserteArista(int v1, int v2, int peso) {
		if(!existeArista(v1, v2)) {
			
			Nodo nuevo = new Nodo(v2, peso);
			if(grafo[v1] == null) {
				grafo[v1] = nuevo;
			}else {
				Nodo actual = grafo[v1];
				while(actual.sig != null) {
					actual = actual.sig;
				}
				actual.sig = nuevo;
			}
		}
	}
	
	public void mostrarGrafo() {
		for(int i = 0; i < grafo.length; i++) {
			Nodo actual = grafo[i];
			
			while( actual != null) {
				System.out.printf("%d -->" , i);
				System.out.printf("%d(%d)\n", actual.vertice, actual.pesoArco);
				actual = actual.sig;
			}
			System.out.println();
		}
	}
	
	public boolean listaAdyacencia(int v) {
		if(grafo[v] == null) return true;
		return false;
	}
	
	public Nodo getPrimerAd(int v) {
		return grafo[v];
	}
 	
	public Nodo nextAd(Nodo anterior) {
		if(anterior.sig == null) return null;
		else return anterior.sig;
	}

}
class Nodo{
	int vertice;
	int pesoArco;
	Nodo sig;
	
	public Nodo(int v, int pA) {
		this.vertice = v;
		this.pesoArco = pA;
		this.sig = null;
	}
}
