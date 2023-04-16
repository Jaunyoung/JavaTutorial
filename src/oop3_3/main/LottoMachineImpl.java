package oop3_3.main;

public class LottoMachineImpl implements LottoMachine {
    private Ball[] balls;

    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    @Override
    public void mix() {
        for (int i = 0; i < 10000; i++) {
            int x1 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
            int x2 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
            if (x1 != x2) {
                Ball tmp = balls[x1]; //값을 치환할때는 같은 type의 변수가 필요하다.
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }
    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[LottoMachine.RETURN_BALL_COUNT]; // Ball6개를 참조할 수 있는 배열
        for (int i = 0; i < 6; i++) {
            result[i] = balls[i]; // 섞였으니까
        }
        return result;
    }
}
