import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[][] bingoBoard = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingoBoard[i][j] = s.nextInt();
            }
        }

        int[] numArr = new int[25];

        for (int i = 0; i < 25; i++) {
            numArr[i] = s.nextInt();
        }

        int[] bingo = new int[12];
        for (int i = 0; i < 12; i++) {
            bingo[i] = 0;
        }

        int a = 0;

        outLoop :
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if(numArr[i] == bingoBoard[j][k]){

                        bingo[j]+=1;
                        bingo[k+5]+=1;

                        if(bingo[j] == 5){
                            a+=1;
                        }

                        if(bingo[k+5] == 5) {
                            a+=1;
                        }

                        if(j==2 & k==2){
                            bingo[10] += 1;
                            bingo[11] += 1;
                            if(bingo[10] == 5){
                                a+=1;
                            }
                            if(bingo[11] == 5){
                                a+=1;
                            }
                        }

                        if(j == k & j != 2){
                            bingo[10] += 1;
                            if(bingo[10] == 5){
                                a+=1;
                            }
                        } else if (j + k == 4 & j != 2) {
                            bingo[11] += 1;
                            if(bingo[11] == 5){
                                a+=1;
                            }
                        }

                        if(a >= 3){
                            System.out.println(i+1);
                            break outLoop;
                        }
                    }
                }
            }
        }
    }
}