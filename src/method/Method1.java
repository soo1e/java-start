package method;

public class Method1 {
    public static void main(String[] args) {
        // 계산 1
        int a = 1;
        int b = 2;
        System.out.println(a + " + " + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println("결과 1 출력 : " + sum1);

        System.out.println("--------------------------------------------------------");
        // 계산 2
        int x = 10;
        int y = 20;
        System.out.println(x + " + " + y + " 연산 수행");
        int sum2 = x + y;
        System.out.println("결과 2 출력 : " + sum2);

        // 이렇게 중복되는 부분이 많을 때 함수를 만들어서 해결할 수 있다.


    }
}
