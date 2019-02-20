package main;

import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Czas extends JLabel implements Runnable{

    private Thread watek;
    private int pauza = 1000;
    public Czas(){
        super("",SwingConstants.CENTER);
        setFont(new Font("Tahoma", Font.BOLD, 12));
        setForeground(Color.BLACK);
        setOpaque(true);        
    }
    
    public void start(){
        if (watek == null){
            watek = new Thread(this);
            watek.start();
        }
    }
    @Override
    public void run() {
        while (watek == Thread.currentThread()){
            Date czas = new Date();
            DateFormat df = DateFormat.getTimeInstance(DateFormat.MEDIUM);
            setText(df.format(czas));
            try{
                Thread.sleep(pauza);
            } catch (InterruptedException e){}
        }
    }
    
    public void stop(){
        watek = null;
    }
}
