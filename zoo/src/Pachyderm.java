package zoo.src;

/*Pachyderm class
 * from Animals pachyderms have: name, sleep boolean
 * from Animals pachyderms can: wakeup, sleep, roam, makenoise and eat
 * pachyderms specifically: roam by lumbering
 */
public class Pachyderm extends Animal{

    public Pachyderm(String name){
        super(name);
    }

    public void roam(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " lumbers around its enclosure");
    }
}