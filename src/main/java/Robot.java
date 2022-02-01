public class Robot {
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
    private int vie;
    private String nom;

    /**
     * @param nom
     *  initialise un robot avec le nom $nom
     */

    public String toString(){
        return  "Robot "+this.getNom();
    }
>>>>>>> e5ba4ebc9f73e6ecb8f7fa8916bffe4f423d869e
}
