package by.tc.task01.entity;

import java.util.Objects;

public class Speakers implements Appliance {
    private int powerConsumption;
    private int number;
    private String frequencyRange;
    private int cordLength;

    public Speakers() {
    }

    public Speakers(int powerConsumption, int number, String frequencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.number = number;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getNumber() {
        return number;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return powerConsumption == speakers.powerConsumption && number == speakers.number && cordLength == speakers.cordLength && Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, number, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" +
                "powerConsumption=" + powerConsumption +
                ", number=" + number +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength + ']'
                ;
    }

    // you may add your own code here
}
