import java.util.Random;

public class Riiter3 extends Ritter4 {
    //[0]Ritter1 bzw.button1 hat angriff Wahrscheinlichkeit von 60%
//[1]Ritter2 hat angriff Wahrscheinlichkeit von 50%
//[2]Ritter3 hat angriff Wahrscheinlichkeit von 40%
//[3]Ritter4 hat angriff Wahrscheinlichkeit von 30%
//[4]Ritter5 hat angriff Wahrscheinlichkeit von 20%
//[5]Ritter6 hat angriff Wahrscheinlichkeit von 10%
// VerlorenX==true: S[] bzw. Ritter X hat ein Leben oder mehr
// VerlorenY==false: S[] hat gar kein Leben  bzw. er hat das Spiel verloren
    public void R3() throws InterruptedException {

        double Nummer;
        if (S[2] == 0|| S[2] < 0) {
            Verloren3 = false;
            System.out.println("  Ritter 3 ist Tot  " );
            textArea.setText("  Ritter 3 ist Tot  " );
            Thread.sleep(900);

        }
        else {
            Verloren3 = true;
        } if (Verloren3 = true && S[2] >= 1) {
            Nummer = random.nextDouble() * (1); // Random zwischwn 0 und 1
            if (Nummer < 0.4) {
                S[2] = S[2] + 1;
                if (S[2] == 2&&Verloren4==true) {
                    S[3] = S[3] - 1;
                    System.out.println(Nummer + "  Ritter 3 hat Ritter 4 getroffen  " + S[2]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 3 hat Ritter 4 getroffen  " + S[2]+ " Leben");
                    Thread.sleep(900);

                }else if (S[2] == 2&&Verloren4==false&&Verloren5==true) {
                    S[4] = S[4] - 1;
                    System.out.println(Nummer + "  Ritter 3 hat Ritter 5 getroffen  " + S[2]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 3 hat Ritter 5 getroffen  " + S[2]+ " Leben");
                    Thread.sleep(900);
                }
                else if (S[2] == 3&&Verloren5==true) {
                    S[4] = S[4] - 1;
                    System.out.println(Nummer + "  Ritter 3 hat Ritter 5 getroffen  " + S[2]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 3 hat Ritter 5 getroffen  " + S[2]);
                    Thread.sleep(900);
                }else if (S[2] == 3&&Verloren5==false&&Verloren6==true) {
                    S[5] = S[5] - 1;
                    System.out.println(Nummer + "  Ritter 3 hat Ritter 6 getroffen  " + S[2]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 3 hat Ritter 6 getroffen  " + S[2]+ " Leben");
                    Thread.sleep(900);
                } else if (S[2] == 3&&Verloren5==false&&Verloren6==false&&Verloren1==true) {
                    S[0] = S[0] - 1;
                    System.out.println(Nummer + "  Ritter 3 hat Ritter 1 getroffen  " + S[2] + " Leben");
                    textArea.setText(Nummer + "  Ritter 3 hat Ritter 1 getroffen  " + S[2] + " Leben");
                    Thread.sleep(900);
                } else if (S[2] == 4&& Verloren6==true) {
                    S[5] = S[5] - 1;
                    System.out.println(Nummer + "  Ritter 3 hat Ritter 6 getroffen  " + S[2]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 3 hat Ritter 6 getroffen  " + S[2]+ " Leben");
                    Thread.sleep(900);
                } else if (S[2] == 4&& Verloren6==false&&Verloren1==true) {
                    S[5] = S[5] - 1;
                    System.out.println(Nummer + "  Ritter 3 hat Ritter 1 getroffen  " + S[2]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 3 hat Ritter 1 getroffen  " + S[2]+ " Leben");
                    Thread.sleep(900);
                }
                else if(S[2] == 5 && Verloren6==false&&Verloren1==true){
                    S[0] = S[0] - 1;
                    System.out.println(Nummer + "  Ritter 3 hat Ritter 1 getroffen  " + S[2]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 3 hat Ritter 1 getroffen  " + S[2]+ " Leben");
                    Thread.sleep(900);

                }else if(S[2] == 6 && Verloren1==false&&Verloren2==true ){

                    S[1] = S[1] - 1;
                    System.out.println(Nummer + "  Ritter 3 hat Ritter 2 getroffen  " + S[2]+ " Leben");
                    System.out.println(Nummer + "  Ritter 3 hat das Spiel gewinnen  " + S[2]+ " Leben");

                    textArea.setText(Nummer + "  Ritter 3 hat Ritter 2 getroffen  " + S[2]+ " Leben");
                    Thread.sleep(900);

                    textArea.setText("Ritter 3 hat das Spiel gewinnen   " + S[2]+ " Leben");
                    Thread.sleep(6000);
                    System.exit(5);
                }else if(S[2] == 6 && Verloren1==false&&Verloren2==false ){

                    System.out.println(Nummer + "  Ritter 3 hat das Spiel gewinnen  " + S[2]+ " Leben");
                    Thread.sleep(900);
                    textArea.setText("Ritter 3 hat das Spiel gewinnen   " + S[2]+ " Leben");
                    Thread.sleep(6000);
                    System.exit(5);
                }else if (S[2] == 5&&Verloren5==false&&Verloren6==false&&Verloren4==false&&Verloren2==false&&Verloren1==false) {

                    System.out.println(Nummer + "  Ritter 3 hat alle Rittern getroffen  " + S[2]+ " Leben");
                    textArea.setText(Nummer + "  Ritter 3 hat alle Rittern getroffen  " + S[2]+ " Leben");
                    System.out.println("Ritter 3 hat das Spiel gewinnen   " + S[2] + " Leben");
                    textArea.setText("Ritter 3 hat das Spiel gewinnen   " + S[2] + " Leben");
                    Thread.sleep(900);
                    Thread.sleep(6000);
                    System.exit(5);
                }
            }else if (Nummer>0.4&&S[2]==1&&Verloren4==true){
                System.out.println( Nummer+"  Ritter 3 hat Ritter 4 nicht getroffen");
                textArea.setText(Nummer+" Ritter 3 hat Ritter 4 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer>0.4&&S[2]==1&&Verloren4==false&&Verloren5==true){
                System.out.println( Nummer+"  Ritter 3 hat Ritter 5 nicht getroffen");
                textArea.setText(Nummer+" Ritter 3 hat Ritter 5 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer>0.4&&S[2]==2&&Verloren5==true){
                System.out.println( Nummer+" Ritter 3 hat Ritter 5 nicht getroffen");
                textArea.setText(Nummer+"  Ritter 3 hat Ritter 5 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer>0.4&&S[2]==2&&Verloren5==false&&Verloren6==true ){
                System.out.println( Nummer+" Ritter 3 hat Ritter 6 nicht getroffen");
                textArea.setText(Nummer+"  Ritter 3 hat Ritter 6 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer>0.4&&S[2]==3&&Verloren6==true){
                System.out.println( Nummer+"  Ritter 3 hat Ritter 6 nicht getroffen");
                textArea.setText(Nummer+"  Ritter 3 hat Ritter 6 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer>0.4&&S[2]==3&&Verloren6==false&&Verloren1==true){
                System.out.println( Nummer+"  Ritter 3 hat Ritter 1 nicht getroffen");
                textArea.setText(Nummer+"  Ritter 3 hat Ritter 1 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer>0.4&&S[2]==4&&Verloren1==true){
                System.out.println( Nummer+"  Ritter 3 hat Ritter 1 nicht getroffen");
                textArea.setText(Nummer+"  Ritter 3 hat Ritter 1 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer>0.4&&S[2]==4&&Verloren1==false&&Verloren2==true){
                System.out.println( Nummer+"  Ritter 3 hat Ritter 2 nicht getroffen");
                textArea.setText(Nummer+"  Ritter 3 hat Ritter 2 nicht getroffen");
                Thread.sleep(900);
            }else if (Nummer>0.4&&S[2]==5&&Verloren2==true){
                System.out.println( Nummer+"  Ritter 3 hat Ritter 2 nicht getroffen");
                textArea.setText(Nummer+"  Ritter 3 hat Ritter 2 nicht getroffen");
                Thread.sleep(900);
            }

        }
    }
}