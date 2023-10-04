public class Main1 {
    public static void main(String[] args) {
        AccessModifiersDemo show = new AccessModifiersDemo();
        System.out.println(show.getPrivateVar(34));
        System.out.println(show.getDefaultVar(4.3));
        System.out.println(show.getProtectedVar(true));
        System.out.println(show.getPublicVar("bool"));

        SubclassDemo show2 = new SubclassDemo();
        show2.displayProtectedVar();

    }
}
