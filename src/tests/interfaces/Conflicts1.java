package tests.interfaces;

interface InterfaceA { int sum(int... nums); }
interface InterfaceB { long sum(int... nums); }

interface InterfaceAB extends InterfaceA/*, InterfaceB*/ { }

abstract class AbstractClassAB implements InterfaceA/*, InterfaceB*/ {}

class ClassAB implements InterfaceA/*, InterfaceB*/ {
    public int sum(int... nums) { return 0; }
}