package co.edu.uptc.view;

import java.awt.Color;
import java.awt.event.ActionListener;

public class StackView {
    private DashBoard dashBoard;
    

    public StackView(ActionListener actionListener){
        initComponents(actionListener);
    }

    private void initComponents(ActionListener actionListener){
        dashBoard =  new DashBoard(actionListener);
    }

    public void setBoxesAmountToPaint(int boxesAmount){
        dashBoard.getViewPanel().setBoxAmount(boxesAmount);
    }

    public void addBoxColor(Color color){
        dashBoard.getViewPanel().addBoxColor(color);
    }

    public void removeBoxColor(Color color){
        dashBoard.getViewPanel().removeBoxColor(color);
    }

    public void paintBoxes(){
        dashBoard.getViewPanel().repaint();
    }
}