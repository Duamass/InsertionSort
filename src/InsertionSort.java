import java.util.Arrays;

// 插入排序要进行n-1轮，每一轮在最坏情况下的比较复制次数分别是1次、2次...一直是n-1次，所以最坏时间复杂度是o(n^2)
// 至于空间复杂度，由于插入排序是在原地进行排序，并没有引入额外的数据结构，所以空间复杂度o(1).
public class InsertionSort {
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int insertValue = array[i];
            int j = i-1;
            for ( ; j>=0 && insertValue<array[j] ; j--) {
                array[j+1] = array[j];
            }
            //insertValue的值插入适当的位置
            array[j+1] = insertValue;

        }
    }

    public static void main(String[] args) {
        int array []={12,1,3,46,5,0,-3,12,35,16};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}

/*总结：冒泡排序、选择排序、插入排序之间的差别
  从性能上来看，冒泡排序和插入排序的元素比较交换次数取决于原始数组的有序程度。如果大部分元素是无序的，
  则插入排序的性能略高于冒泡排序。选择排序和前两者不一样，他的元素比较交换次数是固定的，和原始数组有序程度无关。
  因此，当原始数组接近有序时，插入排序性能最优；当原始数组大部分元素无序时，选择排序性能最优。

  从稳定性来看，冒泡排序和插入排序是稳定排序，选择排序不是。
*/