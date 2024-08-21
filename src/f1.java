import java.util.Scanner;

class Fan {
    private String model;
    private int price;

    public Fan(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class f1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String model, cheap_model = null;
        int price, min_price = 0;
        Fan[] f = new Fan[3];

        for(int i=0; i<3; i++) {
            model = scanner.next();
            price = scanner.nextInt();
            f[i] = new Fan(model, price);
        }

        for (int i=0; i<3; i++) {
            price = f[i].getPrice();
            if (min_price == 0) {
                min_price = price;
                cheap_model = f[i].getModel();
            }
            else
                if (min_price > price) {
                    min_price = price;
                    cheap_model = f[i].getModel();
                }
        }

        System.out.println(cheap_model);

        scanner.close();
    }    
}
