package tests.casting;

class ReturnTypeParent { }
class ReturnTypeChild extends ReturnTypeParent { }
class ParentA {
    ReturnTypeParent get() { return null; }
}
class ChildA extends ParentA {
    ReturnTypeChild get() { return null; }
}
