public class cat extends Animal implements Animal1 {
    public cat(String name, String breed) {
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

