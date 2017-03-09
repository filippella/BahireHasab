/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahirehasab.core;

/**
 *
 * @author Filippo
 */
public class Bealat {

    private final BahireHasab hasab;
    private final int TINTE_ABEKTE = 11;

    private final int ELET_TEWSAK[] = {6, 5, 4, 3, 2, 8, 7};

    public Bealat(BahireHasab hasab) {
        this.hasab = hasab;
    }

    public int daysEskeMebajaHamer(int year) {
        int daysEskeMetkea = bealeMetikeaWor(year) * 30 + bealeMetikeaKen(year);
        int daysMetkeaEskeNenewe = 120 + ELET_TEWSAK[bealeMetikeaElet(year)];
        int days = daysEskeMetkea + daysMetkeaEskeNenewe;
        return days;
    }

    public int mebajaHamerWor(int year) {
        int wor = Math.round(daysEskeMebajaHamer(year) / 30);
        if ((daysEskeMebajaHamer(year) % 30) == 0) {
            wor--;
        }
        return wor;
    }

    public int mebajaHamerKen(int year) {
        int ken = (bealeMetikeaKen(year) + ELET_TEWSAK[bealeMetikeaElet(year)]) % 30;
        if (ken == 0) {
            ken = 30;
        }
        return ken;
    }

    public int abekte(int year) {
        return ((hasab.getWenber() * TINTE_ABEKTE) % 30);
    }

    public int tinteKemerElet(int year) {
        int meteneRabeit = Math.round(this.hasab.getAmeteAlem() / 4);
        return ((meteneRabeit + this.hasab.getAmeteAlem()) % 7);
    }

    public int tinteKemerKen() {
        return 1;
    }

    public int tinteKemerWor() {
        return 0;
    }

    public int bealeMetikeaKen(int year) {
        return 30 - abekte(year);
    }

    public int bealeMetikeaWor(int year) {
        if (bealeMetikeaKen(year) > 14) {
            return 0;
        } else if (bealeMetikeaKen(year) < 14) {
            return 1;
        } else //alert ("Error in beale metikea wor ");
        {
            return -1;
        }
    }

    public int bealeMetikeaElet(int year) {
        int days = bealeMetikeaWor(year) * 30 + bealeMetikeaKen(year);
        int elet = (tinteKemerElet(year) - 1 + days) % 7;
        return elet;
    }

    public int neneweKen(int year) {
        return mebajaHamerKen(year);
    }

    public int neneweWor(int year) {
        return mebajaHamerWor(year);
    }

    public int abiyTsomeKen(int year) {
        int ken = (daysEskeMebajaHamer(year) + 14) % 30;
        if (ken == 0) {
            ken = 30;
        }
        return ken;
    }

    public int abiyTsomeWor(int year) {
        int wor = Math.round((daysEskeMebajaHamer(year) + 14) / 30);
        if (((daysEskeMebajaHamer(year) + 14) % 30) == 0) {
            wor--;
        }
        return wor;
    }

    public int debreZeitKen(int year) {
        int ken = (daysEskeMebajaHamer(year) + 41) % 30;
        if (ken == 0) {
            ken = 30;
        }
        return ken;
    }

    public int debreZeitWor(int year) {
        int wor = Math.round((daysEskeMebajaHamer(year) + 41) / 30);
        if (((daysEskeMebajaHamer(year) + 41) % 30) == 0) {
            wor--;
        }
        return wor;
    }

    public int hosaenaKen(int year) {
        int ken = (daysEskeMebajaHamer(year) + 62) % 30;
        if (ken == 0) {
            ken = 30;
        }
        return ken;
    }

    public int hosaenaWor(int year) {
        int wor = Math.round((daysEskeMebajaHamer(year) + 62) / 30);
        if (((daysEskeMebajaHamer(year) + 62) % 30) == 0) {
            wor--;
        }
        return wor;
    }

    public int sikletKen(int year) {
        int ken = (daysEskeMebajaHamer(year) + 67) % 30;
        if (ken == 0) {
            ken = 30;
        }
        return ken;
    }

    public int sikletWor(int year) {
        int wor = Math.round((daysEskeMebajaHamer(year) + 67) / 30);
        if (((daysEskeMebajaHamer(year) + 67) % 30) == 0) {
            wor--;
        }
        return wor;
    }

    public int tinsaeKen(int year) {
        int ken = (daysEskeMebajaHamer(year) + 69) % 30;
        if (ken == 0) {
            ken = 30;
        }
        return ken;
    }

    public int tinsaeWor(int year) {
        int wor = Math.round((daysEskeMebajaHamer(year) + 69) / 30);
        if (((daysEskeMebajaHamer(year) + 69) % 30) == 0) {
            wor--;
        }
        return wor;
    }

    public int rekebeKahinatKen(int year) {
        int ken = (daysEskeMebajaHamer(year) + 93) % 30;
        if (ken == 0) {
            ken = 30;
        }
        return ken;
    }

    public int rekebeKahinatWor(int year) {
        int wor = Math.round((daysEskeMebajaHamer(year) + 93) / 30);
        if (((daysEskeMebajaHamer(year) + 93) % 30) == 0) {
            wor--;
        }
        return wor;
    }

    public int ergetKen(int year) {
        int ken = (daysEskeMebajaHamer(year) + 108) % 30;
        if (ken == 0) {
            ken = 30;
        }
        return ken;
    }

    public int ergetWor(int year) {
        int wor = Math.round((daysEskeMebajaHamer(year) + 108) / 30);
        if (((daysEskeMebajaHamer(year) + 108) % 30) == 0) {
            wor--;
        }
        return wor;
    }

    public int peraklitosKen(int year) {
        int ken = (daysEskeMebajaHamer(year) + 118) % 30;
        if (ken == 0) {
            ken = 30;
        }
        return ken;
    }

    public int peraklitosWor(int year) {
        int wor = Math.round((daysEskeMebajaHamer(year) + 118) / 30);
        if (((daysEskeMebajaHamer(year) + 118) % 30) == 0) {
            wor--;
        }
        return wor;
    }

    public int tsomeHawariatKen(int year) {
        int ken = (daysEskeMebajaHamer(year) + 119) % 30;
        if (ken == 0) {
            ken = 30;
        }
        return ken;
    }

    public int tsomeHawariatWor(int year) {
        int wor = Math.round((daysEskeMebajaHamer(year) + 119) / 30);
        if (((daysEskeMebajaHamer(year) + 119) % 30) == 0) {
            wor--;
        }
        return wor;
    }

    public int tsomeDihenetKen(int year) {
        int ken = (daysEskeMebajaHamer(year) + 121) % 30;
        if (ken == 0) {
            ken = 30;
        }
        return ken;
    }

    public int tsomeDihenetWor(int year) {
        int wor = Math.round((daysEskeMebajaHamer(year) + 121) / 30);
        if (((daysEskeMebajaHamer(year) + 121) % 30) == 0) {
            wor--;
        }
        return wor;
    }

    public int yeLidetaElet(int year, int month) {
        int days = 30 * month;
        int elet = (tinteKemerElet(year) + days) % 7;
        return elet;
    }
}
