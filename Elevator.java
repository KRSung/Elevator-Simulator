import java.util.*;

public class Elevator {
    private int mCurrentFloor;
    private int mDestinationFloor;

    enum currentDirection {
        UP,
        DOWN,
        NOT_MOVING
    }

    enum currentState{
        DLE_STATE,
        DOORS_OPENING,
        UNLOADING_PASSENGERS,
        LOADING_PASSENGERS,
        DOORS_CLOSING,
        ACCELERATING,
        MOVING,
        DECELERATING
    }

    public static void main(String[] args) {

    }
}
