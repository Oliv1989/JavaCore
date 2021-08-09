public interface Challengers {
    default void actionOnBarries(Barriers barriers) {
        if (barriers instanceof Wall) {
            Wall wall = (Wall) barriers;
            this.JumpOverWall(wall);
        }
        else if (barriers instanceof Racetrack) {
            Racetrack racetrack = (Racetrack) barriers;
            this.RunOnRacetrack(racetrack);
        }
    }
    void setStatus(boolean status);
    boolean getStatus();
    void JumpOverWall(Wall wall);
    void RunOnRacetrack(Racetrack racetrack);
}
