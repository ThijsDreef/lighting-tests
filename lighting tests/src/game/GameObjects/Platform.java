package game.GameObjects;

import engine.Engine;
import engine.Fx.ShadowType;
import engine.Renderer;
import game.managers.GameObject;

/**
 * Created by Thijs Dreef on 07/04/2017.
 */
public class Platform extends GameObject
{
  public Platform(int x, int y)
  {
    this.x = x;
    this.y = y;
  }
  @Override
  public void update(Engine en, float dt)
  {

  }

  @Override
  public void render(Engine en, Renderer r)
  {
    r.drawRect((int)x, (int)y, 25, 25, 0xff000000,ShadowType.HALF);
  }

  @Override
  public void componentEvent(String name, GameObject object, String axis)
  {

  }

  @Override
  public void dispose()
  {

  }
}
