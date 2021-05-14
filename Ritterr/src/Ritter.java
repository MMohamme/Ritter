import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ritter extends Treffen implements ActionListener    {
//Kurze Beschreibung:
// Das Spiel fängt automatisch bei Ritter 1 an und luäft 3 Runde , wenn Ritter X Ritter Y getroffen hat, dann bekommt Ritter X ein leben und Ritter Y verliert ein Leben.
    //Wenn Man auf "Runde +1"kliegt, dann wird für die standard Runden(3 Runden) ein Runde mehr hinzugefügt
// Wenn ein von den Ritter (6) Leben hat, dann er hat das Spiel gewinnen, egal ob noch ein Ritter lebt.
// Wenn Ritter X fünf Leben hat und die Resten haben das Spiel verloren, dann Ritter X hat das Spiel gewinnen.
// (RED) X hat das Spiel verloren
//(WHITE) X hat (1) leben
//(BLUE) X hat (2) leben
//(YELLOW) X hat (3) leben
//(ORANGE) X hat (4) leben
//(DARK_GRAY) X hat (5) leben
//(magenta) X hat (6) leben
//[0]Ritter1 hat angriff Wahrscheinlichkeit von 60%
//[1]Ritter2 hat angriff Wahrscheinlichkeit von 50%
//[2]Ritter3 hat angriff Wahrscheinlichkeit von 40%
//[3]Ritter4 hat angriff Wahrscheinlichkeit von 30%
//[4]Ritter5 hat angriff Wahrscheinlichkeit von 20%
//[5]Ritter6 hat angriff Wahrscheinlichkeit von 10%
// VerlorenX==true: S[]  Ritter X hat ein Leben oder mehr.
// VerlorenY==false: S[] Ritter X hat gar kein Leben  bzw. er hat das Spiel verloren.
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton button6;
    public JButton Runde;
static int V;
static int Sallam;
    private ActionEvent e;
    static int Extra=3;

    public Ritter(JButton r1,JButton r2,JButton r3, JButton r4,JButton r5,JButton r6,JButton r7){

        button1=r1;
        button2=r2;
        button3=r3;
        button4=r4;
        button5=r5;
        button6=r6;
        Runde=r7;


    }




    public static void main(String[] args) throws InterruptedException {
        JFrame mainframe = new JFrame();
        Ritter1 ritter1 = new Ritter1();
        //  Treffen treffen= new Treffen();
        //new Treffen();
        mainframe.setTitle("Ritter Spiel");
        mainframe.setSize(1200, 1000);
        mainframe.setVisible(true);
        mainframe.setLayout(null);
        JButton button1 = new JButton("Ritter1");
        JButton button2 = new JButton("Ritter2");
        JButton button3 = new JButton("Ritter3");
        JButton button4 = new JButton("Ritter4");
        JButton button5 = new JButton("Ritter5 ");
        JButton button6 = new JButton("Ritter6 ");
        JButton runde = new JButton("Runde +1 ");
        mainframe.getContentPane().add(button1);
        mainframe.getContentPane().add(button2);
        mainframe.getContentPane().add(button3);
        mainframe.getContentPane().add(button4);
        mainframe.getContentPane().add(button5);
        mainframe.getContentPane().add(button6);
        mainframe.getContentPane().add(runde);
        mainframe.getContentPane().add(label);
        mainframe.getContentPane().add(textArea);
        mainframe.getContentPane().add(label1);
        button1.setBounds(400, 200, 100, 100);//
        button4.setBounds(400, 600, 100, 100);//4
        button6.setBounds(200, 300, 100, 100);//6
        button5.setBounds(200, 500, 100, 100);//5
        button2.setBounds(600, 300, 100, 100);//2
        button3.setBounds(600, 500, 100, 100);//3
      //  label.setBounds(500,475,400,50);
        runde.setBounds(200,800,100,50);
        textArea.setBounds(800,400,400,50);
        label1.setBounds(400, 800, 200, 50);
       label.setHorizontalAlignment(JLabel.LEFT);
       label.setVerticalAlignment(JLabel.CENTER);
        Ritter riiter = new Ritter(button1, button2, button3, button4, button5, button6,runde);
        button1.addActionListener(riiter);
        button2.addActionListener(riiter);
        button3.addActionListener(riiter);
        button4.addActionListener(riiter);
        button5.addActionListener(riiter);
        button6.addActionListener(riiter);
        runde.addActionListener(riiter);
        label.setText(System.out.toString());




            for (int i = 0; i < Extra; i++) {

                ritter1.R1();
                if (S[0] == 0 || S[0] < 0) {
                    riiter.button1.setBackground(Color.RED);
                }
                if (S[0] == 1) {
                    riiter.button1.setBackground(Color.WHITE);
                }
                if (S[0] == 2) {
                    riiter.button1.setBackground(Color.BLUE);
                }
                if (S[0] == 3) {
                    riiter.button1.setBackground(Color.YELLOW);
                }
                if (S[0] == 4) {
                    riiter.button1.setBackground(Color.ORANGE);
                }
                if (S[0] == 5) {
                    riiter.button1.setBackground(Color.DARK_GRAY);
                }if (S[0] == 6) {
                    riiter.button1.setBackground(Color.magenta);
                }

                Thread.sleep(1000);
                ritter1.R2();
                if (S[1] == 0 || S[1] < 0) {
                    riiter.button2.setBackground(Color.RED);
                }
                if (S[1] == 1) {
                    riiter.button2.setBackground(Color.WHITE);
                }

                if (S[1] == 2) {
                    riiter.button2.setBackground(Color.BLUE);
                }

                if (S[1] == 3) {
                    riiter.button2.setBackground(Color.YELLOW);
                }
                if (S[1] == 4) {
                    riiter.button2.setBackground(Color.ORANGE);
                }
                if (S[1] == 5) {
                    riiter.button2.setBackground(Color.DARK_GRAY);
                }if (S[1] == 6) {
                    riiter.button2.setBackground(Color.magenta);
                }
                Thread.sleep(1000);
                ritter1.R3();
                if (S[2] == 0 || S[2] < 0) {
                    riiter.button3.setBackground(Color.RED);
                }
                if (S[2] == 1) {
                    riiter.button3.setBackground(Color.WHITE);
                }
                if (S[2] == 2) {
                    riiter.button3.setBackground(Color.BLUE);
                }
                if (S[2] == 3) {
                    riiter.button3.setBackground(Color.YELLOW);
                }
                if (S[2] == 4) {
                    riiter.button3.setBackground(Color.ORANGE);
                }
                if (S[2] == 5) {
                    riiter.button3.setBackground(Color.DARK_GRAY);
                }if (S[2] == 6) {
                    riiter.button3.setBackground(Color.magenta);
                }
                Thread.sleep(1000);
                ritter1.R4();

                if (S[3] == 0 || S[3] < 0) {
                    riiter.button4.setBackground(Color.RED);
                }
                if (S[3] == 1) {
                    riiter.button4.setBackground(Color.WHITE);
                }
                if (S[3] == 2) {
                    riiter.button4.setBackground(Color.BLUE);
                }
                if (S[3] == 3) {
                    riiter.button4.setBackground(Color.YELLOW);
                }
                if (S[3] == 4) {
                    riiter.button4.setBackground(Color.ORANGE);
                }
                if (S[3] == 5) {
                    riiter.button4.setBackground(Color.DARK_GRAY);
                }if (S[3] == 6) {
                    riiter.button4.setBackground(Color.magenta);
                }
                Thread.sleep(1000);
                ritter1.R5();

                if (S[4] == 0 || S[4] < 0) {
                    riiter.button5.setBackground(Color.RED);
                }
                if (S[4] == 1) {
                    riiter.button5.setBackground(Color.WHITE);
                }
                if (S[4] == 2) {
                    riiter.button5.setBackground(Color.BLUE);
                }
                if (S[4] == 3) {
                    riiter.button5.setBackground(Color.YELLOW);
                }
                if (S[4] == 4) {
                    riiter.button5.setBackground(Color.ORANGE);
                }
                if (S[4] == 5) {
                    riiter.button5.setBackground(Color.DARK_GRAY);
                } if (S[4] == 6) {
                    riiter.button5.setBackground(Color.magenta);
                }
                Thread.sleep(1000);
                ritter1.R6();
                if (S[5] == 0 || S[5] < 0) {
                    riiter.button6.setBackground(Color.RED);
                }
                if (S[5] == 1) {
                    riiter.button6.setBackground(Color.WHITE);
                }
                if (S[5] == 2) {
                    riiter.button6.setBackground(Color.BLUE);
                }
                if (S[5] == 3) {
                    riiter.button6.setBackground(Color.YELLOW);
                }
                if (S[5] == 4) {
                    riiter.button6.setBackground(Color.ORANGE);
                }
                if (S[5] == 5) {
                    riiter.button6.setBackground(Color.DARK_GRAY);
                } if (S[5] == 6) {
                    riiter.button6.setBackground(Color.magenta);
                }


            }


            System.out.println("                                              " +
                    "                                                         " +
                    "                                                         " +
                    "                                                          ");

            textArea.setText(System.out.toString());

        }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Runde){
Extra=Extra+1;
label1.setText( "Anzahl der Runden:  "+Extra);
        }

    }


}
