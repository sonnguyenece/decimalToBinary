public class Main {
    public static void main(String[] args) {
        final int NUMBER = 10000;
        MyGenericStack<Integer> myStack = new MyGenericStack();
//        int[] binaryArr = new int[10];
        convertToBinary(NUMBER, myStack);
        System.out.println("Binary : ");
        for (int i=0;i<myStack.size();i++){
            System.out.print(myStack.get(i));
        }

    }

    public static Object convertToBinary(int number, MyGenericStack<Integer> myStack) {
        if (number == 0) {
            myStack.push(0);
            return myStack;
        }
        while (number > 0) {
            myStack.push(number % 2);
            number = number / 2;
        }
        return myStack;
    }

}
