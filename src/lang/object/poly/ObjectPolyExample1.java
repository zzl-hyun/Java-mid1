package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object obj = new Object();
        obj.toString();
        action(dog);
        action(car);
    }

    private static void action(Object obj){
//        obj.sound(); Object는 sound(), move()가 없음
//        obj.move();

        //객체에 맞는 다운캐스팅 필요
        if(obj instanceof Dog dog){
            dog.sound();
        }else if(obj instanceof Car car){
            car.move();
        }
    }
}
