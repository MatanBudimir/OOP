package hr.fer.oop.pete.cetvrti;

public class MP3Player extends Device implements Portable {
    private int batterCapacity;
    private int memorySize;

    public MP3Player(String model, String manufacturer, int batterCapacity, int memorySize) {
        super(model, manufacturer);
        this.batterCapacity = batterCapacity;
        this.memorySize = memorySize;
    }

    public int getBatteryCapacity() {
        return batterCapacity;
    }

    public void setBatterCapacity(int batterCapacity) {
        this.batterCapacity = batterCapacity;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}
