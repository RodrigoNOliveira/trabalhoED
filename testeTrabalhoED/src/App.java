import java.util.Random;

public class App {

    

    public static void main(String[] args) throws Exception {
        
    Random gerador = new Random();
    int[] vetor = new int [1000000];
    
    System.out.println();
    System.out.println("Inicio tudo: " + System.currentTimeMillis());
        
        
        for (int i = 0; i < vetor.length; i++) {
            int x = gerador.nextInt(1000);
            vetor[i] = x;
        }
        System.out.println();
        System.out.println();
        System.out.println("Inicio BubbleSort: " + System.currentTimeMillis());
        Simples.bubbleSort(vetor);
        System.out.println("BubbleSort: "+System.currentTimeMillis());
        
        
        
        
        for (int i = 0; i < vetor.length; i++) {
            int x = gerador.nextInt(1000);
            vetor[i] = x;
        }
        System.out.println();
        System.out.println();
        System.out.println("Inicio InsertionSort: " + System.currentTimeMillis());
        Simples.insertionSort(vetor);
        System.out.println("InsertionSort: " +System.currentTimeMillis());


        
        for (int i = 0; i < vetor.length; i++) {
            int x = gerador.nextInt(1000);
            vetor[i] = x;
        }
        System.out.println();
        System.out.println();
        System.out.println("Inicio InsertionSort: " + System.currentTimeMillis());
        Simples.selectionSort(vetor);
        System.out.println("SelectionSort: " +System.currentTimeMillis());
        
        

    
    System.out.println();
    System.out.println("Fim total: " +System.currentTimeMillis());
    }
}
