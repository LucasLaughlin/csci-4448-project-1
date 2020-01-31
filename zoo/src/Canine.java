package zoo.src;

/*Canine class
 * from Animals canines have: name, sleep boolean
 * from Animals canines can: wakeup, sleep, makenoise and eat
 * Canines specifically: roam by trotting
 */
public class Canine extends Animal{

    public Canine(String name){
        super(name);
    }

    public void roam(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " trots around its enclosure");
    }
}