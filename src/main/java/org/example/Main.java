package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        taskOne();
        System.out.println("\n");
        taskTwo();
    }


    public static void taskOne(){
        Dog sharik = new Dog("Шарик");

        sharik.run(501);
        sharik.swim(5);

        Cat barsik = new Cat("Барсик");

        barsik.run(115);
        barsik.swim(1);

        Bowl bowl = new Bowl(50);

        Cat notBarsik = new Cat("НеБарсик");
        Cat bigBarsik = new Cat("Большой Барсик(жесть)");

        barsik.eat(bowl, 10);
        bigBarsik.eat(bowl, 30);
        notBarsik.eat(bowl, 15);

        barsik.isFeed();
        bigBarsik.isFeed();
        notBarsik.isFeed();
    }

    public static void taskTwo(){
        Circle circle = new Circle(5, "none", "black");
        System.out.println("площадь круга " + circle.area());
        System.out.println("периметр " + circle.perimeter());
        System.out.println("цвет границ " + circle.getBorderColor());
        System.out.println("цвет заливки" + circle.getFillColor());

        System.out.println("\n");
        Triangle triangle = new Triangle("black", "yellow", 3, 2, 5, 2);
        System.out.println("площадь треугольника " + triangle.area());
        System.out.println("периметр " + triangle.perimeter());
        System.out.println("цвет границ " + triangle.getBorderColor());
        System.out.println("цвет заливки" + triangle.getFillColor());

        System.out.println("\n");
        Rectangle rectangle = new Rectangle("white", "white", 10, 10, 10);
        System.out.println("площадь круга " + rectangle.area());
        System.out.println("периметр " + rectangle.perimeter());
        System.out.println("цвет границ " + rectangle.getBorderColor());
        System.out.println("цвет заливки" + rectangle.getFillColor());
    }

}