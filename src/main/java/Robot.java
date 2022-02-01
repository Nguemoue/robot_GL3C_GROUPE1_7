public class Robot {
    private int vie;
    private String nom;

    /**
     * @param nom
     *  initialise un robot avec le nom $nom
     */


    public boolean isDead(){
        return this.getVie() == 0;
    }

}
