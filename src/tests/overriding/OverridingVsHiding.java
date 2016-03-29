package tests.overriding;

public class OverridingVsHiding {

    public static void main(String[] args) {
        OverrideChild override = new OverrideChild();
        override.sayNameParent();
        override.sayNameChild();
        HidingChild hiding = new HidingChild();
        hiding.sayNameParent();
        hiding.sayNameChild();
    }

}

class OverrideParent {
    String getName() { return "OverrideParent"; }
    void sayNameParent() { System.out.println("My names is " + getName()); }
}

class OverrideChild extends OverrideParent {
    String getName() { return "OverrideChild"; }
    void sayNameChild() { System.out.println("My names is " + getName()); }
}

class HidingParent {
    static String getName() { return "OverrideParent"; }
    void sayNameParent() { System.out.println("My names is " + getName()); }
}

class HidingChild extends HidingParent {
    static String getName() { return "OverrideChild"; }
    void sayNameChild() { System.out.println("My names is " + getName()); }
}
