import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Grafo<Integer> grafo = new Grafo<>(8);
        /*VERTICES
         * A = 0
         * B = 1
         * C = 2
         * D = 3
         * E = 4 
         * F = 5 
         * G = 6 
         * H = 7
         */
        grafo.agregarArista(0, 1, 2); //A - B  2
        grafo.agregarArista(0, 5, 1); //A - F  1

        grafo.agregarArista(1, 0, 2); //B - A  2
        grafo.agregarArista(1, 2, 2); //B - C  2
        grafo.agregarArista(1, 3, 2); //B - D  2
        grafo.agregarArista(1, 4, 4); //B - E  4

        grafo.agregarArista(2, 1, 2); // C - B 2
        grafo.agregarArista(2, 4, 3); // C - E 3 
        grafo.agregarArista(2, 7, 1); // C - H 1

        grafo.agregarArista(3, 1, 2); // D - B 2
        grafo.agregarArista(3, 4, 4); // D - E 4
        grafo.agregarArista(3, 5, 3); // D - F 3

        grafo.agregarArista(4, 2, 3); // E - C 3
        grafo.agregarArista(4, 3, 4); // E - D 4
        grafo.agregarArista(4, 6, 7); // E - G 7
        grafo.agregarArista(4,1,4);   // E - B 4

        grafo.agregarArista(5, 0, 1); // F - A 1
        grafo.agregarArista(5, 3, 3); // F - D 3
        grafo.agregarArista(5, 6, 5); // F - G 5

        grafo.agregarArista(6, 4, 7); // G - E 7
        grafo.agregarArista(6, 5, 5); // G - F 5
        grafo.agregarArista(6, 7, 3); // G - H 3

        grafo.agregarArista(7, 2, 1); // F - A 1
        grafo.agregarArista(7, 6, 3); // F - G 3



        grafo.imprimirListaAdyacencia();
        int origen = 0,destino = 7; // Origen de A -> F
        int pesoMinimo = grafo.dijkstra(0, 7);

        System.out.println("El peso mínimo desde " + origen + " hasta " + destino + " es: "+pesoMinimo);
        
    }
    
}
