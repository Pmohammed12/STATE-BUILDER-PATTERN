package Shoes.State.Builder;

public class StartShoe {

    private Builder build;

    public StartShoe(Builder build) {
        this.build = build;
    }

    public void start() {
        build.designing();
        build.assembly();
        build.sewing();
        build.stapming();
    }
}