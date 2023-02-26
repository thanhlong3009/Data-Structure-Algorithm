package day_11_hashing;

import java.util.Objects;

public class MainTest {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1.equals(s2));
        // convert string to numbers
        // "hello"
        // "my name is A
        System.out.println(myHashString("lhfxcvcxbcxb"));
    }
    public static int myHashString(String s) {
        return s.length();
    }
    static class myObject{
        int val;
        myObject(int val){
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            myObject myObject = (myObject) o;
            return this.val == myObject.val;
        }

    }
}
