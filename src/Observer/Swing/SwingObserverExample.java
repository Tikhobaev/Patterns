package Observer.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args){
        SwingObserverExample SOE = new SwingObserverExample();
        SOE.Go();
    }

    public void Go(){
        frame = new JFrame();
        JButton button = new JButton("Should I watch some films?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
    }

    class AngelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Yes, of course, you deserve some rest");
        }
    }

    class DevilListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Nooooooooo, now write 100500 lines of code, stupid boy");
        }
    }
}
