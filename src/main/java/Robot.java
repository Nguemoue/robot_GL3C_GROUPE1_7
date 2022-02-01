public class Robot {
    private int vie;
    private String nom;

    /**
     * @param nom
     *  initialise un robot avec le nom $nom
     */
     Robot(String nom){
        if(nom.equals("")){
            System.out.println("vous devez entrez un nom valide");
            System.exit(1);
        }
        this.nom = nom;
        this.vie = 10;
    }


    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public  boolean fire(Robot r){
        if(!r.isDead() && r.getVie() >=2){
            r.setVie(r.getVie() - 2);
            return true;
        } else
            r.setVie(0);

        return  false;
    }
    public boolean isDead(){
        return this.getVie() == 0;
    }

    @Override
    public String toString(){
        return  "Robot "+this.getNom();
    }
}
