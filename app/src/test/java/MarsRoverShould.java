import marsrovers.kata.MarsRover;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {
    //Dado que el Rover está mirando hacia el sur (S), y gira a la izquierda (L), pues acaba mirando al este (E)

    //Arrange: variables

    // Act: logica negocio

    //Assert: manera de ver si el test está ok o ko

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
}