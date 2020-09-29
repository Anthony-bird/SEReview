package src.com.feng;

import com.feng.demo03.MyService;

import java.util.ServiceLoader;

public class Test02 {
    public static void main(String[] args) {
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);

        for (MyService my : myServices) {
            my.service();
        }
    }
}
