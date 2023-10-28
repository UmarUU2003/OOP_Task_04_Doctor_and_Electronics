package inheritance_B;

public class PC extends Computer{
    private String monitorBrand;
    private String monitorModel;
    private String processorName;

    public PC(String[] portNames, int ram, int rom, String monitorBrand, String monitorModel, String processorName) {
        super(portNames, ram, rom);
        this.monitorBrand = monitorBrand;
        this.monitorModel = monitorModel;
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
}
