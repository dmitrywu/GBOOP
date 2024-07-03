package Interfaces;

import java.util.List;

import classes.Actor;

public interface iMarketBehaviour {
 public void AcceptToMarket(Actor actor);
 public void ReleaseFromMarket(List<Actor> actors);
 public void update();
    
}
