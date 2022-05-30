package Homework2.Example;

public class Box {
    double width;
    double heigth;
    double depth;

    public static void main(String[] args) {

    }
    Box() {
        System.out.println("konstruqtriovani obyeqt Box");
        width = 10;
        heigth = 10;
        depth = 10;
    }

    double voliume() {
        return width * heigth * depth;
    }
}
