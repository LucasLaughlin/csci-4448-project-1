package zoo.src;

/*Wolf class
 * from Animals wolves have: name, sleep boolean
 * from Animals wolves can: wakeup, sleep, makenoise and eat
 * from Canines: roam by trotting
 * Wolves: make noise by howling
 */
public class Wolf extends Canine{ //extends Animal

    public Wolf(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " howls like a wolf");
    }
}