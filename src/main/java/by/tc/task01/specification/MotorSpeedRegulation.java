package by.tc.task01.specification;

public class MotorSpeedRegulation implements SetAttribute {
    private int motorSpeed;

    @Override
    public void setAttribute(String value) {
        this.motorSpeed = Integer.parseInt(value);
    }

    public int getMotorSpeed() {
        return motorSpeed;
    }
}
