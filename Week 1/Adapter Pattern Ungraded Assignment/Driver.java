public class Driver{
    public static void main(String args[]){
        
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter coffeeMachineAdapter = new CoffeeTouchscreenAdapter();
        coffeeMachineAdapter.connect(oldCoffeeMachine)
        ClientCofee clientCoffee = new ClientCoffee(coffeeMachineAdapter);
        clientCoffee.fetchCoffee(1);
    }
}
