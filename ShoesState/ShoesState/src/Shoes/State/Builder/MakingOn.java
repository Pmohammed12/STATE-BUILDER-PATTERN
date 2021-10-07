package Shoes.State.Builder;


public class MakingOn implements State{

    final ShoeContext shoe;

    public MakingOn(ShoeContext shoe) {
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
        shoe.setState(shoe.getIdleState());
    }

    @Override
    public void destroyState() {
        System.out.println("destroyState....");
        shoe.setState(shoe.getDestroyState());
    }

    @Override
    public void makingOff() {
        System.out.println("making finished");
        shoe.setMakingOff();
    }

}
