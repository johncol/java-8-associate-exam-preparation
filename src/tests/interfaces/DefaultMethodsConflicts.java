package tests.interfaces;

class DefaultMethodsConflictsA implements IA/*, IB*/ { }

class DefaultMethodsConflictsB implements IA, IB { public void hi() {} }

interface IA { default void hi() {} }
interface IB { default void hi() {} }
