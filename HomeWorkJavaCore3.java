public class HomeWorkJavaCore3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayElementsChanger[] tmp = new ArrayElementsChanger[]{};
        ArrayElementsChanger.change(arr,0,1);
        for (int x: arr) {
            System.out.print(x+" ");
        }
        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(2);
        Apple apple3 = new Apple(3);
        Apple apple4 = new Apple(4);
        Apple apple5 = new Apple(5);
        Apple apple6 = new Apple(5);
        Orange orange1 = new Orange(2);
        Orange orange2 = new Orange(3);
        Orange orange3 = new Orange(4);
        Orange orange4 = new Orange(5);
        Orange orange5 = new Orange(6);
        Apple[] apples = new Apple[]{apple1, apple2, apple3, apple4, apple5};
        Orange[] oranges = new Orange[]{orange1, orange2, orange3, orange4, orange5};
        Box<Apple[]> box1 = new Box<>(apples);
        Box<Orange[]> box2 = new Box<>(oranges);
        Box<Orange[]>  box3 = new Box();
        Box<Apple[]>  box4 = new Box();
        System.out.println(getWeightAppleBox(box1));
        //System.out.println(getWeightOrangeBox(box2));
        box1.compare(box2);//не работает корректно
        box1.compare(box1);//не работает корректно
        System.out.println(box3.getObj());
        OrangeboxSorter(box2,box3);
        System.out.println(box3.getObj());
        //System.out.println(box4.getObj());
        //AppleboxSorter(box1,box4);
        //System.out.println(box4.getObj());
    }

    public static int getWeightAppleBox(Box<Apple[]> box) {
        int sum = 0;
        for (int i = 0; i < box.getObj().length; i++) {
            sum += box.getObj()[i].weight;
        }
        return sum;
    }

    public static int getWeightOrangeBox(Box<Orange[]> box) {
        int sum = 0;
        for (int i = 0; i < box.getObj().length; i++) {
            sum += box.getObj()[i].weight;
        }
        return sum;
    }

    public static void OrangeboxSorter(Box<Orange[]> boxFrom, Box<Orange[]> boxTo) {
        Orange[] oranges_tmp = new Orange[boxFrom.getObj().length];
        for (int i = 0; i < boxFrom.getObj().length; i++) {
            oranges_tmp[i] = boxFrom.getObj()[i];
        }
        boxTo.setObj(oranges_tmp);
    }

    public static void AppleboxSorter(Box<Apple[]> boxFrom, Box<Apple[]> boxTo) {
        Apple[] apples_tmp = new Apple[boxFrom.getObj().length];
        for (int i = 0; i < boxFrom.getObj().length; i++) {
            apples_tmp[i] = boxFrom.getObj()[i];
        }
        boxTo.setObj(apples_tmp);
    }
}
