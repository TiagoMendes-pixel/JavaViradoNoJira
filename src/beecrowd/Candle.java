package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Candle {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int i = 0; i < t; i++){
            int h = input.nextInt();
            int m = input.nextInt();
            int o = input.nextInt();
            if(o == 0){
                System.out.printf("%02d:%02d - A porta fechou!\n",h,m);
            }else{
                System.out.printf("%02d:%02d - A porta abriu!\n",h,m);
            }
        }


    }
}
