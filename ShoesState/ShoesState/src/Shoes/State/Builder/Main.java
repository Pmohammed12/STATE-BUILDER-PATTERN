package Shoes.State.Builder;


public class Main {

    public static void main(String[] args) {
        ShoeContext statebuilder=new ShoeContext();
        statebuilder.useState();
        statebuilder.purchaseState();
        statebuilder.destroyState();
        statebuilder.idleState();
        statebuilder.makingOff();

    }

}