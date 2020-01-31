package zoo.src;

/*Tiger class
 * from Animals tigers have: name, sleep boolean
 * from Animals tigers can: wakeup, sleep, roam, makenoise and eat
 * from felines: roam by prowling
 * Tigers: make noise by Growling like a tiger
 */
public class Tiger extends Feline{ 

    public Tiger(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " growls like a Tiger");
    }
}