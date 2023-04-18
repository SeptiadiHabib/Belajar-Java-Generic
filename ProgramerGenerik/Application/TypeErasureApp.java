package ProgramerGenerik.Application;

import ProgramerGenerik.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("Habib");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
