package Shoes.State.Builder;



public interface State {
    void useState();
    void purchaseState();
    void idleState();
    void destroyState();
    void makingOff();
}