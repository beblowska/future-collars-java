package task45;

class Animal {
    private String name;

    public Animal (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }
}