package bahirehasab.core;

import bahirehasab.models.Constants;

public class toGC {
    int change;
    int greDate;
    int greMonth;
    int greYear;
    int leap_year;

    public void convertor(int ethDate, int ethMonth, int ethYear) {
        int lukas = 0;
        if (ethYear % 4 == 3) {
            lukas = 1;
        }
        int month_days = 30;
        if (ethMonth == 13) {
            month_days = lukas + 5;
        }
        if (ethDate <= month_days) {
            this.greYear = ethYear + 8;
            if (ethMonth < 5) {
                this.greYear--;
            }
            if (ethYear % 4 == 0) {
                this.leap_year = 1;
            }
            this.greMonth = ((ethMonth - 4) + 12) % 12;
            switch (ethMonth) {
                case Constants.MIN_DELTA_FOR_SCROLLING /*1*/:
                    this.change = this.leap_year + 10;
                    this.greDate = (ethDate + 10) + this.leap_year;
                    if (ethDate > 20) {
                        this.greMonth++;
                        this.greDate -= 30;
                        break;
                    }
                    break;
                case Constants.SWIPE_DOWN /*2*/:
                    this.change = this.leap_year + 10;
                    this.greDate = (ethDate + 10) + this.leap_year;
                    if (ethDate > 21 - this.leap_year) {
                        this.greMonth++;
                        this.greDate -= 31;
                        break;
                    }
                    break;
                case Constants.SWIPE_LEFT /*3*/:
                    this.change = this.leap_year + 9;
                    this.greDate = (ethDate + 9) + this.leap_year;
                    if (ethDate > 21 - this.leap_year) {
                        this.greMonth++;
                        this.greDate -= 30;
                        break;
                    }
                    break;
                case Constants.SWIPE_RIGHT /*4*/:
                    this.change = this.leap_year + 9;
                    this.greDate = (ethDate + 9) + this.leap_year;
                    if (ethDate > 22 - this.leap_year) {
                        this.greMonth++;
                        this.greYear++;
                        this.greDate -= 31;
                        break;
                    }
                    break;
                case Constants.COL_MONTH /*5*/:
                    this.change = this.leap_year + 8;
                    this.greDate = (ethDate + 8) + this.leap_year;
                    if (ethDate > 23 - this.leap_year) {
                        this.greMonth++;
                        this.greDate -= 31;
                        break;
                    }
                    break;
                case Constants.COL_YEAR /*6*/:
                    this.change = this.leap_year + 7;
                    this.greDate = (ethDate + 7) + this.leap_year;
                    if (ethDate > 21) {
                        this.greMonth++;
                        this.greDate = (this.greDate - 28) - this.leap_year;
                        break;
                    }
                    break;
                case Constants.COL_HOUR /*7*/:
                    this.change = 9;
                    this.greDate = ethDate + 9;
                    if (ethDate > 22) {
                        this.greMonth++;
                        this.greDate -= 31;
                        break;
                    }
                    break;
                case Constants.COL_MIN /*8*/:
                    this.change = 8;
                    this.greDate = ethDate + 8;
                    if (ethDate > 22) {
                        this.greMonth++;
                        this.greDate -= 30;
                        break;
                    }
                    break;
                case Constants.DEFAULT_MAX_VALUE /*9*/:
                    this.change = 8;
                    this.greDate = ethDate + 8;
                    if (ethDate > 23) {
                        this.greMonth++;
                        this.greDate -= 31;
                        break;
                    }
                    break;
                case Constants.COL_IMAGE_ID /*10*/:
                    this.change = 7;
                    this.greDate = ethDate + 7;
                    if (ethDate > 23) {
                        this.greMonth++;
                        this.greDate -= 30;
                        break;
                    }
                    break;
                case Constants.COL_ALARM /*11*/:
                    this.change = 7;
                    this.greDate = ethDate + 7;
                    if (ethDate > 24) {
                        this.greMonth++;
                        this.greDate -= 31;
                        break;
                    }
                    break;
                case 12:
                    this.change = 6;
                    this.greDate = ethDate + 6;
                    if (ethDate > 25) {
                        this.greMonth++;
                        this.greDate -= 31;
                        break;
                    }
                    break;
                case 13:
                    this.change = 5;
                    this.greDate = ethDate + 5;
                    break;
                default:
                    this.change = 0;
                    this.greDate = 0;
                    break;
            }
            if (this.greMonth == 0) {
                this.greMonth = 12;
            }
            if (this.greDate == 0) {
                this.greDate = 1;
            }
        }
    }

    public int getDate() {
        return this.greDate;
    }

    public int getMonth() {
        return this.greMonth;
    }

    public int getYear() {
        return this.greYear;
    }

    public int getChange() {
        return this.change;
    }

    public String getPageTitleGreEng(int i) {
        switch (i) {
            case Constants.MIN_DELTA_FOR_SCROLLING /*1*/:
                return "January";
            case Constants.SWIPE_DOWN /*2*/:
                return "February";
            case Constants.SWIPE_LEFT /*3*/:
                return "March";
            case Constants.SWIPE_RIGHT /*4*/:
                return "April";
            case Constants.COL_MONTH /*5*/:
                return "May";
            case Constants.COL_YEAR /*6*/:
                return "June";
            case Constants.COL_HOUR /*7*/:
                return "July";
            case Constants.COL_MIN /*8*/:
                return "Augest";
            case Constants.DEFAULT_MAX_VALUE /*9*/:
                return "September";
            case Constants.COL_IMAGE_ID /*10*/:
                return "October";
            case Constants.COL_ALARM /*11*/:
                return "November";
            case 12:
                return "December";
            default:
                return null;
        }
    }
}
