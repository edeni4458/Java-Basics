class Main {
    public static void main(String[] args) {
        Gorilla g = new Gorilla(100);
        g.throwSomething();
        g.eatBananas();

        g.throwSomething();
        g.throwSomething();
        g.throwSomething();

        g.eatBananas();
        g.eatBananas();

        Bat b = new Bat();
        b.displayEnergyLevel();
        b.fly();
        b.eatHumans();
        b.attackTown();
        
        System.out.println(g.displayEnergyLevel());
        System.out.println(b.displayEnergyLevel());
        
        Bat batzilla = new Bat();
        batzilla.displayEnergyLevel();
        System.out.println("What is this figure approaching the town... RUN!!!!");
        
        batzilla.attackTown();
        batzilla.attackTown();
        batzilla.attackTown();

        batzilla.eatHumans();
        batzilla.eatHumans();

        batzilla.fly();
        batzilla.fly();

        System.out.printf("The aftermath of a nightmare...", batzilla.displayEnergyLevel()); 

    }
}
