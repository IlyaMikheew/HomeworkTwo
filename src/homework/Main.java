package homework;

import homework.chapterfour.*;
import homework.chapterthree.Employee;
import homework.chapterthree.Measurable;
import homework.chaptertwo.Car;
import homework.chaptertwo.MyPoint;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------CHAPTER1---------------");

        System.out.println("--------------exercise1--------------");
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int a = in.nextInt();
        System.out.println("Integer: " + a);
        System.out.println("Binary: " + Integer.toBinaryString(a));
        System.out.println("hexadecimal: " + Integer.toHexString(a));
        System.out.println("octal: " + Integer.toOctalString(a));
        System.out.println("reciprocal: " + Double.toHexString(1.0/a));

        System.out.println("--------------exercise2--------------");
        System.out.print("Input an angle: ");
        int angle = in.nextInt();
        System.out.println("Normalized angle(with floorMod): " + Math.floorMod(angle, 360));
        System.out.println("Normalized angle(with %): " + (angle%360 + 360) % 360);

        System.out.println("--------------exercise3--------------");
        int a1, a2, a3;
        System.out.print("Input first int: ");
        a1 = in.nextInt();
        System.out.print("Input second int: ");
        a2 = in.nextInt();
        System.out.print("Input third int: ");
        a3 = in.nextInt();

        int max = a1;
        if(a2 > max)
            max = a2;
        if(a3 > max)
            max = a3;

        System.out.println("Max number: " + max);
        System.out.println("Max number: " + Math.max(a1, Math.max(a2, a3)));

        System.out.println("--------------exercise4--------------");
        System.out.println("Min value 1: " + Double.MIN_VALUE);
        System.out.println("Min value 2: " + Math.nextUp(0.0));
        System.out.println("Max value: " + Double.MAX_VALUE);
        System.out.println("Infinity: " + Math.nextUp(Double.MAX_VALUE));

        System.out.println("--------------exercise6--------------");
        System.out.println(factorial(1000));

        System.out.println("--------------exercise13--------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i < 50; i ++){
            numbers.add(i);
        }
        Random generator = new Random();
        int[] result = new int[6];
        for (int i = 0; i < 6; i ++ ){
            int randIndex = generator.nextInt(numbers.size()-1) + 1;
            result[i] = numbers.get(randIndex);
            numbers.remove(randIndex);
            //System.out.print(result[i] + " ");
        }
        Arrays.sort(result);
        System.out.print("Numbers: ");
        for (int i = 0; i < 6; i ++ ){
            System.out.print(result[i] + " ");
        }

        System.out.println("\n--------------CHAPTER2---------------");

        System.out.println("--------------exercise5--------------");
        MyPoint point = new MyPoint(3, 4).translate(1, 3).scale(0.5);
        System.out.println("Point(" + point.getX() + ',' + point.getY() + ')');

        System.out.println("--------------exercise9--------------");
        Car car = new Car(10);
        car.addFuel(5);
        System.out.println("Car on start: " + car);
        car.drive(30);
        System.out.println("Car after 30 miles: " + car);
        car.drive(50);
        System.out.println("car after 30 + 50 miles: " + car);

        System.out.println("--------------CHAPTER3---------------");

        System.out.println("--------------exercise1--------------");
        Employee[] employees = {new Employee("Ivan", 100),
                                new Employee("Yana", 200),
                                new Employee("Sasha", 300)};
        System.out.println("Average salary: " + Measurable.average(employees));

        System.out.println("--------------exercise2--------------");
        System.out.println("Employee with max salary: " + ((Employee)Measurable.largest(employees)).getName());

        System.out.println("--------------CHAPTER4---------------");

        System.out.println("--------------exercise4--------------");
        Shape figure = new Circle(new Point(3,3), 2.5);
        figure.moveBy(5.5,5.5);
        System.out.println("Circle center = " + figure.getCenter());

        figure = new Rectangle(new Point(2,5), 4, 5);
        figure.moveBy(2, 3);
        System.out.println("Rectangle center = " + figure.getCenter());

        figure = new Line(new Point(2, 3), new Point(3, 3));
        System.out.println(figure.getCenter());
        figure.moveBy(2, 1);
        System.out.println("Line center = " + figure.getCenter());

        System.out.println("--------------exercise5--------------");
        Circle circle1 = new Circle(new Point(1, 2), 3);
        Circle circle2 = circle1.clone();
        circle1.moveBy(3 , 3);
        System.out.println(circle1);
        System.out.println(circle2);


    }

    public static BigInteger factorial(int a){
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= a; i ++ ){
            BigInteger iter = BigInteger.valueOf(i);
            result = result.multiply(iter);
        }
        return result;
    }

}

