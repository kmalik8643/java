public class obj {

        private int arg1;
        private String arg2;

        // Constructor
        private obj(int arg1, String arg2) {
            this.arg1 = arg1;
            this.arg2 = arg2;
            System.out.println("Constructor called!");
        }

        public int getArg1() {
            return arg1;
        }

        public String getArg2() {
            return arg2;
        }

        public static void main(String[] args) {
            // Creating an object of MyClass
            obj obj = new obj(10, "Hello");

            // Accessing the object's state through getter methods
            System.out.println("arg1: " + obj.getArg1());
            System.out.println("arg2: " + obj.getArg2());
        }
    }


