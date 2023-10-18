public class MergeSort {
    public static void mergeSort(int[] vetor, int[] v_auxiliar, int inicio, int fim) {
        if(inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, v_auxiliar, inicio, meio);
            mergeSort(vetor, v_auxiliar, meio+1, fim);

            intercalar(vetor, v_auxiliar, inicio, meio, fim);
        }
    }

    private static void intercalar(int[] vetor, int[] v_auxiliar, int inicio, int meio, int fim) {
        for(int k = inicio; k <= fim; k++) 
            v_auxiliar[k] = vetor[k];
        
        int i = inicio;
        int j = meio+1;

        for(int k = inicio; k <=fim; k++) {
            if(i > meio) 
                vetor[k] = v_auxiliar[j++];
            else if (j > fim)
                vetor[k] = v_auxiliar[i++];
            else if(v_auxiliar[i] < v_auxiliar[j])
                vetor[k] = v_auxiliar[i++];
            else
                vetor[k] = v_auxiliar[j++];
        }

    }
}
