import marsrovers.kata.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {
    //Dado que el Rover está mirando hacia el sur (S), y gira a la izquierda (L), pues acaba mirando al este (E)

    //Arrange: variables

    // Act: logica negocio

    //Assert: manera de ver si el test está ok o ko

    @Test
    public void lookEastWhenTurningLeftAndOriginalDirectionIsSouth(){
        var expected = "E";
        MarsRover rover = new MarsRover("S");
        String actual = rover.turnLeft();
        assertEquals(expected, actual);
    }

    @Test
    public void lookNorthWhenTurningLeftAndOriginalDirectionIsEast(){
        var expected = "N";
        MarsRover rover = new MarsRover("E");
        String actual = rover.turnLeft();
        assertEquals(expected, actual);
    }

    @Test
    public void lookWestWhenTurningLeftAndOriginalDirectionIsNorth(){
        var expected = "W";
        MarsRover rover = new MarsRover("N");
        String actual = rover.turnLeft();
        assertEquals(expected, actual);
    }
}
