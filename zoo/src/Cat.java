package zoo.src;

/*Cat class
 * from Animals cats have: name, sleep boolean
 * from Animals cats can: wakeup, sleep, roam, makenoise and eat
 * from felines: roam by prowling
 * Cats: make noise by meowing
 */
public class Cat extends Feline{ //extends Animal

    public Cat(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " meows like a cat");
    }

    public void sleep(){
        if(!this.getIsAsleep()){
            //Cat randomness has 3 responses when being told to go to bed
            double catRandomness = Math.random(); 
            if (catRandomness<0.33){
                System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " looks the zookeeper in the eye and says: \"eat shit\". weird ");
                return;    
            }
            if (catRandomness>0.66){
                System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " begins cleaning himself");    
                return;
            }
            else{
                super.sleep();
            }
        }
        else{
            System.out.println(this.getName() + " the " + this.getClass().getSimpleName()+ " is already asleep");
        }
        
    }
}