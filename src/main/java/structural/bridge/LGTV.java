package structural.bridge;

public class LGTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turn On LGTV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off LGTV");
    }

    @Override
    public void setChannel(int channelNumber) {
        System.out.println("Set Channel On LGTV : " + channelNumber);
    }
}
