public class Gorilla extends Mammal {
    
    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public void throwSomething() {
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy -= 5);
        System.out.println("Gorilla throws");
    }

    public void eatBananas() {
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy += 10);
        System.out.println("Gorilla Eats Banana");
    }
}
