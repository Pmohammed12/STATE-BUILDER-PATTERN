package Shoes.State.Builder;

public class ShoeBuilder implements Builder{

    private State state;
    public ShoeBuilder(ShoeContext context) {
        state = new MakingOn(context);
    }

    @Override
    public void designing() {
        System.out.println("Shoes are designed");
    }

    @Override
    public void stapming() {
        System.out.println("Staming into various sizes");
    }

    @Override
    public void sewing() {
        System.out.println("shoes are sewed");
    }

    @Override
    public void assembly() {
        System.out.println("All components are assembled");
    }

    public State makingOn() {
        return state;
    }
}