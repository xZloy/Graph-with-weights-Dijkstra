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

    private int distanciaMinima(int[] distancias, boolean[] visitado) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < distancias.length; v++) {
            if (!visitado[v] && distancias[v] <= min) {
                min = distancias[v];
                min_index = v;
            }
        }

        return min_index;
    }
    public int dijkstra(int origen, int destino) {
        int V = adyacencia.size();
        int[] distancias = new int[V];
        boolean[] visitado = new boolean[V];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[origen] = 0;
    
        for (int count = 0; count < V - 1; count++) {
            int u = distanciaMinima(distancias, visitado);
            visitado[u] = true;
    
            for (Arista<T> arista : adyacencia.get(u)) {
                if (!visitado[arista.destino] && distancias[u] != Integer.MAX_VALUE &&
                        distancias[u] + arista.peso < distancias[arista.destino]) {
                    distancias[arista.destino] = distancias[u] + arista.peso;
                }
            }
        }
    
        return distancias[destino];
    

}}