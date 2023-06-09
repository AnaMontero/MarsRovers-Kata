package marsrovers.kata;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {
    private final String orientation;

    public MarsRover(String orientation) {
        this.orientation = orientation;
    }

    private String getOrientation() {
        return orientation;
    }

    public String turnLeft() {
        Map<String, String> orientationRelationsWhenTurningLeft = new HashMap<>() {{
            put("S", "E");
            put("E", "N");
            put("N", "W");
            put("W", "S");
        }};

        return orientationRelationsWhenTurningLeft.get(getOrientation());
    }

    public String turnRight() {
        Map<String, String> orientationRelationsWhenTurningRight = new HashMap<>() {{
            put("S", "W");
            put("W", "N");
            put("N", "E");
            put("E", "S");
        }};

        return orientationRelationsWhenTurningRight.get(getOrientation());
    }
}
