package com.heima.lisi;

public class RectangleDemo {
    public static void resize(Rectangle rectangle) {

        while (rectangle.getWidth() <= rectangle.getLength()) {

            rectangle.setWidth(rectangle.getWidth() + 1);

        }

    }

    public static void printLengthAndWidth(Rectangle rectangle) {

        System.out.println(rectangle.getLength());

        System.out.println(rectangle.getWidth());

    }


    public static void main(String[] args) {
         Rectangle rectangle = new Rectangle();
         rectangle.setLength(20);
         rectangle.setWidth(10);
         resize(rectangle);
         printLengthAndWidth(rectangle);


         System.out.println("============");

         Rectangle rectangle1 = new Square();
         rectangle1.setLength(10);
         resize(rectangle1);
         printLengthAndWidth(rectangle1);


    }
}


