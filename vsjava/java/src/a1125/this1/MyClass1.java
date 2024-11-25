package a1125.this1;

public class MyClass1 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);//생성자
        obj1.myMethod();
        MyClass obj2 = new MyClass(); //다른 생성자 호출
        obj2.myMethod(); //매서드 호출
    }
}

class MyClass{
    int myVariable;

    public MyClass(int myVariable) {
        //여기서 말하는 this는 해당 객체를 가리킵니다.
        this.myVariable = myVariable;
    }
    public MyClass(){
        //여기서 this()는 다른생성자 호출
        this(0);
    }
    public void myMethod(){
        //여기서 this는 해당 객체를 가리킵니다.
        System.out.println("My variable value is " + this.myVariable);
    }

}

//'this' 와 'this()' 는 각각 객체의 참조와 생성자 호출로 다르다.
// this.myVariable 객체의 필드를 가리키고 있으며
// this()는 다른 생성자를 호출하는데 사용한다. 

