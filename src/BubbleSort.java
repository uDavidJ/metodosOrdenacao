public class BubbleSort {
    public static void bubblesort(int[] vetor) {

        for(int j = 0; j < vetor.length; j++)
            for(int i = 0; i < vetor.length-1; i++) 
                if(vetor[i] > vetor[i+1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor [i+1] = aux;
                }
                
        for(int i = 0; i < vetor.length; i++) 
            System.out.println(vetor[i]);
    }
}
