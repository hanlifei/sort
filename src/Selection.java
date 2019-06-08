public class Selection {

    public static void main(String[] args) {
        int[] array = Main.buildArray();
        Main.sout("排序前", array);
        int[] sortResult = sort(array);
        Main.sout("排序后", sortResult);
    }

    /**
     *  1.将序列分为两段，有序前列[0,r)和无序后列[r,n-1]
     *  2.在无序后列中查找最大元素s=A[m]，记住其所在位置
     *  3.将无序后列中的最大元素与无序前列的首位元素进行交换
     *  4.循环停止标识：无序后列只剩余最后一个元素
     */
    private static int[] sort(int[] array) {
        int[] sortArray = array.clone();
        for (int i = 0; i < sortArray.length; i++) {
            int maxIndex = i;
            for (int i1 = i + 1; i1 < sortArray.length; i1++) {
                if (sortArray[i1] > sortArray[maxIndex]) {
                    maxIndex = i1;
                }
            }
            if (maxIndex != i) {
                Main.swap(sortArray, i, maxIndex);
            }
        }
        return sortArray;
    }
}
