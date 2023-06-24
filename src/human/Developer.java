package human;

public class Developer extends Human{
    private String programingLanguage;

    public Developer(String name, boolean isStudent) {
        this(name, isStudent, "Undefined");
        System.out.println("aa");
    }

    public Developer(String name, boolean isStudent, String programingLanguage) {
        super(name, isStudent);
        this.programingLanguage = programingLanguage;
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }
}
