package taskStar;

public class TaskStar {
    public static void build() {

        CustomArrayList<Integer> l = new CustomArrayList<>(4);
        System.out.println(l.find(7));
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.print();
        l.add(5);
        l.add(6);
        l.add(5);
        System.out.println("-> " + l.get(3));
        l.add(6);
        l.print();
        l.add(7);
        l.add(8);
        l.print();
        System.out.println(l.find(7));
        l.clear();
        l.print();
        System.out.println(l.find(7));
        System.out.println(l.get(123));

        CustomArrayList<Integer> l2 = new CustomArrayList<>(3);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.print();
        l2.remove(0);
        l2.print();
        l2.add(4);
        l2.print();

        l2.remove(1);
        l2.print();
        l2.add(5);
        l2.print();

        l2.remove(2);
        l2.print();
        l2.add(6);
        l2.print();

    }
}
