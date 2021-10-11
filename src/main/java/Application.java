public class Application {
    public static void main (String[] args) {
        System.out.println("Welcome to Bird Sanctuary");
        Crow crow = new Crow();
        crow.id = "C001";
        Duck duck = new Duck();
        duck.id = "D001";
        Ostrich ostrich = new Ostrich();
        ostrich.id = "OS001";
        Penguin penguin = new Penguin();
        penguin.id = "PN001";
        Parrot parrot = new Parrot();
        parrot.id = "P001";
        Ostrich ostrich2 = new Ostrich();
        ostrich2.id = "OS002";

        BirdRepository birdRepository = new BirdRepository();

        birdRepository.add(parrot);
        birdRepository.add(penguin);
        birdRepository.add(ostrich);
        birdRepository.add(duck);
        birdRepository.add(crow);
        birdRepository.add(ostrich2);

        UserInterface userInterface = new UserInterface();
        userInterface.print(birdRepository.get());

        birdRepository.remove(parrot);
        System.out.println("List after removing bird");
        userInterface.print(birdRepository.get());
    }
}