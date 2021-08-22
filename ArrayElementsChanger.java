public class ArrayElementsChanger {
    public static void change(int[] array, int index_x, int index_y) {
        int tmp = array[index_x];
        array[index_x] = array[index_y];
        array[index_y] = tmp;
    }
}
