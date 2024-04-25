import java.util.*;
public class Grafo<T>{
    private ArrayList<ArrayList<Arista<T>>> adyacencia = new ArrayList();

    public Grafo(int vertices){
        for (int i=0;i<vertices;i++){
            adyacencia.add(new ArrayList<>());
        }
    }
    
    public void agregarArista (int origen, int destino, int peso){
        adyacencia.get(origen).add(new Arista<>(destino,peso));
    }
    public void imprimirListaAdyacencia() {
        for (int i = 0; i < adyacencia.size(); i++) {
            System.out.print("Vértice " + i + " -> ");
            for (int j = 0; j < adyacencia.get(i).size(); j++) {
                Arista<T> arista = adyacencia.get(i).get(j);
                System.out.print(arista.destino + " (peso: " + arista.peso + ") ");
            }
            System.out.println();
        }
    }

    /*public int dijkstra(int origen, int destino){
        int Vertex = adyacencia.size();
        int[] distancia = new int[Vertex];
        boolean[] visitado = new boolean[Vertex];

    }*/
    

}