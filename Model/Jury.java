/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Itsuka Kotori
 */
public class Jury implements Keypad {

    private Boolean[] jury;
    private int juryCount;
    private static int counter;

    public Jury(int count) {
        this.juryCount = count;
        jury = new Boolean[count];
        counter = 0;
    }

    public void giveDec(String button) {
        if (counter != juryCount) {
            if (button.equalsIgnoreCase("green")) {
                jury[counter] = greenButton;
                counter++;
            } else {
                jury[counter] = redButton;
                counter++;
            }
        }
        else{
            System.out.println("all already give decision");
        }
    }
// masih salah kayanya ga paham

    public Boolean isJuryGiveDecision() {
        Boolean hasil = true;
        for (int i = 0; i < jury.length; i++) {
            if (jury[i] == null) {
                return false;
            }
        }
        return hasil;
    }

    public void changeDecision(int index) {
        if (jury[index] == false) {
            jury[index] = true;
        } else {
            jury[index] = false;
        }
    }

    public boolean getCompDecFromJury() {
        if (isJuryGiveDecision()) {
            int count = 0;
            for (int i = 0; i < jury.length; i++) {
                if (jury[i] == true) {
                    count++;
                }
            }
            double countInDouble = juryCount * 1.0;
            double checkInDouble = count * 1.0;
            if (checkInDouble > (countInDouble / 2)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
