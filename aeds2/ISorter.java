public interface ISorter<T extends Comparable<T>>{
    T[] sort(T[] dados);
    int getComparisions();
    int getSwaps();
    int getTime();
}