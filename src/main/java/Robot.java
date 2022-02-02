public class Robot {
   private int vie;
    private String nom;

    
    public  boolean fire(Robot r){
        if(!r.isDead() && r.getVie() >=2){
            r.setVie(r.getVie() - 2);
            return true;
        } else
            r.setVie(0);

        return  false;
    }
 
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

     * @param nom
     *  initialise un robot avec le nom $nom
     */

    public boolean isDead(){
        return this.getVie() == 0;
    }


    public String toString(){
        return  "Robot "+this.getNom();
    }

}
