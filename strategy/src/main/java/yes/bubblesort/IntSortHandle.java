package yes.bubblesort;
/**
 *对于冒泡排序，各种类型的数组存在的差异性由各自的SortHandle接口实现，
 * 而对于排序方法来说，各种类型的数组排序算法是一样的，
 * 所以IntSortHandle等实现SortHandle接口的各个实现类实现了不同数据类型的差异，
 * 而共性的sort方法则继承自BubbleSorter
 */
public class IntSortHandle implements SortHandle{

    private int[] array;
    @Override
    public void swap(int index) {
        int temp=array[index];
        array[index]=array[index+1];
        array[index+1]=temp;
    }

    @Override
    public boolean outOfOrder(int index) {
        return array[index]>array[index+1];
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public void setArray(Object array) {
        this.array=(int[])array;

    }

}
