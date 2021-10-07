package Shoes.State.Builder;

public class MakingOff implements State{

    final ShoeContext shoe;

    public MakingOff(ShoeContext shoe) {
        this.shoe = shoe;
    }

    @Override
    public void useState() {
        System.out.println("The shoe are being used");
        shoe.setState(shoe.getUseState());
    }

    @Override
    public void purchaseState() {
        System.out.println("Shoe should be bought");
        shoe.setState(shoe.getPurchaseState());
    }

    @Override
    public void idleState() {
        System.out.println("Shoes are idle");
        shoe.setState(shoe.getIdleState());
    }

    @Override
    public void destroyState() {
        System.out.println("Shoes Destrored");
        shoe.setState(shoe.getDestroyState());
    }

    @Override
    public void makingOff() {
        System.out.println("Making is off");
    }

}

