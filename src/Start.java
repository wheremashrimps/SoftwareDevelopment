public class Start {

    public static void main(String[] args) {
        War war = new War("War");

        // Run the game
        try {
            war.play();
            war.runGame();
        } catch (Exception e) {
            System.out.println("No Hand");
        }
        war.declareWinner();

    }

}
