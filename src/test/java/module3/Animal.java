package module3;

public class Animal {

    String name;

    public void eta(String food) {
        System.out.println(name + "just ate some " + food);
    }
    public void eat(String food, int portions){
        System.out.println(name + " ate " + portions +
                "portions of" +food);

    }
}
