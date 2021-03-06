package core.markdownStats.commit_4.src;

public class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
