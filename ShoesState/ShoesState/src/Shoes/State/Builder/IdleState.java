package Shoes.State.Builder;

public class IdleState implements State{

    final ShoeContext shoe;

    public IdleState(ShoeContext shoe) {
        this.shoe = shoe;
    }

    @Override
    public void useState() {
        System.out.println("UseState....");
        shoe.setState(shoe.getUseState());
    }

    @Override
    public void purchaseState() {
        System.out.println("purchaseState....");
        shoe.setState(shoe.getPurchaseState());
    }

    @Override
    public void idleState() {
        System.out.println("idleState....");
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