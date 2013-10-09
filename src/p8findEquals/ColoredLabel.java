package p8findEquals;

import javax.swing.*;
import java.awt.*;

/**
 * @author nik
 */
public class ColoredLabel extends JLabel {
  private final Color color;

  public ColoredLabel(String text, Color color) {
    super(text);
    this.color = color;
  }

  public Color getColor() {
    return color;
  }
}
