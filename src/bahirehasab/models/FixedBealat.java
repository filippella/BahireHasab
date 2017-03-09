/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahirehasab.models;

import bahirehasab.core.BahireHasab;

/**
 *
 * @author Filippo
 */
public class FixedBealat {
    
    private final BahireHasab hasab;

    public FixedBealat(BahireHasab hasab) {
        this.hasab = hasab;
    }
    
    public int enqutatashKen() {
        return 1;
    }

    public int enqutatashWor() {
        return 0;
    }

    public int meskelKen() {
        return 17;
    }

    public int meskelWor() {
        return 0;
    }

    public int genaKen(int year) {
        int ken = 29;
        if (((hasab.getAmeteAlem() -1) % 4) == 3) {
            ken = 28;
        }

        return ken;
    }

    public int genaWor() {
        return 3;
    }

    public int timketKen() {
        return 11;
    }

    public int timketWor() {
        return 4;
    }

    public int tsomeFilsetaKen() {
        return 1;
    }

    public int tsomeFilsetaWor() {
        return 11;
    }

    public int filsetaKen() {
        return 16;
    }

    public int filsetaWor() {
        return 11;
    }

    public int debreTaborKen() {
        return 13;
    }

    public int debreTaborWor() {
        return 11;
    }
}
