package Shoes.State.Builder;

public class PurchaseState implements State{

    final ShoeContext shoe;

    public PurchaseState(ShoeContext shoe) {
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
