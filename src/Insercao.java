public class Insercao {
    public static void insercao(int[] vetor) {
        int aux, aux2;

        for(int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            aux2 = i-1;
            while((aux2 >= 0) && vetor[aux2] > aux){
                vetor[aux2+1] = vetor[aux2];
                aux2 = aux2-1;
            }
            vetor[aux2+1] = aux;
        }

        for(int i = 0; i < vetor.length; i++) 
            System.out.println(vetor[i]);
    }
}
