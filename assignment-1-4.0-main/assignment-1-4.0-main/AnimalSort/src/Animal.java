public class Animal implements Animal1 {
    private String name;
    private String breed;

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }

    @Override
    public String makeSound() {
        return "sound";
    }

    @Override
    public String whatAmi() {
        return "animal";
    }
    @Override
    public String toString() {
        return whatAmi() + " "+
                getName() + " "+
                getBreed()+ " "+
                makeSound();
    }


}
