/*Method Overriding demonstration through inheritance*/
class SuperClass1 {
    public void method1() {
        System.out.println("Method1 from Super class");
    }

    public void method2() {
        System.out.println("Method2 from Super class");
    }
}

class SubClass extends SuperClass1 {
    public void method2()
    {
        System.out.println("Method2 overrides method2 from Super Class");
    }
}

class MethodOverriding {
    public static void main(String[] arg){
        SuperClass1 objSuper=new SuperClass1();
        SubClass objSub=new SubClass();
        System.out.println("For object on Super Class : ");
        objSuper.method1();
        objSuper.method2();
        System.out.println("For object on Sub Class : ");
        objSub.method1();
        objSub.method2();
    }
}