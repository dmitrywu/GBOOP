package classes;

/**
 * Actor
 */
public abstract class Actor {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    
    public Actor(String name) {
        this.name = name;
    }

    abstract String getName();
    abstract void setName(String name);
    
}
    