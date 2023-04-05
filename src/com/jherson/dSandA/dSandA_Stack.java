package com.jherson.dSandA;

public class dSandA_Stack {

    public static void main(String[] args){

        java.util.Stack<String> stack = new java.util.Stack<String>();



        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack.search("Borderlands"));
        System.out.println(stack.peek());
        String myFaveGame = stack.pop(); // FFVII

        stack.pop(); // [Minecraft, Skyrim, Doom, Borderlands]
        stack.pop(); // [Minecraft, Skyrim, Doom]

        System.out.println(stack.empty()); // true
        System.out.println(stack); // [Minecraft, Skyrim, Doom, Borderlands, FFVII]
        System.out.println(myFaveGame);


    }
}
