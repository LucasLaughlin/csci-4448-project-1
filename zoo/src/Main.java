package zoo.src;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main{

    public static void main(String [] args) throws FileNotFoundException {
        // All animals at the zoo
        Animal animals[] = new Animal[16];
        animals[0] = new Hippo("Henry");
        animals[1] = new Hippo("Harry");
        animals[2] = new Elephant("Edward");
        animals[3] = new Elephant("Elice");
        animals[4] = new Rhino("Ricky");
        animals[5] = new Rhino("Rachael");
        animals[6] = new Tiger("Tim");
        animals[7] = new Tiger("Tammy");
        animals[8] = new Lion("Lucas");
        animals[9] = new Lion("Lucy");
        animals[10] = new Cat("Carey");
        animals[11] = new Cat("Coswald");
        animals[12] = new Wolf("Wendy");
        animals[13] = new Wolf("Will");
        animals[14] = new Dog("Dingo");
        animals[15] = new Dog("Darby");

        Zookeeper zookeep = new Zookeeper();

        //print to out file
        PrintStream fileOut = new PrintStream("./dayatthezoo.out");
        System.setOut(fileOut);

        // Zookeeper performs each chore, all animals respond accordingly
        zookeep.wakeAnimals();
        for (int i = 0;i<animals.length;i++){
            animals[i].wakeUp();
        }
        System.out.println("");
        
        zookeep.rollCallAnimals();
        for (int i = 0;i<animals.length;i++){
            animals[i].makeNoise();
        }
        System.out.println("");
        
        zookeep.feedAnimals();
        for (int i = 0;i<animals.length;i++){
            animals[i].eat();
        }
        System.out.println("");

        zookeep.excerciseAnimals();
        for (int i = 0;i<animals.length;i++){
            animals[i].roam();
        }
        System.out.println("");

        zookeep.shutdownZoo();
        for (int i = 0;i<animals.length;i++){
            animals[i].sleep();
        }
        System.out.println("");
    }
}