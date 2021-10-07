package Shoes.State.Builder;


public class ShoeContext implements State
{
    private State makingOn;
    private State useState;
    private State purchaseState;
    private State idleState;
    private State destroyState;
    private State makingOff;
    private Builder shoeBuilder;
    private StartShoe shoes;
    private State state;

    public ShoeContext() {
        useState = new UseState(this);
        makingOff = new MakingOff(this);
        makingOn = new MakingOn(this);
        purchaseState = new PurchaseState(this);
        idleState = new IdleState(this);
        destroyState = new IdleState(this);
        shoeBuilder = new ShoeBuilder(this);
        shoes = new StartShoe(shoeBuilder);
        shoes.start();
        state = shoeBuilder.makingOn();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public State getUseState() {
        return useState;
    }

    public State getPurchaseState() {
        return purchaseState;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getDestroyState() {
        return destroyState;
    }

    public void setMakingOn() {
        state = makingOn;
    }

    public void setMakingOff() {
        state = makingOff;
    }

    @Override
    public void useState() {
        System.out.println("Usestate");
    }

    @Override
    public void purchaseState() {
        System.out.println("purchaseState");
        setState(getPurchaseState());
    }

    @Override
    public void idleState() {
        System.out.println("idleState");
        setState(getIdleState());
    }

    @Override
    public void destroyState() {
        System.out.println("destroyState");
        setState(getDestroyState());
    }

    @Override
    public void makingOff() {
        System.out.println("making finished");
        setMakingOff();
    }
}
