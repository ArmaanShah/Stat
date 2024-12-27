public class StatTest {
    public static void main(String[] args) {
        testDefaultConstructor();
        testArrayConstructor();
        testSetData();
        testMin();
        testMax();
        testAverage();
        testMode();
        testVariance();
        testStandardDeviation();
        testAppend();
        testToString();
        testIsEmpty();
    }

    public static void testDefaultConstructor() {
        Stat stat = new Stat();
        System.out.println("Default Constructor: " + stat.toString().equals("[]"));
    }

    public static void testArrayConstructor() {
        double[] data = {1.0, 2.0, 3.0};
        Stat stat = new Stat(data);
        System.out.println("Array Constructor: " + stat.toString().equals("[1.0, 2.0, 3.0]"));
    }

    public static void testSetData() {
        Stat stat = new Stat();
        double[] data = {4.0, 5.0};
        stat.setData(data);
        System.out.println("setData: " + stat.toString().equals("[4.0, 5.0]"));
    }

    public static void testMin() {
        double[] data = {3.0, 1.0, 2.0};
        Stat stat = new Stat(data);
        System.out.println("Min: " + (stat.min() == 1.0));
    }

    public static void testMax() {
        double[] data = {3.0, 1.0, 2.0};
        Stat stat = new Stat(data);
        System.out.println("Max: " + (stat.max() == 3.0));
    }

    public static void testAverage() {
        double[] data = {3.0, 1.0, 2.0};
        Stat stat = new Stat(data);
        System.out.println("Average: " + (stat.average() == 2.0));
    }

    public static void testMode() {
        double[] data = {1.0, 2.0, 2.0, 3.0};
        Stat stat = new Stat(data);
        System.out.println("Mode: " + (stat.mode() == 2.0));
    }

    public static void testVariance() {
        double[] data = {1.0, 2.0, 3.0};
        Stat stat = new Stat(data);
        System.out.println("Variance: " + (stat.variance() == 2.0 / 3.0));
    }

    public static void testStandardDeviation() {
        double[] data = {1.0, 2.0, 3.0};
        Stat stat = new Stat(data);
        System.out.println("Standard Deviation: " + (Math.abs(stat.standardDeviation() - Math.sqrt(2.0 / 3.0)) < 0.0001));
    }

    public static void testAppend() {
        double[] data = {1.0, 2.0};
        Stat stat = new Stat(data);
        int[] newData = {3, 4};
        stat.append(newData);
        System.out.println("Append: " + stat.toString().equals("[1.0, 2.0, 3.0, 4.0]"));
    }

    public static void testToString() {
        double[] data = {1.0, 2.0, 3.0};
        Stat stat = new Stat(data);
        System.out.println("toString: " + stat.toString().equals("[1.0, 2.0, 3.0]"));
    }

    public static void testIsEmpty() {
        Stat stat = new Stat();
        System.out.println("isEmpty: " + (stat.isEmpty() == true)); // Note: Adding parentheses for clarity
    }
}
