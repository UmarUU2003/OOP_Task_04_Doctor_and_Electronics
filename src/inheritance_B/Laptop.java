package inheritance_B;

public class Laptop extends Computer{
    private final String brand;
    private final String model;
    private final String processorName;

    public Laptop(String[] portNames, int ram, int rom, String brand, String model, String processorName) {
        super(portNames, ram, rom);
        this.brand = brand;
        this.model = model;
        this.processorName = processorName;
    }

    @Override
    public void deviceInfo() {

    }

    @Override
    public void keyBoardInput() {

    }

    @Override
    public void monitorOutput() {

    }

    @Override
    public void connectingToInternet() {

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProcessorName() {
        return processorName;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }
}
