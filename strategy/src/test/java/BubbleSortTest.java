import junit.framework.TestCase;
import yes.bubblesort.BubbleSorter;
import yes.bubblesort.IntSortHandle;
import yes.bubblesort.SortHandle;

public class BubbleSortTest extends TestCase {

    public BubbleSortTest(String name){
        super(name);
    }
    public void testSort(){
        /**
         * 这个测试对照模板方法模式看，就不违反LSP,DIP原则了，
         * 因为SortHandle类可替换为IntSortHandle类,
         * 并且BubbleSorter类仅依赖一个SortHandle类
         */
        int[] arr={13,14,443,5,543,3,666,17};
        SortHandle handle=new IntSortHandle();
        BubbleSorter sorter=new BubbleSorter(handle);
        sorter.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
