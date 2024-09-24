
class OuterClass {

    int x = 10;

    //---inner class definition
    class InnerClass {

        int y = 5;
    }
    //---
}
//------------------------------------------------------------------

public class Nested {

    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
