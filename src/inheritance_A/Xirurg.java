package inheritance_A;

public class Xirurg extends Doctor{
    public Xirurg(String fullName, String specialization, String qualification) {
        super(fullName, specialization, qualification);
    }

    @Override
    public void consultation() {
        // konsultatsiya berish
    }

    @Override
    public void treat() { // davolash
        diagnose();    // tashxis qo'yish
        doOperation(); // operatsiya qilish
        prescribe();   // dorilar yozib berish
    }
    @Override
    public void prescribe(){

    }
    public void doOperation(){

    }
    public void diagnose(){

    }

    @Override
    public void info() {
        System.out.println("--------------------");
        System.out.println("Xirurg info:");
        System.out.println("--------------------");
        System.out.println("To'liq ismi : " + getFullName());
        System.out.println("Mutaxassisligi : " + getSpecialization());
        System.out.println("Tajribasi : " + getQualification());
    }

}
