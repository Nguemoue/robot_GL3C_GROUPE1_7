public class Robot {

    public  boolean fire(Robot r){
        if(!r.isDead() && r.getVie() >=2){
            r.setVie(r.getVie() - 2);
            return true;
        } else
            r.setVie(0);

        return  false;
    }
    private int vie;
    private String nom;

    /**
     * @param nom
     *  initialise un robot avec le nom $nom

     */


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
