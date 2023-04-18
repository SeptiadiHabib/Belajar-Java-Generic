package ProgramerGenerik.Application;

import ProgramerGenerik.MyData;

public class GenerikClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Habib");
        MyData<Integer> integerMyData = new MyData<>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
