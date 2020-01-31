package zoo.src;

/*Lion class
 * from Animals lions have: name, sleep boolean
 * from Animals lions can: wakeup, sleep, roam, makenoise and eat
 * from felines: roam by prowling
 * Lions: make noise by Growling like a lion
 */
public class Lion extends Feline{ //extends Animal

    public Lion(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " growls like a Lion");
    }
}