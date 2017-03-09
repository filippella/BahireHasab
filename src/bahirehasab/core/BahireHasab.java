package bahirehasab.core;

public class BahireHasab {
    
    private int abektei;
    private int amete_alem;
    private int bealeMetk;
    private int dateEaster;
    private int dateGoodFriday;
    private int mebajaHamer;
    private int medeb;
    private int meteneRabit;
    private int metk;
    private int monthEaster;
    private int monthGoodFriday;
    private int nenevhMonth;
    private int tinteKemer;
    private int tinteOn;
    private int wenber;
    private int wengelawi;
    private int year;

    public BahireHasab(int year) {
        this.year = year;
        initialize();
    }

    private void initialize() {
        this.amete_alem = this.year + 5500;
        this.wengelawi = this.amete_alem % 4;
        this.meteneRabit = this.amete_alem / 4;
        this.tinteKemer = (this.amete_alem + this.meteneRabit) % 7;
        this.tinteOn = (this.tinteKemer + 6) % 7;
        this.medeb = this.amete_alem % 19;
        this.wenber = this.medeb - 1;
        if (this.medeb == 0) {
            this.wenber = 18;
        } else if (this.medeb == 1) {
            this.wenber = 0;
        }
        this.abektei = (this.wenber * 11) % 30;
        this.metk = 30 - this.abektei;
        this.nenevhMonth = 5;
        this.bealeMetk = 1;
        if (this.metk < 14) {
            this.bealeMetk = 2;
            this.nenevhMonth = 6;
        }
        int tewsak = 8 - ((((this.tinteOn + ((this.bealeMetk - 1) * 2)) + this.metk) + 2) % 7);
        if (this.bealeMetk == 1 && this.metk + tewsak > 30) {
            this.nenevhMonth = 6;
        }
        this.mebajaHamer = (this.metk + tewsak) % 30;
        setGoodFriday();
        setEaster();
    }

    private void setGoodFriday() {
        this.monthGoodFriday = this.nenevhMonth + 2;
        this.dateGoodFriday = this.mebajaHamer + 7;
        if (this.dateGoodFriday > 30) {
            this.monthGoodFriday++;
            this.dateGoodFriday %= 30;
        }
    }

    private void setEaster() {
        this.monthEaster = this.nenevhMonth + 2;
        this.dateEaster = this.mebajaHamer + 9;
        if (this.dateEaster > 30) {
            this.monthEaster++;
            this.dateEaster %= 30;
        }
    }

    public int getGoodFridayDate() {
        return this.dateGoodFriday;
    }

    public int getGoodFridayMonth() {
        return this.monthGoodFriday;
    }

    public int getEasterDate() {
        return this.dateEaster;
    }

    public int getEasterMonth() {
        return this.monthEaster;
    }

    public int getAmeteAlem() {
        return this.amete_alem;
    }

    public int getMeteneRabit() {
        return this.meteneRabit;
    }

    public int getTinteOn() {
        return this.tinteOn;
    }

    public int getMetk() {
        return this.metk;
    }

    public int getNenevhDate() {
        return this.mebajaHamer;
    }

    public int getNenevhMonth() {
        return this.nenevhMonth;
    }

    public int getChristmassDate() {
        if (this.year % 4 == 0) {
            return 28;
        }
        return 29;
    }

    public int getWengelawi() {
        return this.wengelawi;
    }

    public int lelit(int d, int m) {
        int h = m / 2;
        if (m == 1) {
            h = m;
        }
        return ((d + h) + this.abektei) % 30;
    }

    public int getTinteKemer() {
        return this.tinteKemer;
    }

    public int getMedeb() {
        return this.medeb;
    }

    public int getWenber() {
        return this.wenber;
    }

    public int getMebajaHamer() {
        return this.mebajaHamer;
    }

    public int getSpecificDays(int ddd, int mmm) {
        return (((this.tinteOn + ((mmm - 1) * 2)) + 2) + ddd) % 7;
    }
}
