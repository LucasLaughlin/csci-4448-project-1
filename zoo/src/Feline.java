package zoo.src;

/*Feline class
 * from Animals felines have: name, sleep boolean
 * from Animals felines can: wakeup, sleep, roam, makenoise and eat
 * felines specifically: roam by prowling
 */
public class Feline extends Animal{

    public Feline(String name){
        super(name);
    }

    public void roam(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " prowls around its enclosure");
    }
}