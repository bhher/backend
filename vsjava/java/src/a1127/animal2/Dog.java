package a1127.animal2;

class Dog extends Animal {
    
    public Dog(String name, int age) {
        super(name, age);
    }
    

    @Override
    void move() {
        System.out.println("이동방식 : 네발로 걷는다.");
        
    }

    @Override
    void sound() {
       System.out.println("소리 : 멍멍");  
    }
    
}    
