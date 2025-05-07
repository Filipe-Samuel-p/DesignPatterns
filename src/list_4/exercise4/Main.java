package list_4.exercise4;

public class Main {
    public static void main(String[] args) {
        Triangle originalTriangle = new Triangle(10, 20, "red");
        Triangle copiedTriangle = (Triangle) originalTriangle.clone();
        copiedTriangle.color = "blue";

        Ellipse originalEllipse = new Ellipse(5, 15, "green");
        Ellipse copiedEllipse = (Ellipse) originalEllipse.clone();
        copiedEllipse.x = 50;

        System.out.println(originalTriangle);
        System.out.println(copiedTriangle);
        System.out.println(originalEllipse);
        System.out.println(copiedEllipse);
    }
}
