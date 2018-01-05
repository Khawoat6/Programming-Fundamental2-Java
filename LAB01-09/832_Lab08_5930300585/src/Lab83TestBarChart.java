

import java.awt.*;
import javax.swing.*;

public class Lab83TestBarChart  extends JFrame{
    public Lab83TestBarChart()
    {
        Container container = getContentPane();
        container.setLayout(new GridLayout(1,3,20,5));
        Lab83BarChart chart1 = new Lab83BarChart();
        double[] data1 = {10,10,30,35,15};
        String[] dataName1 = {"Sheet/HW--10%","Lab Exam--10%","MidTerm--30%","Final--35%","Project--15%"};
        chart1.setData(dataName1,data1);
        container.add(chart1);

    }
    public static void main(String[] args)
    {
        Lab83TestBarChart frame = new Lab83TestBarChart();
        frame.setTitle("Fund2 BarChart");
        frame.setSize(858,480);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }




}
