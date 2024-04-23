package co.edu.uptc.utils;

import java.awt.Color;

public class RandomColor {
    
    public static Color getRandomColor() {
        Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
        return color;
    }
}