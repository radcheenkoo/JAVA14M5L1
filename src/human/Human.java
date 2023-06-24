package human;

public class Human {
    public Human() {
        this.isStudent = true;
        this.name = "noname";
    }

    public Human(String name, String sName) {
        this.name = name;
        this.sName = sName;
    }

    public Human(String name, boolean isStudent) {
        this.name = name;
        this.isStudent = isStudent;
    }

    // private, public, protected, <package default>

    public static int amountOfChromosome = 46;

    private String name;
    private String sName;
    private String lName;
    private boolean isStudent;

//    protected String sName;
//    public String lName;
//    boolean isStudent;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getsName() {
        return this.sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getlName() {
        return this.lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public boolean isStudent() {
        return this.isStudent;
    }

    public void setStudent(boolean student) {
        this.isStudent = student;
        printAmountOfChromosome();
    }

    public void printStudentInfo() {
        System.out.println("Student name = " + name + " sNma = " + sName);
    }

    public static void printAmountOfChromosome() {
        System.out.println(amountOfChromosome);
    }
}
