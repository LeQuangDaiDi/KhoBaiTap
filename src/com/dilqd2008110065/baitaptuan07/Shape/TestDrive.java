public class TestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.Xoay();
        circle.PhatRaAmThanh();

       Square square = new Square();
        square.Xoay();
        square.PhatRaAmThanh();

        Triangle triangle = new Triangle();
        triangle.Xoay();
        triangle.PhatRaAmThanh();

       Amoeba amoeba = new Amoeba(7,8);
        amoeba.Xoay();
        amoeba.PhatRaAmThanh();

        
    }
}
