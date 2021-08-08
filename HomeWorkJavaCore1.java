import java.lang.reflect.Array;

public class HomeWorkJavaCore1 {
    public static void main(String[] args) {
        Human Human1 = new Human("Vasya",10,1);
        Robot Robot1 = new Robot("X10",100,10);
        NewCat NewCat1 = new NewCat("Barsik",20,2);
        Racetrack Racetrack1 = new Racetrack("insane racetrack", 50);
        Racetrack Racetrack2 = new Racetrack("medium racetrack", 20);
        Racetrack Racetrack3 = new Racetrack("easy racetrack", 10);
        Wall Wall1 = new Wall("the highest wall", 5);
        Wall Wall2 = new Wall("medium wall", 2);
        Wall Wall3 = new Wall("low wall", 1);
        Barriers[] barriers = {Racetrack1,Wall1,Racetrack2,Wall2,Racetrack3,Wall3};
        Challengers[] challengers = {Human1,Robot1,NewCat1};
        for (Challengers challenger: challengers) {
            for (Barriers barrier: barriers) {
                if (challenger.getStatus()) {
                    challenger.actionOnBarries(barrier);
                }
            }
        }
    }
}
