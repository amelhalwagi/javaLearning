import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {

    JFrame frame;
    JProgressBar bar;

    ProgressBarDemo (){

        frame = new JFrame();
        bar = new JProgressBar();

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.blue);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,87);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
        done();
        close();

    }
    public void fill(){
        int counter = 0;

        while (counter<=100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter+=1;
        }
    }

    public void done(){
        bar.setString("Done :)");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void close(){
        bar.setString("Closes in 5 seconds...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        frame.dispose();
    }

}
