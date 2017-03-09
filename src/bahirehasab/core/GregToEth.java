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
public class GregToEth {
    
    public static void main(String[] args) {
        GregToEth g = new GregToEth();
        int ethYear = g.getEthioYear(2016, 9, 1);
        System.out.println(ethYear);
    }
    
    public double  gregToEthMonth ( int gregYear,int gregMonth,int gregDay ) {
	double days, ethMonth = 0;
	
//	days = daysFromSept ( gregYear, gregMonth, gregDay );
//	if ( days <= 360 ) {
//		ethMonth = Math.floor(days / 30 );
//		if ( days % 30 == 0 )
//			ethMonth -= 1;
//	}
//	else 
//		ethMonth = 12;
//	
	return ethMonth;
}

    public int getEthioYear(int gregYear, int gregMonth, int gregDay) {
        int ethYear;
        if (gregMonth > 9) {
            ethYear = gregYear - 7;
        } else if (gregMonth < 9) {
            ethYear = gregYear - 8;
        } else {  //Gregorian month is September (9)
            ethYear = gregYear - 8;
            if (isEthLeapYear(ethYear)) {
                if (gregDay > 11) {
                    ethYear += 1;
                }
            } else if (gregDay > 10) {
                ethYear += 1;
            }
        }

        return ethYear;
    }

    public boolean isEthLeapYear(int ethYear) {
        int ameteAlem = 5500 + ethYear;
        return (ameteAlem % 4) == 3 || ameteAlem % 4 == -1;
    }
}
