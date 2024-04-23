package co.edu.uptc.view;

import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.uptc.utils.Commands;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

public class ButtonsPanel extends JPanel {
    private JButton btnAdd, btnRemove;

    public ButtonsPanel(ActionListener actionListener) {
        this.setLayout(new GridBagLayout());
        initComponents(actionListener);
        addComponents();
    }

    private void initComponents(ActionListener listener){
        btnAdd = createButtons(Color.GREEN, "Agregar", listener, Commands.ADD.toString());
        btnRemove = createButtons(Color.RED, "Quitar", listener, Commands.DELETE.toString());
    }

    private void addComponents(){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.insets = new Insets(10, 20, 10, 20);
        this.add(btnAdd, gbc);
        this.add(btnRemove, gbc);
    }

    public JButton createButtons(Color color, String name, ActionListener listener, String comand) {
        JButton btn = new JButton(name);
        btn.setBackground(color);
        btn.addActionListener(listener);
        btn.setActionCommand(comand);
        return btn;
    }
}
