
package boxlayoutexample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BoxLayoutExample extends JFrame
{
    private JLabel Player1_Label; 
    private JLabel Player2_Label;
        
    private JButton NewGame_Button;
       
    private JTextField Player1_TextField; 
    private JTextField Player2_TextField; 
    
    private JLabel messageLabel;

        
    protected BoxLayoutExample()
    {
        super("BoxLayout!");
        setSize(200, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        Player1_Label = new JLabel("player 1:");
        Player1_Label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        messageLabel = new JLabel("Type the name for your players...");
        messageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        Player2_Label = new JLabel("player 2:");
        Player2_Label.setAlignmentX(Component.CENTER_ALIGNMENT);

        
        NewGame_Button = new JButton("New Game");
        NewGame_Button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        NewGame_Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                   // TODO!
                   System.out.println("New Game! - TODO");
            }
        });

       
        Player1_TextField = new JTextField("");
        Player1_TextField.setAlignmentX(Component.CENTER_ALIGNMENT);

        Player2_TextField = new JTextField("");
        Player2_TextField.setAlignmentX(Component.CENTER_ALIGNMENT);

        
        Container pane = getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        
        pane.add(Player1_Label);
        pane.add(Player1_TextField);
        
        pane.add(Player2_Label);
        pane.add(Player2_TextField);
        
        pane.add(NewGame_Button);
        
        pane.add(messageLabel);
    }
    
    
    public static void main(String[] args) 
    {
        BoxLayoutExample Window = new BoxLayoutExample();
        Window.setVisible(true);
    }  
  
    
}
