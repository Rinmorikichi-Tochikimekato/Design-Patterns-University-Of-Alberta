public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    
    private OldCoffeeMachine oldVendingMachine;

    public void connect(OldCoffeeMachine oldVendingMachine){
        this.oldVendingMachine = oldVendingMachine;
    }
    
    public void chooseFirstSelection(){
        oldVendingMachine.chooseFirstSelection();
    }
        
    public void chooseSecondSelection(){
        oldVendingMachine.chooseSecondSelection();
    }

}
