package com.tns.inheritance2;


public class MultiDemo {
    public static void main(String[] args) {
        Robin robin = new Robin();
        robin.fly();   // Inherited from Bird class
        robin.chirp(); // Inherited from Sparrow class
        robin.sing();  // Specific to Robin class
    }
}