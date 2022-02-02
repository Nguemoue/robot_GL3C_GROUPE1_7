public class Robot {
    private int vie;
    private String nom;

    /**
     * @param nom initialise un robot avec le nom $nom
     */
    Robot(String nom) {
        if (nom.equals("")) {
            System.out.println("vous devez entrez un nom valide");
            System.exit(1);
        }
        this.nom = nom;
        this.vie = 10;
    }
}