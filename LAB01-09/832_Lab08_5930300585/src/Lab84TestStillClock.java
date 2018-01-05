

import javax.swing.*;

class Lab84TestStillClock 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Clock");
        Lab84StillClock clock = new Lab84StillClock();
        clock.setSecondHandVisible(false);
        clock.setSecond(42);clock.setMinute(55);clock.setHour(19);
        frame.add(clock);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
     }
}
