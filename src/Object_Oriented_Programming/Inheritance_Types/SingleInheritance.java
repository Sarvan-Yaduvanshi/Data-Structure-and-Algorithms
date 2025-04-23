package Object_Oriented_Programming.Inheritance_Types;
// Java program to illustrate the
// concept of single inheritance
import java.io.*;
import java.lang.*;
import java.util.*;
public class SingleInheritance {
    public static void main(String[] args) {
        Two g = new Two();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
// Parent class
class One {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
class Two extends One {
    public void print_for() { System.out.println("for"); }
}


