import marsrovers.kata.MarsRovers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoversShould {
    @ParameterizedTest
    @CsvSource({
            "S, E",
            "E, N",
            "N, W",
            "W, S"
    })
    public void turnLeftDependingOnCurrentPosition(String currentOrientation, String expectedOrientation){
        MarsRovers rover = new MarsRovers(currentOrientation);
        String actual = rover.turnLeft();
        assertEquals(expectedOrientation, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "S, W",
            "W, N",
            "N, E",
            "E, S"
    })
    public void turnRightDependingOnCurrentPosition(String currentOrientation, String expectedOrientation){
        MarsRovers rover = new MarsRovers(currentOrientation);
        String actual = rover.turnRight();
        assertEquals(expectedOrientation, actual);
    }
}