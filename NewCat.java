public class NewCat implements Challengers{
    public boolean status = true;
    private static String name;
    private static int maxDistance;
    private static int maxHeight;

    public NewCat(){};

    public NewCat(String name, int maxDistance, int maxHeight){
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    };

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean getStatus() {return this.status;}

    public void Run() {
        System.out.println(String.format("%s пробежал(а) %d метр(-ов)",name, maxDistance));
    }

    @Override
    public void RunOnRacetrack(Racetrack Racetrack) {
        if (Racetrack.distance >= maxDistance) {
            System.out.println(String.format("%s не смог(ла) пробежать %s",name, Racetrack.name));
            status = false;
        }
        else {
            System.out.println(String.format("%s пробежал(а) %s",name, Racetrack.name));
        }
    }

    public void Jump() {
        System.out.println(String.format("%s подпрыгнул(а) на %d метр(-ов)",name, maxHeight));
    }

    @Override
    public void JumpOverWall(Wall Wall) {
        if (Wall.height >= maxHeight) {
            System.out.println(String.format("%s не смог(ла) перепрыгнуть %s",name, Wall.name));
            status = false;
        }
        else {
            System.out.println(String.format("%s перепрыгнул(а) %s",name, Wall.name));
        }
    }
}
