package oop3_3.main;

public interface LottoMachine {
    int MAX_BALL_COUNT = 45; // public static 생략된 것임.
    int RETURN_BALL_COUNT = 6;
    public abstract void setBalls(Ball[] balls); // Ball[] 이 여러개를 받겠다. 45개를 받는다.
    public void mix(); // 자기가 가지고 있는 Ball들을 섞는다.
    public Ball[] getBalls(); // 6개의 Ball을 반환한다.
}
