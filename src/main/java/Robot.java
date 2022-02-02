public class Robot {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
    
    public  boolean fire(Robot r){
        if(!r.isDead() && r.getVie() >=2){
            r.setVie(r.getVie() - 2);
            return true;
        } else
            r.setVie(0);

        return  false;
    }
    
=======
>>>>>>> e5ce7db86144bac841e18667534799101926e2ed
>>>>>>> 2c02aca895390b7511cb01ba1ca64cc2e81b7d08
    private int vie;
    private String nom;

    /**
<<<<<<< HEAD
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
=======
     * @param nom
     *  initialise un robot avec le nom $nom
     */
<<<<<<< HEAD


    public boolean isDead(){
        return this.getVie() == 0;
    }

=======

    public String toString(){
        return  "Robot "+this.getNom();
    }
>>>>>>> e5ba4ebc9f73e6ecb8f7fa8916bffe4f423d869e
>>>>>>> e5ce7db86144bac841e18667534799101926e2ed
}
>>>>>>> 2c02aca895390b7511cb01ba1ca64cc2e81b7d08
