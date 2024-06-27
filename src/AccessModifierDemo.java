public class AccessModifierDemo {

   private int first;
   private int second;

    public int getFirst() {
        return this.first;
    }

    public int getSecond() {
        return this.second;
    }

    public AccessModifierDemo(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public AccessModifierDemo (int first)  {
        this.first = first;
    }

    public AccessModifierDemo() {

    }
}
