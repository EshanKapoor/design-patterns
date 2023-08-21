package structural.bridge;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int channelNumber) {
        device.setChannel(channelNumber);
    }

}
