package oop3_3.main;

public class LottoMachineMain {
    public static void main(String[] args) {
        //변수가 45개 필요하다.
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT];

        for (int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++) {
            balls[i] = new Ball(i + 1);
        }

        //LottoMachine인스턴스가 생성되었다.
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getNumber());
        }
    }
}
