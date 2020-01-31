package zoo.src;

/*Elephant class
 * from Animals elephants have: name, sleep boolean
 * from Animals elephants can: wakeup, sleep, roam, makenoise and eat
 * from pachyderms: roam by lumbering
 * Elephant: make elephant noises
 */
public class Elephant extends Pachyderm{ //extends Animal

    public Elephant(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " makes elephant noises");
    }
}