package com.other;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.util.Stack;

public class FindAllElementsGreaterThanTheirRightStack {

    public static  void find(int[]arr){
        if(arr==null||arr.length==0) return;//base case
        Stack<Integer> stack = new Stack<>(); // create an empty stack

        for(int value:arr){
            //pop all the elements that are the less than the current element
            while (!stack.isEmpty() && stack.peek() < value) {
                stack.pop();
            }
            stack.push(value);// push current element into the stack
        }
        while (!stack.isEmpty()){ //print all elements in the stack
            System.out.println(stack.pop()+"");
        }
    }

}
