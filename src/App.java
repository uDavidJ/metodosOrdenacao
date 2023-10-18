import java.lang.Math;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        
        int[] vetor = cria_vetor_ordenado_decrescrente(100000);
        int[] aux = new int[vetor.length];

        long comeco = System.currentTimeMillis();
        QuickSort.quicksort(vetor, 0, vetor.length-1);
        long fim = (System.currentTimeMillis() - comeco) ;

        //System.out.println(Arrays.toString(vetor));

        System.out.println(fim + " Milisegundos");
    }

    public static int[] cria_vetor_aleatorio(int quantPosicoes) {

        int[] vetor = new int[quantPosicoes];

        for(int i = 0; i < quantPosicoes; i++) {
            //gera um vetor com elementos aleatórios de 0 a 99999
            vetor[i] = (int)(Math.random() * 100000);
        }
        return vetor; 
    }

    public static int[] cria_vetor_ordenado_crescrente(int quantPosicoes) {

        int[] vetor = new int[quantPosicoes];

        for(int i = 0; i < quantPosicoes; i++) 
            vetor[i] = i;

        return vetor;
    }

    public static int[] cria_vetor_ordenado_decrescrente(int quantPosicoes) {

        int[] vetor = new int[quantPosicoes];

        for(int i = quantPosicoes-1, j = 0; i >= 0; i--, j++) 
            vetor[i] = j;

        return vetor;
    }


}
