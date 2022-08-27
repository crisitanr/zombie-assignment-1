public class dog extends Animal implements Animal1 {
    public dog(String name, String breed) {
        super(name, breed);
    }
    @Override
    public String makeSound() {
        return "meow";
    }

    @Override
    public String whatAmi() {
        return "cat";
    }


}
