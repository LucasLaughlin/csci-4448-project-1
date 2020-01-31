package zoo.src;

/*Hippo class
 * from Animals hippos have: name, sleep boolean
 * from Animals hippos can: wakeup, sleep, roam, makenoise and eat
 * from pachyderms: roam by lumbering
 * Hippos: make hippo noises
 */
public class Hippo extends Pachyderm{ //extends Animal

    public Hippo(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " makes hippo noises");
    }
}