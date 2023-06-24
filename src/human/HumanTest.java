package human;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human4 = new Human("name", true);
        Human human5 = new Human("name", "sName");

        // name -> private
        //human1.name = "Igor";
        human1.setName("Igor");
        System.out.println(human1.getName());

        {
            Human h = new Human();
            Human h1 = new Human();
            Human h2 = new Human();
        }

        //not static
        //Human.name = "a";

        human1.setsName("Petrov");
        System.out.println(human1.getsName());

        human1.setlName("Petrivich");
        System.out.println(human1.getlName());

        human1.setStudent(true);
        System.out.println(human1.isStudent());

        Human human2 = new Human();
        human2.setName("Goga");
        System.out.println(human2.getName());

        System.out.println("Human.amountOfChromosome = " + Human.amountOfChromosome);
        System.out.println("human2.amountOfChromosome = " + human2.amountOfChromosome);
        System.out.println("human1.amountOfChromosome = " + human1.amountOfChromosome);

        Human.amountOfChromosome = 47;

        System.out.println("Human.amountOfChromosome = " + Human.amountOfChromosome);
        System.out.println("human2.amountOfChromosome = " + human2.amountOfChromosome);
        System.out.println("human1.amountOfChromosome = " + human1.amountOfChromosome);

        human2.amountOfChromosome = 48; //human2 =>  Human.amountOfChromosome = 47;

        System.out.println("Human.amountOfChromosome = " + Human.amountOfChromosome);
        System.out.println("human2.amountOfChromosome = " + human2.amountOfChromosome);
        System.out.println("human1.amountOfChromosome = " + human1.amountOfChromosome);

        human2.printStudentInfo();


        // polimorfism

        Developer dev = new Developer("name", true);
        dev.setlName("lName");
        dev.getProgramingLanguage();
        dev.setProgramingLanguage("");

        Human humanDev = dev;
        humanDev.printStudentInfo();
        //humanDev.getProgramingLanguage();
        //humanDev.setProgramingLanguage("");


        Human[] humans = new Human[10];

        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                humans[i] = new Developer("name" + i, true);
            } else {
                humans[i] = new Tester();
            }
        }

        printStudentInfo(humans);

        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");

        Tester[] testers = new Tester[10];

        for (int i = 0; i < 10; i++) {
            testers[i] = new Tester();
        }

        printStudentInfo(testers);

    }

    public static void printStudentInfo(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            humans[i].printStudentInfo();
        }
    }
}
