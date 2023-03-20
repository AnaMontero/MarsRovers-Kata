import marsrovers.kata.MarsRover;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {
    @ParameterizedTest
    @CsvSource({
            "S, E",
            "E, N",
            "N, W",
            "W, S"
    })
    public void turnLeftDependingOnCurrentPosition(String currentOrientation, String expectedOrientation){
        MarsRover rover = new MarsRover(currentOrientation);
        String actual = rover.turnLeft();
        assertEquals(expectedOrientation, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "S, W"
    })
    public void turnRightDependingOnCurrentPosition(String currentOrientation, String expectedOrientation){
        MarsRover rover = new MarsRover(currentOrientation);
        String actual = rover.turnRight();
        assertEquals(expectedOrientation, actual);
    }
}