package game.States;

import engine.Engine;
import engine.Renderer;
import game.GameObjects.Background;
import game.GameObjects.LightObject;
import game.GameObjects.Platform;
import game.managers.ObjectManager;
import game.managers.State;

public class LightingTest extends State
{
  public LightingTest()
  {
    manager = new ObjectManager();
    manager.addObject(new LightObject(200, 200, 200, 0xffffffff));
    manager.addObject(new Background());
  }
  @Override
  public void update(Engine en, float dt)
  {
    manager.updateObjects(en, dt);
    if (en.getInput().isButtonReleased(2))
      manager.addObject(new Platform(en.getInput().getMouseX(), en.getInput().getMouseY()));
  }

  @Override
  public void render(Engine en, Renderer r)
  {
    manager.renderObjects(en, r);
  }

  @Override
  public void dispose()
  {

  }
}
