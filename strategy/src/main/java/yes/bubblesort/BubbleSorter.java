package yes.bubblesort;

public class BubbleSorter {
    private int operations;
    private int length;
    private SortHandle sortHandle;
    public BubbleSorter(SortHandle sortHandle){
        this.sortHandle=sortHandle;
    }

    public int sort(Object array){
        sortHandle.setArray(array);
        length=sortHandle.length();
        operations=0;
        if (length<=1){
            return operations;
        }
        for(int nextToLast=length-2;nextToLast>=0;nextToLast--){
            for(int index=0;index<=nextToLast;index++){
                if(sortHandle.outOfOrder(index)){
                    sortHandle.swap(index);
                }
                operations++;
            }
        }
        return operations;
    }
}
