public class Radical {
    int perfectSquare;
    int radical;
    int number;

    public Radical (int number) {
        this.number = number;
    }

    public void simplify() {
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            double quotient = (number) / (double) Math.pow(i, 2);
            if (number == Math.pow(i, 2) * (number / (int) Math.pow(i,2))) {
                perfectSquare = i;
                radical = (int) quotient;
            }
        }
        if (perfectSquare == 1) {
            System.out.println("Radical is fully simplified");
        } else {
            System.out.println(perfectSquare + "radical(" + radical + ")");
        }
    }

    public void evaluate() {
        System.out.println(Math.sqrt(number));
    }
}

