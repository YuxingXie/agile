import bubblesort.templatemethod.IntBubbleSorter;
import junit.framework.TestCase;

public class BubbleSortTest extends TestCase {
    public void test(){
        //very bad,无端多出一个sort方法，排序竟然不是调用doSort方法
        int[] array={12,11,111,23,45,456,4};
        IntBubbleSorter bubbleSorter=new IntBubbleSorter();//违反LSP,DIP
        bubbleSorter.sort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
