package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class ViewPanel extends JPanel {
   
    private int boxAmount;
    private List<Color> boxColors;

    public ViewPanel(){
        this.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        boxColors = new ArrayList<Color>();
    }
    
    public void setBoxAmount(int boxAmount) {
        this.boxAmount = boxAmount;
    }
    
    public void addBoxColor(Color actualBoxColor) {
        boxColors.add(actualBoxColor);
    }

    public void removeBoxColor(Color actualBoxColor) {
        boxColors.remove(actualBoxColor);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(int i = 0; i < boxAmount; i++){
        g.setColor(boxColors.get(i));
            g.fillRect(100, 500-(50*i), 50, 50);
        }
    }
}

