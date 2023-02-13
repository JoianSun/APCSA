public class Rectangle extends Object {
  // instance variables
  private double base;
  private double height;
  
  // constructor
  public Rectangle() {
    this.base = 1;
    this.height = 1;
  }
  
  public Rectangle(double bs, double ht) {
    if (bs > 0 && ht > 0) {
      this.base = bs;
      this.height = ht;
    } else {
      this.base = 1;
      this.height = 1;
    }
  }
  
  // methods
  public void setBase(double bs) {
    if (bs > 0) {
      this.base = bs;
    }
  }
  
  public void setHeight(double ht) {
    if (ht > 0) {
      this.height = ht;
    }
  }
  
  public double getBase() {
    return this.base;
  }
  
  public double getHeight() {
    return this.height;
  }
  
  public double getDiagonal() {
    return Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.height, 2));
  }
  
  public double getArea() {
    return this.base * this.height;
  }
  
  public double getPerimeter() {
    return 2 * (this.base + this.height);
  }
  
  public boolean equals(Rectangle other) {
    return (this.base == other.base && this.height == other.height);
  }
  
  public String toString() {
    return "rectangle with base " + this.base + ", height " + this.height;
  }
}
