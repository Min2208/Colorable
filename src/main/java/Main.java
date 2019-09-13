public class Main {
    public static void main(String[] args) {
        Shape[] arr=new Shape[3];
        Rectangle rectangle =new Rectangle(15,20);
        Square square=new Square(5);
        Circle circle=new Circle(10);
        arr[0]=rectangle;
        arr[1]=square;
        arr[2]=circle;

        for (Shape shape: arr){
            if (shape instanceof Colorable){
                System.out.println(shape.getAria());
                square.howToColor();
                ((Colorable) shape).howToColor();
            }else {
                System.out.println(shape.getAria());
            }
        }
    }
}
