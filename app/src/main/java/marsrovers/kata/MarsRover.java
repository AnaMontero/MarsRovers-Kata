package marsrovers.kata;

import java.util.HashMap;

public class MarsRover {
    private final String orientation;

    public MarsRover(String orientation) {
        this.orientation = orientation;
    }

    private String getOrientation() {
        return orientation;
    }

    public String turnLeft() {
        HashMap<String, String> relacionDeGiroALaDerecha = new HashMap<String, String>();

        relacionDeGiroALaDerecha.put("S", "E");
        relacionDeGiroALaDerecha.put("E", "N");
        relacionDeGiroALaDerecha.put("N", "W");
        relacionDeGiroALaDerecha.put("W", "S");

        return relacionDeGiroALaDerecha.get(getOrientation());
    }

}
