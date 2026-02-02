 abstract class Calc {
    abstract int add(int a,int b);
    abstract int sub(int a,int b);
}

class Calculator extends Calc {
    int add(int a,int b){ return a+b; }
    int sub(int a,int b){ return a-b; }

    public static void main(String[] args){
        Calculator c=new Calculator();
        System.out.println(c.add(5,3));
        System.out.println(c.sub(5,3));
    }
}


