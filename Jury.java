/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombol;

/**
 *
 * @author Lenovo Iyoss
 */
public class Jury implements Keypad {

    boolean[] jury;
    int juryCount;

    public Jury(int count) {
        this.juryCount = count;
        jury = new boolean[count];
    }

// masih salah kayanya ga paham
    public boolean isJuryGiveDecision() {
       Boolean[] check = new Boolean[juryCount];
        for (int i = 0; i < 10; i++) {
            check[i] = jury[i];
        }
        for (int i = 0; i < jury.length; i++) {
            if (check[i] == null) {
                return false;
            }else{
                return true;
            }
        }
        return true;
    }

    public boolean getCompDecFromJury() {
        int temp = 0;
        int persen = 100;
        int a = 100 / jury.length;

        for (int i = 0; i < jury.length; i++) {
            if (jury[i] == true) {
                temp++;
            }
        }
        int b = jury.length - temp;
        int c = a * b;
        int res = 100 - c;

        if (res >= 50) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean greenButton() {
        return true;
    }

    @Override
    public boolean redButton() {
        return false;
    }
}
