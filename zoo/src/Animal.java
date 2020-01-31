package zoo.src;

/*Animal class
 * animals have: name, sleep boolean
 * aimals can: wakeup, sleep, roam, makenoise and eat
 */
public class Animal{

    private String name;
    private boolean isAsleep;

    public Animal(String name){
        this.name = name;
        this.isAsleep = true;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getIsAsleep(){
        return this.isAsleep;
    }

    // Can only wake up if previously asleep
    public void wakeUp(){
        if(this.isAsleep){
            this.isAsleep = false;
            System.out.println(this.name + " the " + this.getClass().getSimpleName()+ " woke up");
        }
        else{
            System.out.println(this.name + " the " + this.getClass().getSimpleName()+ " is already awake");
        }
    }
    // Can only sleep if previously awake
    public void sleep(){
        if(!this.isAsleep){
            this.isAsleep = true;
            System.out.println(this.name + " the " + this.getClass().getSimpleName()+ " went to sleep");
        }
        else{
            System.out.println(this.name + " the " + this.getClass().getSimpleName()+ " is already asleep");
        }
        
    }
    public void roam(){
        System.out.println(this.name + " the " + this.getClass().getSimpleName()+ " roams around its enclosure");
    }
    public void makeNoise(){
        System.out.println(this.getName()+ " the " + this.getClass().getSimpleName() + " makes an animalistic grunt");
    }

    public void eat(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName() + " ate and is full");
    }
}