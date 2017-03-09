package bahirehasab.core;

import bahirehasab.models.Constants;

public class toEC {
    int change;
    int ethDate;
    int ethMonth;
    int ethYear;
    int yohans;

    public void convertor(int greDate, int greMonth, int greYear) {
        this.ethYear = greYear - 8;
        if (greMonth > 8) {
            this.ethYear++;
        }
        if (this.ethYear % 4 == 0) {
            this.yohans = 1;
        }
        this.ethMonth = (greMonth + 4) % 12;
        if (this.ethMonth == 0) {
            this.ethMonth = 12;
        }
        switch (greMonth) {
            case Constants.MIN_DELTA_FOR_SCROLLING /*1*/:
                this.change = this.yohans + 8;
                break;
            case Constants.SWIPE_DOWN /*2*/:
                this.change = this.yohans + 7;
                break;
            case Constants.SWIPE_LEFT /*3*/:
                this.change = 9;
                break;
            case Constants.SWIPE_RIGHT /*4*/:
                this.change = 8;
                break;
            case Constants.COL_MONTH /*5*/:
                this.change = 8;
                break;
            case Constants.COL_YEAR /*6*/:
                this.change = 7;
                break;
            case Constants.COL_HOUR /*7*/:
                this.change = 7;
                break;
            case Constants.COL_MIN /*8*/:
                this.change = 6;
                break;
            case Constants.DEFAULT_MAX_VALUE /*9*/:
                if (greDate > 5) {
                    if (greDate <= this.yohans + 10) {
                        this.ethMonth = 13;
                        this.ethYear--;
                        this.ethDate = greDate - 5;
                        break;
                    }
                    this.ethMonth = 1;
                    this.ethDate = (greDate - 10) - this.yohans;
                    break;
                }
                this.ethMonth = 12;
                this.ethYear--;
                this.ethDate = (greDate + 30) - 5;
                break;
            case Constants.COL_IMAGE_ID /*10*/:
                this.change = this.yohans + 10;
                break;
            case Constants.COL_ALARM /*11*/:
                this.change = this.yohans + 9;
                break;
            case 12:
                this.change = this.yohans + 9;
                break;
            default:
                this.change = 0;
                break;
        }
        if (greMonth != 9) {
            this.ethDate = greDate - this.change;
            if (greDate <= this.change) {
                this.ethDate += 30;
                this.ethMonth--;
            }
        }
        if (this.ethMonth == 0) {
            this.ethMonth = 13;
        }
    }

    public int getDate() {
        return this.ethDate;
    }

    public int getMonth() {
        return this.ethMonth;
    }

    public int getYear() {
        return this.ethYear;
    }
}
