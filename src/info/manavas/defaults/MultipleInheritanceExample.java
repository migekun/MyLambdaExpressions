package info.manavas.defaults;

public class MultipleInheritanceExample implements InterfaceA, InterfaceB, InterfaceC {
    public static void main(String[] args) {
        MultipleInheritanceExample multipleInheritanceExample = new MultipleInheritanceExample();

        multipleInheritanceExample.sumA(4,8); //resolve to child
        multipleInheritanceExample.sumB(2,4);
        multipleInheritanceExample.sumC(4,6);

    }

    // how it resolve
    // 1. implemented class first
    // 2. sub interface that extend the interface
    // 3. the initial interface
    @Override
    public void sumA(int a, int b) {
        System.out.println("MultipleInheritanceExample.sumA = " + (a + b));
    }
}
