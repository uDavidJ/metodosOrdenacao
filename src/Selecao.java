public class Selecao {
    public static void selecao(int[] vetor) {
        int posicao = 0;

        for(int j = 0; j < vetor.length; j++) {
            int menor = vetor[j];

            for(int i = j; i < vetor.length; i++) {
                if(vetor[i] < menor) {
                    menor = vetor[i];
                    posicao = i;
                }
            }

            int aux = vetor[j];
            vetor[j] = menor;
            vetor[posicao] = aux;
        }

        for(int i = 0; i < vetor.length; i++) 
            System.out.println(vetor[i]);
    }
}
