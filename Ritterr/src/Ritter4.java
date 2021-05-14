import java.util.Random;

public class Ritter4 extends Ritter5 {
    //[0]Ritter1 bzw.button1 hat angriff Wahrscheinlichkeit von 60%
//[1]Ritter2 hat angriff Wahrscheinlichkeit von 50%
//[2]Ritter3 hat angriff Wahrscheinlichkeit von 40%
//[3]Ritter4 hat angriff Wahrscheinlichkeit von 30%
//[4]Ritter5 hat angriff Wahrscheinlichkeit von 20%
//[5]Ritter6 hat angriff Wahrscheinlichkeit von 10%
// VerlorenX==true: S[] bzw. Ritter X hat ein Leben oder mehr
// VerlorenY==false: S[] hat gar kein Leben  bzw. er hat das Spiel verloren

    public void R4() throws InterruptedException {
        double Nummer;

        if (S[3] == 0|| S[3] < 0) {
            Verloren4 = false;
            System.out.println("Ritter 4 ist Tot  " );
            textArea.setText("Ritter 4 ist Tot  " );
            Thread.sleep(900);


        } else {
            Verloren4 = true;
        }
        if (Verloren4 = true && S[3] >= 1) {

            Nummer = random.nextDouble() * (1); // Random zwischwn 0 und 1
            if (Nummer < 0.3) {
                S[3] = S[3] + 1;
                if (S[3] == 2&&Verloren5==true) {
                    S[4] = S[4] - 1;
                    System.out.println(Nummer + "  Ritter 4 hat Ritter 5 getroffen  " + S[3]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 4 hat Ritter 5 getroffen  " + S[3]+ " Leben");
                    Thread.sleep(900);

                } else if (S[3] == 2&&Verloren5==false&&Verloren6==true) {
                    S[5] = S[5] - 1;
                    System.out.println(Nummer + "  Ritter 4  hat Ritter 6 getroffen  " + S[3]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 4  hat Ritter 6 getroffen  " + S[3]+ " Leben");
                    Thread.sleep(900);
                }
                else if (S[3] == 3&&Verloren6==true) {
                    S[5] = S[5] - 1;
                    System.out.println(Nummer + "  Ritter 4  hat Ritter 6 getroffen  " + S[3]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 4  hat Ritter 6 getroffen  " + S[3]+ " Leben");
                    Thread.sleep(500);
                }else if (S[3] == 3&& Verloren6==false&&Verloren1==true) {
                    S[0] = S[0] - 1;
                    System.out.println(Nummer + "  Ritter 4  hat Ritter 1 getroffen  " + S[3]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 4  hat Ritter 1 getroffen  " + S[3]+ " Leben");
                    Thread.sleep(900);
                }
                else if (S[3] == 4&& Verloren6==false&&Verloren1==true) {
                    S[0] = S[0] - 1;
                    System.out.println(Nummer + "  Ritter 4  hat Ritter 1 getroffen  " + S[3]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 4  hat Ritter 1 getroffen  " + S[3]+ " Leben");
                    Thread.sleep(900);
                }else if (S[3] == 5&&Verloren1==false&&Verloren2==true) {
                    S[1] = S[1] - 1;
                    System.out.println(Nummer + "  Ritter 4  hat Ritter 2 getroffen  " + S[3]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 4  hat Ritter 2 getroffen  " + S[3]+ " Leben");
                    Thread.sleep(900);
                }else if (S[3] == 6&&Verloren2==true) {

                    System.out.println( "  Ritter 4 hat das Spiel gewinnen    " + S[3]+ " Leben");

                    Thread.sleep(900);
                    textArea.setText("Ritter 4 hat das Spiel gewinnen   " + S[3]+ " Leben");
                    Thread.sleep(6000);
                    System.exit(5);
                }
                else if (S[3] == 6&&Verloren2==false&&Verloren3==true) {
                    S[2] = S[2] - 1;
                    System.out.println(Nummer + "  Ritter 4  hat Ritter 3 getroffen  " + S[3]+ " Leben");
                    System.out.println( "  Ritter 3 hat das Spiel gewinnen    " + S[3]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 4  hat Ritter 3 getroffen  " + S[3]+ " Leben");
                    Thread.sleep(900);
                    textArea.setText("Ritter 3 hat das Spiel gewinnen   " + S[3]+ " Leben");
                    Thread.sleep(6000);
                    System.exit(5);
                }else if (S[3] == 6&&Verloren2==false&&Verloren3==false) {

                    System.out.println( "  Ritter 4 hat das Spiel gewinnen    " + S[3]+ " Leben");

                    Thread.sleep(900);
                    textArea.setText("Ritter 4 hat das Spiel gewinnen   " + S[3]+ " Leben");
                    Thread.sleep(6000);
                    System.exit(5);
                }else if (S[3] == 5&&Verloren5==false&&Verloren6==false&&Verloren2==false&&Verloren3==false&&Verloren1==false) {

                    System.out.println(Nummer + "  Ritter 4 hat alle Rittern getroffen  " + S[3]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 4 hat alle Rittern getroffen  " + S[3]+ " Leben");
                    System.out.println("Ritter 4 hat das Spiel gewinnen   " + S[3] + " Leben");
                    textArea.setText("Ritter 4 hat das Spiel gewinnen   " + S[3] + " Leben");
                    Thread.sleep(900);
                    Thread.sleep(6000);
                    System.exit(5);
                }
            }else if (Nummer>0.3&&S[3]==1&&Verloren5==true){
                System.out.println( Nummer+"  Ritter 4 hat Ritter 5 nicht getroffen  ");
                textArea.setText(Nummer+" Ritter 4 hat Ritter 5 nicht getroffen ");
                Thread.sleep(900);
            }else if (Nummer>0.3&&S[3]==1&&Verloren5==false && Verloren6==true){
                System.out.println( Nummer+" Ritter 4 hat Ritter 6 nicht getroffen ");
                textArea.setText(Nummer+" Ritter 4 hat Ritter 6 nicht getroffen ");
                Thread.sleep(500);
            }
            else if (Nummer>0.3&&S[3]==2&& Verloren6==true){
                System.out.println( Nummer+" Ritter 4 hat Ritter 6 nicht getroffen ");
                textArea.setText(Nummer+" Ritter 4 hat Ritter 6 nicht getroffen ");
                Thread.sleep(900);
            }else if (Nummer>0.3&&S[3]==2&& Verloren6==false&& Verloren1==true){
                System.out.println( Nummer+" Ritter 4 hat Ritter 1 nicht getroffen ");
                textArea.setText(Nummer+" Ritter 4 hat Ritter 1 nicht getroffen ");
                Thread.sleep(900);
            }else if (Nummer>0.3&&S[3]==3&& Verloren1==true){
                System.out.println( Nummer+" Ritter 4 hat Ritter 1 nicht getroffen ");
                textArea.setText(Nummer+" Ritter 4 hat Ritter 1 nicht getroffen ");
                Thread.sleep(900);
            }else if (Nummer>0.3&&S[3]==3&& Verloren1==false&& Verloren2==true){
                System.out.println( Nummer+" Ritter 4 hat Ritter 2 nicht getroffen ");
                textArea.setText(Nummer+" Ritter 4 hat Ritter 2 nicht getroffen ");
                Thread.sleep(900);
            }else if (Nummer>0.3&&S[3]==4&& Verloren2==true){
                System.out.println( Nummer+" Ritter 4 hat Ritter 2 nicht getroffen ");
                textArea.setText(Nummer+" Ritter 4 hat Ritter 2 nicht getroffen ");
                Thread.sleep(900);
            }else if (Nummer>0.3&&S[3]==4&&Verloren2==false&& Verloren3==true){
                System.out.println( Nummer+" Ritter 4 hat Ritter 3 nicht getroffen ");
                textArea.setText(Nummer+" Ritter 4 hat Ritter 3 nicht getroffen ");
                Thread.sleep(900);
            }else if (Nummer>0.3&&S[3]==5&& Verloren3==true){
                System.out.println( Nummer+" Ritter 4 hat Ritter 3 nicht getroffen ");
                textArea.setText(Nummer+" Ritter 4 hat Ritter 3 nicht getroffen ");
                Thread.sleep(500);
            }


        }


    }
}

