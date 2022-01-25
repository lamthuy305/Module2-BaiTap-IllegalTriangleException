package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        System.out.println("Hãy nhập z: ");
        int z = scanner.nextInt();
        Triangle triangle;

        try {
            triangle = new Triangle(x, y, z);
            System.out.printf("Diện tích: " + triangle.getArea() + ", chu vi " + triangle.getPerimeter());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

}
