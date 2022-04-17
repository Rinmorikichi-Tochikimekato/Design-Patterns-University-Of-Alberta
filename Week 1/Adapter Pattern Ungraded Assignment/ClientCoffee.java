public class ClientCoffee{
    private CoffeeMachineInterface coffeeMachineInterface;
    
    public ClientCofee(CoffeeMachineInterface coffeeMachineInterface){
        this.coffeeMachineInterface = coffeeMachineInterface;
    }

    public void fetchCoffee(int coffeeType){
        System.out.println("Which cofee do you want 1 or 2");
        if(coffeeType == 1)
            this.cofeeMachineInterface.chooseFirstSelection();
        else
            this.coffeeMachineInterface.chooseSecondSelection();
        
    }
}
