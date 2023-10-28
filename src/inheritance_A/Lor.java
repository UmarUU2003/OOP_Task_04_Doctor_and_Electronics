package inheritance_A;

public class Lor extends Doctor{

    public Lor(String fullName, String specialization, String qualification) {
        super(fullName, specialization, qualification);
    }

    @Override
    public void consultation() {
        // konsultatsiya berish
    }

    @Override
    public void treat() {
        diagnoseEar();
        diagnoseThroat();
        prescribe();
    }
    @Override
    public void prescribe(){

    }
    public void diagnoseEar(){

    }
    public void diagnoseThroat(){

    }

    @Override
    public void info() {
        System.out.println("--------------------");
        System.out.println("Lor info:");
        System.out.println("--------------------");
        System.out.println("To'liq ismi : " + getFullName());
        System.out.println("Mutaxassisligi : " + getSpecialization());
        System.out.println("Tajribasi : " + getQualification());
    }
}
