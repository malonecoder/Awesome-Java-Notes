package com.lxm.java.OOP;

public class Driver implements IDriver {
    void driveSingle(BaoMaCar baoMaCar) {
        baoMaCar.run();
        System.out.println("驾驶员只能开宝马车");
    }

    @Override
    public void driver(ICar car) {
        car.run();
        System.out.println("驾驶员可以开任何类型的车");
    }
}
