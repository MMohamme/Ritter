import javax.swing.*;
import java.awt.*;
import java.util.Random;
//[0]Ritter1 bzw.button1 hat angriff Wahrscheinlichkeit von 60%
//[1]Ritter2 hat angriff Wahrscheinlichkeit von 50%
//[2]Ritter3 hat angriff Wahrscheinlichkeit von 40%
//[3]Ritter4 hat angriff Wahrscheinlichkeit von 30%
//[4]Ritter5 hat angriff Wahrscheinlichkeit von 20%
//[5]Ritter6 hat angriff Wahrscheinlichkeit von 10%
// VerlorenX==true: S[] bzw. Ritter X hat ein Leben oder mehr
// VerlorenY==false: S[] hat gar kein Leben  bzw. er hat das Spiel verloren
public class Ritter6 {
    boolean Verloren1=true;
    boolean Verloren2=true;
    boolean Verloren3 =true;
    boolean Verloren4=true;
    boolean Verloren5=true;
    boolean Verloren6=true;
    static int[] S = {1, 1, 1, 1, 1, 1};
    static JLabel label = new JLabel();
    static TextArea textArea = new TextArea();
    Random random = new Random();
     double Nummer;
     int sallam;

    static TextArea label1 = new TextArea();




    public void R6() throws InterruptedException {

        if (S[5] == 0 || S[5] < 0) {
            Verloren6 = false;
            System.out.println("Ritter 6 ist Tot  ");
            textArea.setText("Ritter 6 ist Tot  ");
            Thread.sleep(900);

        }
        else {
            Verloren6 = true;
        }
        if (Verloren6 = true && S[5] >= 1) {
            Nummer = random.nextDouble() * (1); // Random zwischwn 0 und 1
            if (Nummer < 0.1) {
                S[5] = S[5] + 1;
                if (S[5] == 2 && Verloren1 == true) {
                    S[0] = S[0] - 1;
                    System.out.println(Nummer + "  Ritter 6 hat Ritter 1 getroffen  " + S[5]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 6 hat Ritter 1 getroffen  " + S[5]+ " Leben");
                    Thread.sleep(900);

                } else if (S[5] == 2 && Verloren1 == false && Verloren2 == true) {
                    S[1] = S[1] - 1;
                    System.out.println(Nummer + "  Ritter 6  hat Ritter 2 getroffen  " + S[5]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 6  hat Ritter 2 getroffen  " + S[5]+ " Leben");
                    Thread.sleep(900);
                } else if (S[5] == 3 && Verloren1 == false && Verloren2 == true) {
                    S[1] = S[1] - 1;
                    System.out.println(Nummer + "  Ritter 6  hat Ritter 2 getroffen  " + S[5]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 6  hat Ritter 2 getroffen  " + S[5]+ " Leben");
                    Thread.sleep(900);
                } else if (S[5] == 3 && Verloren2 == false && Verloren3 == true) {
                    S[2] = S[2] - 1;
                    System.out.println(Nummer + "  Ritter 6  hat Ritter 3 getroffen  " + S[5]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 6  hat Ritter 3 getroffen  " + S[5]+ " Leben");
                    Thread.sleep(900);
                } else if (S[5] == 4 && Verloren2 == false && Verloren3 == true) {
                    S[2] = S[2] - 1;
                    System.out.println(Nummer + "  Ritter 6  hat Ritter 3 getroffen  " + S[5]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 6  hat Ritter 3 getroffen  " + S[5]+ " Leben");
                    Thread.sleep(900);
                } else if (S[5] == 4 && Verloren3 == false && Verloren4 == true) {
                    S[3] = S[3] - 1;
                    System.out.println(Nummer + "  Ritter 6  hat Ritter 4 getroffen  " + S[5]+ " Leben");

                    textArea.setText(Nummer + "  Ritter 6  hat Ritter 4 getroffen  " + S[5]+ " Leben");
                    Thread.sleep(900);

                } else if (S[5] == 5 && Verloren3 == false && Verloren4 == true) {
                    S[3] = S[3] - 1;
                    System.out.println(Nummer + "  Ritter 6  hat Ritter 4 getroffen  " + S[5]+ " Leben");

                    textArea.setText(Nummer + "  Ritter 6  hat Ritter 4 getroffen  " + S[5]+ " Leben");
                    Thread.sleep(900);

                } else if (S[5] == 6 && Verloren4 == false) {
                    S[3] = S[3] - 1;
                    System.out.println(Nummer + "  Ritter 6  hat Ritter 5 getroffen  " + S[5]+ " Leben");
                    System.out.println(Nummer + "  Ritter 6 hat das Spiel gewinnen   " + S[5]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 6  hat Ritter 5 getroffen    " + S[5]+ " Leben");
                    Thread.sleep(500);
                    textArea.setText("Ritter 6 hat das Spiel gewinnen   " + S[5]+ " Leben");
                    Thread.sleep(6000);
                    System.exit(5);
                } else if (S[5] == 6 && Verloren4 == false && Verloren5 == false) {
                    System.out.println("  Ritter 5 hat das Spiel gewinnen    " + S[5] + " Leben");
                    Thread.sleep(900);
                    textArea.setText("Ritter 5 hat das Spiel gewinnen   " + S[5] + " Leben");
                    Thread.sleep(6000);
                    System.exit(5);

                }else if (S[5] == 6) {

                    System.out.println( "  Ritter 6 hat das Spiel gewinnen    " + S[5]+ " Leben");

                    Thread.sleep(900);
                    textArea.setText("Ritter 6 hat das Spiel gewinnen   " + S[5]+ " Leben");
                    Thread.sleep(6000);
                    System.exit(5);
                }else if (S[5] == 5&&Verloren5==false&&Verloren2==false&&Verloren4==false&&Verloren3==false&&Verloren1==false) {

                    System.out.println(Nummer + "  Ritter 6 hat alle Rittern getroffen  " + S[5]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 6 hat alle Rittern getroffen  " + S[5]+ " Leben");
                    System.out.println("Ritter 6 hat das Spiel gewinnen   " + S[5] + " Leben");
                    textArea.setText("Ritter 6 hat das Spiel gewinnen   " + S[5] + " Leben");
                    Thread.sleep(900);
                    Thread.sleep(6000);
                    System.exit(5);
                }

            }else if (Nummer > 0.1&&S[5] == 1 && Verloren1==true) {
                System.out.println(Nummer + "Ritter 6 hat Ritter 1 nicht getroffen");
                textArea.setText(Nummer + "Ritter 6 hat Ritter 1 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer > 0.1&&S[5] == 1&&Verloren1==false&&Verloren2==true) {
                System.out.println(Nummer + "Ritter 6 hat Ritter 2 nicht getroffen");
                textArea.setText(Nummer + "Ritter 6 hat Ritter 2 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer > 0.1&&S[5] == 2&&Verloren2==true) {
                System.out.println(Nummer + "Ritter 6 hat Ritter 2 nicht getroffen");
                textArea.setText(Nummer + "Ritter 6 hat Ritter 2 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer > 0.1&&S[5] == 2&&Verloren2==false&&Verloren3==true) {
                System.out.println(Nummer + "Ritter 6 hat Ritter 1 nicht getroffen");
                textArea.setText(Nummer + "Ritter 6 hat Ritter 1 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer > 0.1&&S[5] == 3&&Verloren3==true) {
                System.out.println(Nummer + "Ritter 6 hat Ritter 3 nicht getroffen");
                textArea.setText(Nummer + "Ritter 6 hat Ritter 3 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer > 0.1&&S[5] == 3&&Verloren3==false&&Verloren4==true) {
                System.out.println(Nummer + "Ritter 6 hat Ritter 4 nicht getroffen");
                textArea.setText(Nummer + "Ritter 6 hat Ritter 4 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer > 0.1&&S[5] == 4&&Verloren4==true) {
                System.out.println(Nummer + "Ritter 6 hat Ritter 4 nicht getroffen");
                textArea.setText(Nummer + "Ritter 6 hat Ritter 4 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer > 0.1&&S[5] == 4&&Verloren4==false&&Verloren5==true) {
                System.out.println(Nummer + "Ritter 6 hat Ritter 5 nicht getroffen");
                textArea.setText(Nummer + "Ritter 6 hat Ritter 5 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer > 0.1&&S[5] == 5&&Verloren5==true) {
                System.out.println(Nummer + "Ritter 6 hat Ritter 5 nicht getroffen");
                textArea.setText(Nummer + "Ritter 6 hat Ritter 5 nicht getroffen");
                Thread.sleep(900);
            }
        }
    }}