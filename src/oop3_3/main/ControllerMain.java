package oop3_3.main;

import oop3_3.fw.Controller;
import oop3_3.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute();
    }
}
