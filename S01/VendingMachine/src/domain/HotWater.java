package domain;

public class HotWater extends Product {
    private double temperature;
    private double volume;

    public HotWater(long id, String name, double price, int place, double volume, double temperature) {
        super(id, name, price, place);
        this.volume = volume;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " HotWater: temperature=" + temperature + ", volume=" + volume + "";
    }

}
