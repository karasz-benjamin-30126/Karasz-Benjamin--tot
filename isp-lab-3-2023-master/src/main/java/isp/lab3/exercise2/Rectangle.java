package isp.lab3.exercise2;

public class Rectangle {
    private int legth;
    private int width;
    private String colour;

    public Rectangle()
    {
        this.legth=2;
        this.width=1;
        this.colour="red";
    }
    public Rectangle(int length, int width)
    {
        this.legth=length;
        this.width=width;
    }
    public Rectangle(int length, int width, String colour)
    {
        this.legth=length;
        this.width=width;
        this.colour=colour;
    }

    public int getLength(){ return this.legth;};
    public int getWidth() {return this.width;};
    public String getColour() {return this.colour;};
    public int getPerimeter() {return 2*this.legth+2*this.width;};
    public int getArea() {return this.legth*this.width;};

    public static void main(String[] args)
    {
        Rectangle rectangle1= new Rectangle();
        Rectangle rectangle2= new Rectangle(2, 2, "blue");

        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getColour());
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());

    }




}
