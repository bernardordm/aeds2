import java.util.Arrays;

public class Bubblesort<T extends Comparable<T>> implements ISorter<T> {
    private int comparisions;
    private Utils<T> swap = new Utils<T>();
    private int time = 0 ; // in ms
    @Override
    public T[] sort(T[] dados) {
        T[] arrayCopy = Arrays.copyOf(dados, dados.length);
        int n = arrayCopy.length;
        int swaps;
        start();
for (int i = 1; i < n; i++){
    for(int j = 0; j < n - i; j++){
        comparisions ++;
        if(arrayCopy[j].compareTo( arrayCopy[j+1]) > 0){
            Utils.swap(arrayCopy, j, i);
            swaps ++;
        }
    }
    endTime();

    return arrayCopy;
}

    }

    @Override
    public int getComparisions() {
        return comparisions;
    }

    @Override
    public int getSwaps() {
        return swaps;
    }

    @Override
    public int getTime() {
        //retornar em ms
        return time;
    }
    

    private void start(){
        comparisions = 0;
        swaps = 0;
    }

    private void endTime() {
        // finaliza o temporizador
    }
}
