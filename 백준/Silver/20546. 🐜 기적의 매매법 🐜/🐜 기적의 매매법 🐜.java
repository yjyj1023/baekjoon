import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int moneyJ = s.nextInt();
        int moneyS = moneyJ;

        int[] stockPrice = new int[14];

        for (int i = 0; i < 14; i++) {
            stockPrice[i] = s.nextInt();
        }

        int stockJ = 0;
        int stockS = 0;

        int countPlus = 0;
        int countMinus = 0;

        int yesterday = stockPrice[0];

        for (int i = 0; i < 14; i++) {
            if(stockPrice[i] <= moneyJ){
                while(stockPrice[i] <= moneyJ){
                    stockJ++;
                    moneyJ -= stockPrice[i];
                }
            }

            if(yesterday < stockPrice[i]){
                countPlus++;
                countMinus = 0;
            } else if (yesterday == stockPrice[i]) {
                countPlus = 0;
                countMinus = 0;
            }else{
                countPlus = 0;
                countMinus++;
            }

            if(countPlus >= 3){
                if(stockS > 0){
                    moneyS = stockPrice[i] * stockS;
                    stockS = 0;
                    countPlus = 0;
                }
            }else if(countMinus >= 3){
                if(stockPrice[i] <= moneyS){
                    while(stockPrice[i] <= moneyS){
                        stockS++;
                        moneyS -=stockPrice[i];
                    }
                }
            }
            yesterday = stockPrice[i];
        }

        int jun = moneyJ + stockPrice[13] * stockJ;
        int sung = moneyS + stockPrice[13] * stockS;

        if(jun > sung){
            System.out.println("BNP");
        } else if (jun < sung) {
            System.out.println("TIMING");
        }else{
            System.out.println("SAMESAME");
        }
    }
}
