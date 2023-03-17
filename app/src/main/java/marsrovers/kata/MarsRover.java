package marsrovers.kata;

public class MarsRover {
    private final String orientation;

    public MarsRover(String orientation) {
        this.orientation = orientation;
    }

    private String getOrientation() {
        return orientation;
    }

    public String turnLeft() {
        if (getOrientation().equals("S")){
            return "E";
        }
        if (getOrientation().equals("N")){
            return "W";
        }
    return "N";
    }

}
