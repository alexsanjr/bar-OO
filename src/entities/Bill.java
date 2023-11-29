package entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double cover() {
        if (feeding() > 30) {
            return 0.0;
        } else {
            return 4.0;
        }
    }

    public double feeding() {
        return beer * 5.0 + softDrink * 3.0 + barbecue * 7.0;
    }

    public double ticket() {
        if (gender == 'M') {
            return 10.0;
        } else {
            return 8.0;
        }
    }

    public double total() {
        return ticket() + cover() + feeding();
    }

    @Override
    public String toString() {
        if (cover() == 0) {
            return "Consumo = R$ " + String.format("%.2f", feeding()) + "\n" +
                    "Isento de Couvert\n" +
                    "Ingresso = R$ " + String.format("%.2f",ticket()) + "\n\n" +
                    "Valor a pagar = R$ " + String.format("%.2f", total());
        } else {
            return "Consumo = R$ " + String.format("%.2f", feeding()) + "\n" +
                    "Couvert = R$ " + String.format("%.2f", cover()) + "\n" +
                    "Ingresso = R$ " + String.format("%.2f",ticket()) + "\n\n" +
                    "Valor a pagar = R$ " + String.format("%.2f", total());
        }

    }
}
