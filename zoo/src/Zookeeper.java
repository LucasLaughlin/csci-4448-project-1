package zoo.src;

/*Zookeeper class
 * can: wakeup animals, roll call animals, feed animals, excercise animals, shutdown the zoo
 */
public class Zookeeper{

    public Zookeeper(){
    }

    public void wakeAnimals(){
        System.out.println("The zookeeper begins shaking the animals awake");
    }

    public void rollCallAnimals(){
        System.out.println("The zookeeper starts roll Calling animals");
    }

    public void feedAnimals(){
        System.out.println("The Zookeeper feeds all the animals pizza");
    }

    public void excerciseAnimals(){
        System.out.println("The zookeeper gets out his coaching whistle and excercises the animals");
    }

    public void shutdownZoo(){
        System.out.println("The zookeeper locks the gate and reads the animals a bedtime story");
    }
}
