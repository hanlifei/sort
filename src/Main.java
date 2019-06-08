import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {


        ReferenceQueue<Test> queue = new ReferenceQueue();
        Test heapObj = new Test();

        heapObj.setStr("还存在");

        SoftReference<Test> softReference = new SoftReference<Test>(heapObj);
        WeakReference<Test> weakReference = new WeakReference<Test>(heapObj);
//        PhantomReference<Test> phantomReference = new PhantomReference<Test>(heapObj, queue);
//        System.out.println("软引用---------------------------" + softReference.get().getStr());
//        System.out.println("弱引用---------------------------" + weakReference.get().getStr());
//        System.out.println("虚引用---------------------------" + queue.poll().get().getStr());

        heapObj = null;

        System.gc();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("软引用---------------------------" + softReference.get().getStr());
        System.out.println("弱引用---------------------------" + weakReference.get().getStr());
//        System.out.println("虚引用---------------------------" + phantomReference.get().getStr());

    }

    public static class Test{

        private String str;

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }

    public static int[] buildArray() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = ((Double)Math.floor(Math.random() * 1000)).intValue();
        }
        return result;
    }

    public static void sout(String message, int[] array) {
        int[] result = new int[10];
        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void swap(int[] array, int index1, int index2) {
        //交换无序后列中首元素与最大元素的位置
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
