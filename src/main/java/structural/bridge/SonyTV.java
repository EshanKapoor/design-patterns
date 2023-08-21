package structural.bridge;

public class SonyTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turn On SonyTV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off SonyTV");
    }

    @Override
    public void setChannel(int channelNumber) {
        System.out.println("Set Channel On SonyTV : " + channelNumber);
    }
}
