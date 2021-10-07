package Shoes.State.Builder;

public class UseState implements State{

    final ShoeContext shoe;

    public UseState(ShoeContext shoe) {
        this.shoe = shoe;
    }

    @Override
    public void useState() {
        System.out.println("UseState....");
    }

    @Override
    public void purchaseState() {
        System.out.println("purchaseState....");
        shoe.setState(shoe.getPurchaseState());
    }

    @Override
    public void idleState() {
        System.out.println("idleState....");
        shoe.setState(shoe.getIdleState());
    }

    @Override
    public void destroyState() {
        System.out.println("destroyState....");
        shoe.setState(shoe.getDestroyState());
    }

    @Override
    public void makingOff() {
        System.out.println("shoes of bath finished");
        shoe.setMakingOff();
    }

}