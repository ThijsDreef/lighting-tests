package game.GameObjects;

import engine.Engine;
import engine.Fx.Light;
import engine.Fx.Pixel;
import engine.Renderer;
import game.managers.GameObject;

/**
 * Created by Thijs Dreef on 07/04/2017.
 */
public class LightObject extends GameObject
{
  private Light light;
  private int radius;
  float r,g,b;
  public LightObject(int x, int y, int radius, int color)
  {
    r = Pixel.getRed(color);
    g = Pixel.getGreen(color);
    b = Pixel.getBlue(color);
    this.radius = radius;
    light = new Light(color, radius);
    this.x = x;
    this.y = y;
  }
  @Override
  public void update(Engine en, float dt)
  {
    x = en.getInput().getMouseX();
    y = en.getInput().getMouseY();
    if (en.getInput().isButtonReleased(1))
    {
      r = (float)Math.random();
      g = (float)Math.random();
      b = (float)Math.random();
      light = new Light(Pixel.getColor(1, r, g, b), radius);
    }

    if (en.getInput().getMouseWheelMove() != 0)
    {
      radius += en.getInput().getMouseWheelMove()  * 10;
      if (radius > 750)
        radius = 750;
      if (radius < 0)
        radius = 0;
      light = new Light(Pixel.getColor(1,r,g,b), radius);
    }
  }

  @Override
  public void render(Engine en, Renderer r)
  {
    r.drawLight(light, (int)x, (int)y);
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
