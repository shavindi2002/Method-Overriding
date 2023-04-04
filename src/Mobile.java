public class Mobile {
    public void displayName(){
        System.out.println("Smart mobile");
    }
}
class Samsung extends Mobile{
    public void displayName(){
        System.out.println("Samsung Galaxy Note 22 ULTRA");
        super.displayName();
    }
}
class Apple extends Samsung{
    public void displayName(){
        System.out.println("Iphone 14 Pro Max");
        super.displayName();
    }
}
class Run{
    public static void main(String[] args) {
        Samsung s = new Samsung();
        Apple a = new Apple();
        s.displayName();
        a.displayName();

    }
}