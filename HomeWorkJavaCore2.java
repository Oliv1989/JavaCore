import java.lang.String;
import java.lang.Object;

public class HomeWorkJavaCore2 {
    public static void main(String[] args) throws MyArrayDataException {
        int result = 0;
        Object[][] arr1 = new Object[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        Object[][] arr2 = new Object[][]{{'1','2','3','4'},{'1','2','3','4'},{'1','2','3','4'},{'1','2','3','4'}};
        Object[][] arr3 = new Object[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        Object[][] arr4 = new Object[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3}};
        Object[][] arr5 = new Object[][]{{"One", "Two","Three","Four"},{"One", "Two","Three","Four"},
                {"One", "Two","Three","Four"},{"One", "Two","Three","Four"}};
        Object[][] final_arr = arr5;
        try {
            checkedMyArraySize(final_arr);
            checkedMyArrayData(final_arr);
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    result += Integer.parseInt(String.valueOf(final_arr[i][j]));
                }
            }
            System.out.println(result);
        } catch (MyArrayDataException e) {System.out.println("Array data isn`t a number");}
    }

    public static void checkedMyArrayData(Object[][] o) throws MyArrayDataException{
        try {
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    int x = Integer.parseInt(String.valueOf(o[i][j]));
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException();
        }
    }

    public static void checkedMyArraySize(Object[][] o){
        try {
            for (int i = 0; i <= 3; i++) {
                if (o[i].length != 4 | o.length != 4) throw new MyArraySizeException();
            }
        } catch (MyArraySizeException e) {
            System.out.println("Exception: "+e.toString());
            System.exit(1);
        }
    }
}
