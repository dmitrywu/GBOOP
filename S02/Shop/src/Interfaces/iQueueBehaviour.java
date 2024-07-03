package Interfaces;

import classes.Actor;

public interface iQueueBehaviour {

    public void TakeInQueue(Actor actor);
    public void ReleaseFromQueue();
    public void isTakeOrder();
    public void GiveOrder();

}
