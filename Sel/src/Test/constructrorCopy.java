package Test;

class Person {
    String name;
    int age;

    Person(String name) {
        this(name, 20); // Calls another constructor
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " "+age);
    }
    
    public static void main(String[] args) {
		Person p1=new Person("ABC");
	}
}


