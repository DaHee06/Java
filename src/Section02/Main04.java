package Section02;

import java.util.Scanner;

/**
 * 피보나치 수열 : 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
 *
 */
public class Main04 {

//    public int[] solution(int n){
//        int[] answer=new int[n];
//        answer[0]=1;
//        answer[1]=1;
//        for(int i=2; i<n; i++){
//            answer[i]=answer[i-2]+answer[i-1];
//        }
//        return answer;
//    }

    public void solution(int n){
        int a=1, b=1, c;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        Main04 T = new Main04();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
//        for(int x :T.solution(n)) System.out.print(x+" ");
        T.solution(n);
    }

}
