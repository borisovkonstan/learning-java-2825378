public class Triangle {
    double base;
    double height;
    double sideLeonOne;
    double sideLeonTwo;
    double sideLeonTree;

    public Triangle(double base, double height,
                    double sideLeonOne, double sideLeonTwo,
                    double sideLeonTree) {
        this.base = base;
        this.height = height;
        this.sideLeonOne = sideLeonOne;
        this.sideLeonTwo = sideLeonTwo;
        this.sideLeonTree = sideLeonTree;                
    }

    public double findArea() {
        return (this.base * this.height) / 2;
        
    }
}
