package Section02;

import java.util.Scanner;

/**
 * 반장구하기
 */

public class Main11 {

    public int solution(int n, int[][] arr){
        int answer=0, max=Integer.MIN_VALUE;
        for(int i = 1; i<=n ;i++){
            int cnt = 0;
            for(int j = 1; j<=n; j++){
                for(int k=1; k<=5; k++){ //학년
                    if(arr[i][k]==arr[j][k]) { //arr[1][1] == arr[1][1] 일 경우 모든 학생이 다 카운팅 되기 때문에 무관
                        cnt++;
                        break; //주의
                    }
                }
            }
            
            if(cnt>max){ //최소 정수값보다 크다면 cnt==max 
                max= cnt;
                answer=i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main11 t = new Main11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];  //이차원 배열 동적 생성, 1번부터 시작 n+1, 1학년부터 5학년 6개의 열
        for(int i=1; i<=n; i++){ //학생 번호
            for(int j=1; j<=5; j++){ //1학년부터 5학년까지 번호
                arr[i][j] = sc.nextInt(); //이차배열의 행렬 값에 맞춰 숫자 대입
            }
        }
        System.out.println(t.solution(n, arr));
    }
}
