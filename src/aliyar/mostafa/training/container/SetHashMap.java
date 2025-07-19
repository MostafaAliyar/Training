package aliyar.mostafa.training.container;

import java.util.*;

public class SetHashMap {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //hashSetForCars();
    Map<Integer,Student> hashMapStudent = new HashMap<>();
    System.out.println("Enter the size of the set");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        int key = 100+i;
        System.out.println("Enter the student name for "+key+" ");
        String name = sc.next();
        System.out.println("Enter the student score for "+name+" ");
        int score = sc.nextInt();
        Student student = new Student(name,score);
        hashMapStudent.put(key,student);
    }
    Map<Integer,Integer> mapScore = new HashMap<>();
    Iterator<Integer> iterator = hashMapStudent.keySet().iterator();
    while (iterator.hasNext()) {
        int key = iterator.next();
        Student student = hashMapStudent.get(key);
        if (mapScore.containsKey(student.getScore())) {
            mapScore.put(student.getScore(), mapScore.get(student.getScore()) + 1);
        } else {
            mapScore.put(student.getScore(), 1);
        }
    }
    for(Integer key : mapScore.keySet()){
        System.out.println("Score : "+key+"   number :"+mapScore.get(key));
    }
    }
    static class Student{
        String name;
        int score;
        Student(String name,int score){
            this.name = name;
            this.score = score;
        }
        public String getName() {
            return name;
        }
        public int getScore() {
            return score;
        }
    }










    private static void hashSetForCars() {
        Set<Car> cars = new HashSet<Car>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Car Name: ");
            String name = sc.next();
            System.out.print("Enter Car Speed: ");
            int speed = sc.nextInt();
            Car car = new Car(name, speed);
            if (cars.contains(car)) {
                System.out.println("Car already! Car is new update");
                cars.remove(car);
                cars.add(car);
            }else {
                cars.add(car);
            }

        }
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    static class Car {
        String name;
        int Speed;
        public Car(String name) {
            this.name = name;
        }
        public Car(String name, int speed) {
            this.name = name;
            Speed = speed;
        }
        public String getName() {
            return name;
        }
        public int getSpeed() {
            return Speed;
        }

        public void setSpeed(int speed) {
            Speed = speed;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Car car = (Car) object;
            return Objects.equals(name, car.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", Speed=" + Speed +
                    '}';
        }
    }
}
