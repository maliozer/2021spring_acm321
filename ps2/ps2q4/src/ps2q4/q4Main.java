package ps2q4;

public class q4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int f1 = 0;
        int f2 = 0;
        int f3 = 1;
        int sum = 0;
        while(f3 < 1000000){
            if(f3 % 2 == 0){
                sum += f3;
            }
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        System.out.println("Solution to problem 2 = " + sum);
	}

}
