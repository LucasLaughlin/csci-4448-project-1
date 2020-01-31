package zoo.src;

/*Rhino class
 * from Animals rhinos have: name, sleep boolean
 * from Animals rhinos can: wakeup, sleep, roam, makenoise and eat
 * from pachyderms: roam by lumbering
 * Rhino: make rhino noises
 */
public class Rhino extends Pachyderm{ //extends Animal

    public Rhino(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " makes rhino noises");
    }
}