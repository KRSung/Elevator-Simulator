import java.util.*;

public class Elevator {
    private int mCurrentFloor;
    private int mDestinationFloor;
    private int mElevatorNum;
    private String mCurrentState;

    public Elevator(int mElevatorNum, String a){
        mCurrentState = currentState.IDLE_STATE.name();
    }


    enum currentDirection {
        UP,
        DOWN,
        NOT_MOVING
    }

    enum currentState{
        IDLE_STATE,
        DOORS_OPENING,
        UNLOADING_PASSENGERS,
        LOADING_PASSENGERS,
        DOORS_CLOSING,
        ACCELERATING,
        MOVING,
        DECELERATING
    }

    // updates the current state of the elevator
    public void tick(){

    }

    // represents the overall state of the elevator
    public String toString(){
        return null;
    }

    public static void main(String[] args) {

    }
}
