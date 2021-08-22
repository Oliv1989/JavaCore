import java.util.ArrayList;

public class Box<T> {
    private T obj;

    public Box() {}
    public Box(T obj) {this.obj = obj;}

    public T getObj() {return obj;}

    public void setObj(T obj) {this.obj = obj;}

    public void showType() {System.out.println("Тип T: " + obj.getClass().getName());}

    public void compare(Box box) {
        if (box.getClass() == obj.getClass() | box.equals(obj)) {
            System.out.println("Объекты одинакового класса");
            if (box.getObj() == this.obj){
                System.out.println("Объекты одинаковые");
            }
        } else {System.out.println("Объекты разного класса");}
    }
}
