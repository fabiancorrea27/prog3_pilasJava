package co.edu.uptc.presenter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import co.edu.uptc.models.Box;
import co.edu.uptc.utils.Commands;
import co.edu.uptc.utils.RandomColor;
import co.edu.uptc.view.StackView;

public class Presenter implements ActionListener {

    private Stack<Box> boxStack = new Stack<>();
    private StackView view;

    public Presenter() {
        view = new StackView(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (Commands.ADD.toString().equals(actionCommand)) {
            addBoxAction();
        } else if (Commands.DELETE.toString().equals(actionCommand)) {
            removeBoxAction();
        }
    }

    private void addBoxAction() {
        Box box = createBox();

        boxStack.push(box);
        view.setBoxesAmountToPaint(boxStack.size());
        view.addBoxColor(box.getColor());
        view.paintBoxes();
    }

    private Box createBox() {
        return new Box(RandomColor.getRandomColor());
    }

    private void removeBoxAction() {
        if (!boxStack.isEmpty()) {
            Color color = boxStack.pop().getColor();
            view.removeBoxColor(color);
            view.setBoxesAmountToPaint(boxStack.size());
            view.paintBoxes();
        }
    }

    public static void main(String[] args) {
        new Presenter();
    }

}