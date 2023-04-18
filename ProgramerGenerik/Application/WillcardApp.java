package ProgramerGenerik.Application;

import ProgramerGenerik.MyData;

public class WillcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("Habib"));
        print(new MyData<MultipleConstraintApp>(new MultipleConstraintApp()));

    }

    public static void print(MyData<?> myData){

        System.out.println(myData.getData());
    }
}
