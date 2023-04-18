package ProgramerGenerik.Application;

import ProgramerGenerik.MyData;

public class ContravarianApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Habib");
        MyData<? super String>myData= objectMyData;

        process(objectMyData);
        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String>myData){
        Object value = (Object) myData.getData();
        System.out.println("Procces parameter "+ value);

        myData.setData("Septiadi Habib");

    }
}
