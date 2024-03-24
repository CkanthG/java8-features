package org.ckanth.java.com.corejava;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ReverseThisString";
        ReverseString reverseStringObject = new ReverseString();
//        System.out.println(reverseStringObject.reverseString(str));
        reverseStringObject.reverseStringValue(str);
    }

    public String reverseString(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }

    public void reverseStringValue(String str) {
        System.out.print("Original String: "+ str + "\nAfter Reverse: ");
        String[] strArray = str.split("");
        for (int i=strArray.length-1; i>=0; i--) {
            System.out.print(strArray[i]);
        }
    }
}
