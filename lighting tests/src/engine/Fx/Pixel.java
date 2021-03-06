package engine.Fx;

public class Pixel
{
  public static int getColorPower(int color, float power)
  {
    return getColor(1, getRed(color) * power,

                       getGreen(color) * power,
                       getBlue(color) * power);
  }
  public static int getColor(float a, float r, float g, float b)
  {
    return ((int)(a * 255f + 0.5f) << 24 |
            (int)(r * 255f + 0.5f) << 16 |
            (int)(g * 255f + 0.5f) << 8  |
            (int)(b * 255f + 0.5f));
  }
  public static float getGreen(int color)
  {
    return (0xff & (color >> 8)) / 255f;
  }
  public  static float getRed(int color)
  {
    return (0xff & (color >> 16)) / 255f;
  }
  public static float getBlue(int color)
  {
    return (0xff & (color)) / 255f;
  }
  public static int getMaxLight(int color1, int color2)
  {
    return getColor(1, Math.max(getRed(color1), getRed(color2)),
                       Math.max(getGreen(color1), getGreen(color2)),
                       Math.max(getBlue(color1), getBlue(color2)));
  }
  public static int getLightBlend(int color, int light, int ambient)
  {
    float r = getRed(light);
    float g = getGreen(light);
    float b = getBlue(light);

    if (r < getRed(ambient))
      r = getRed(ambient);
    if (g < getGreen(ambient))
      g = getGreen(ambient);
    if (b < getBlue(ambient))
      b = getBlue(ambient);

    return getColor(1, r * getRed(color), g * getGreen(color), b * getBlue(color));
  }
}
