public class Robot {
<<<<<<< HEAD

=======
   private int vie;
    private String nom;

    
>>>>>>> 1dcdd2fda33ccf9d23c5677a1efda38513842d18
    public  boolean fire(Robot r){
        if(!r.isDead() && r.getVie() >=2){
            r.setVie(r.getVie() - 2);
            return true;
        } else
            r.setVie(0);

        return  false;
    }
<<<<<<< HEAD
    private int vie;
    private String nom;

=======
 
>>>>>>> 1dcdd2fda33ccf9d23c5677a1efda38513842d18
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
<<<<<<< HEAD

=======
>>>>>>> 1dcdd2fda33ccf9d23c5677a1efda38513842d18

    public boolean isDead(){
        return this.getVie() == 0;
    }


    public String toString(){
        return  "Robot "+this.getNom();
    }

}
