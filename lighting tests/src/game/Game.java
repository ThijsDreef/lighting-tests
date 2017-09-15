package game;

import engine.AbstractGame;
import engine.Engine;
import engine.Renderer;
import game.States.LightingTest;

public class Game extends AbstractGame
{
  public Game()
  {
  // push(your state here);
    push(new LightingTest());
  }

  @Override
  public void update(Engine En, float dt)
  {
    peek().update(En, dt);
  }

  @Override
  public void render(Engine En, Renderer r)
  {
    peek().render(En, r);
  }

  public  static void main(String[] args)
  {
    Engine en = new Engine((new Game()));
    en.setLights(true);
    en.setDynamicLights(true);
    en.setWidth(600);
    en.setHeight(600);
    en.start();
  }
}
