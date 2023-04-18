package ProgramerGenerik.Application;

import ProgramerGenerik.MyData;

public class CovarianApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Habib");
        process(stringMyData);
    }
    public static void process(MyData<? extends Object>myData){
        System.out.println(myData.getData());

        // myData.setData(1); tidak boleh. karena berbahaya
    }
}
