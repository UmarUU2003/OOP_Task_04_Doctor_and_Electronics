package inheritance_B;

public abstract class Computer implements Electronics{
    protected final String[] portNames;
    protected int ram;
    protected int rom;

    protected Computer(String[] portNames, int ram, int rom) {
        this.portNames = portNames;
        this.ram = ram;
        this.rom = rom;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public abstract void deviceInfo();
    public abstract void keyBoardInput();
    public abstract void monitorOutput();
    public abstract void connectingToInternet();
}
