package game.GameObjects;

import engine.Engine;
import engine.Fx.ShadowType;
import engine.Image;
import engine.Renderer;
import game.managers.GameObject;

/**
 * Created by Thijs Dreef on 09/06/2017.
 */
public class Background extends GameObject
{
  Image background;
  public Background()
  {
    background = new Image("background.png", true);
  }
  @Override
  public void update(Engine en, float dt)
  {

  }

  @Override
  public void render(Engine en, Renderer r)
  {
    r.drawImage(background, 0, 0, ShadowType.TOTAL);
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
