import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Main extends JFrame {

     public static void main(String[] args) throws Exception {
        Main window = new Main();
        
    }



    class Canvas extends JPanel {
        int x=1;
        int y=1;

        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }
        
        public int CellX()
        {
            if ((x*35)+10<710)
            {
                x=(x*35)+10;
            }
            
                return x;
        }
        
        public int CellY()
        {
            if ((y*35)+10<710)
            {
                y=(x*35)+10;
            }
            
                return x;
        }

        public void paint(Graphics g) 
        {
        for(int i=10;i<710;i+=35)
        {
            for(int j=10;j<710;j+=35)
            {
                g.setColor(Color.WHITE);
                g.fillRect(i,j,35,35);
                g.setColor(Color.GREEN);
                g.fillRect(x,y,35,35);
                g.setColor(Color.BLACK);
                g.drawRect(i,j,35,35);
            }
        }
        }      
    }

        
    
    
    

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        Grid Test = new Grid();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
        
    }

    
} 