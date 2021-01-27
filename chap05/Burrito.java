public class Burrito {

    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        System.out.print("This burrito is");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all.");
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
            case HOT:
            case FLAMING:
            default:
                System.out.println("may be too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT);
        Burrito green = new Burrito(Spiciness.MEDIUM);
        Burrito jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        green.describe();
        jalapeno.describe();
    }
}/*
  * Output: This burrito is not spicy at all. This burrito is a little hot. This
  * burrito is maybe too hot.
  */