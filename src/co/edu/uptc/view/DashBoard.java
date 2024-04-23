package co.edu.uptc.view;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class DashBoard extends JFrame  {
    private ViewPanel viewPanel;
    private ButtonsPanel buttonsPanel;

    public DashBoard(ActionListener actionListener){
        this.getContentPane().setLayout(new BorderLayout());
        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents(actionListener);
        this.setVisible(true);
    }   
    
    private void initComponents(ActionListener actionListener){
        viewPanel = new ViewPanel();
        buttonsPanel = new ButtonsPanel(actionListener);
        this.getContentPane().add(viewPanel, BorderLayout.CENTER);
        this.getContentPane().add(buttonsPanel, BorderLayout.EAST);
    }

    public ViewPanel getViewPanel() {
        return viewPanel;
    }

}