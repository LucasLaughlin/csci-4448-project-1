package zoo.src;

/*Dog class
 * from Animals dogs have: name, sleep boolean
 * from Animals dogs can: wakeup, sleep, makenoise and eat
 * from Canines: roam by trotting
 * Dogs: make noise by barking
 */
public class Dog extends Canine{ //extends Animal

    public Dog(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " barks like a dog");
    }
}