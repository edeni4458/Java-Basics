public class Bat extends Mammal {
    

    public Bat() {
        super(300);  
    }
    public void fly() {
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy -= 50);
        System.out.println("Bat flies: Shhhhoooom" );
    }
    public void eatHumans() {
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy += 50);
        System.out.println("Bat Consumes: EEEHH-HH!");
        
    }
    public void attackTown() {
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy -= 100);
        System.out.println("Bat attacks: HAAAAAA!! Run for your lives!!!! ");
    }


}
