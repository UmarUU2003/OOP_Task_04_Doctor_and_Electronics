package inheritance_B;

public class Sound implements Electronics{
    protected int frequency;
    protected int wavelength;
    protected final String brand;
    protected final String model;

    public Sound(int frequency, int wavelength, String brand, String model) {
        this.frequency = frequency;
        this.wavelength = wavelength;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public void changeFrequency(int frequency){

    }
    public void changeVolume(){

    }
}
