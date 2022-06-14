import javax.swing.*;

public class Window extends MyRobot  {
    public static void main(String[] args) {
        Window();
    }

    public static void Window (){
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setBounds(0,0,500,500);




        JButton button  = new JButton("click here");
        button.setBounds(200,200,100,100);
        frame.add(button);

        //  String Title = JOptionPane.showInputDialog(null,"enter your message");

        button.addActionListener((event)->{

            try {
                Window();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        });






    }



    }


