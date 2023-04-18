package ProgramerGenerik.Application;

public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer> IntegerNumberData = new NumberData(1);
        NumberData<Long> LongNumberData = new NumberData(1L);

    }

    public static class NumberData<T extends Number>{

        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public NumberData(T data) {
            this.data = data;
        }
    }
}
