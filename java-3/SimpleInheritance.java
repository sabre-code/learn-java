
// program to inherit Class B from A

class A3{
    protected int a,b;
    public void setDataA(int i, int j){
        a = i;
        b = j;
    }

    public void getDataA(){
        System.out.println("this is from class A and the value of a and b is "+ a + " " + b);
    }
}

class B3 extends A3{
    protected int c;
    public void setData(int i,int j, int k){
        super.setDataA(i, j);
        c = k;
    }

    public void display(){
        System.out.println("The value of a nd b from inherited class A is " + a + " " + b + " and the value of c from class B is " + c);
    }
}



class SimpleInheritance {
    public static void main(String[] args) {
        A3 objA = new A3();
        B3 objB = new B3();
        //C objC = new C();
    
        objA.setDataA(5,4);
        objA.getDataA();

        objB.setData(5,4,6);
        objB.display();

        // objC.setData(5, 4, 9);
        // objC.display();

        
    }    
    
}