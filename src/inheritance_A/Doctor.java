package inheritance_A;

public abstract class Doctor {
    private String fullName;
    private String specialization;
    private String qualification;

    public Doctor(String fullName, String specialization, String qualification) {
        this.fullName = fullName;
        this.specialization = specialization;
        this.qualification = qualification;
    }

    public abstract void consultation();
    public abstract void treat(); // uzb : davolamoq
    public abstract void prescribe();
    public abstract void info();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
