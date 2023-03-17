package marsrovers.kata;

public class MarsRover {
    private final String orientation;

    public MarsRover(String orientation) {
        this.orientation = orientation;
    }

    public String getOrientation() {
        return orientation;
    }

    public String turnLeft() {
        if (getOrientation().equals("S")){
            return "E";
        }
    return "N";
    }

}
