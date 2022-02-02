import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    Robot D2R2  = new Robot("D2R2"), Data = new Robot("Data");

        //teste que les ,methodes toString renvoi la chaine de caractere attendu
        @org.junit.jupiter.api.Test
         void TestName(){
            assertEquals(D2R2.toString(),"Robot D2R2");
            assertEquals(Data.toString(),"Robot Data");
         }

         //teste le combat d'un robot et d'un deuxiemme robot
        @org.junit.jupiter.api.Test
        void TestFight(){
            D2R2.fire(Data);
            Robot gagnant = Arena.fight(D2R2,Data);
            assertEquals(D2R2,gagnant);
        }

        // teste qu'il est impossible de tirer sur un robot mort
        @org.junit.jupiter.api.Test
        void TestDeadFire(){
            Data.setVie(0);
            assertFalse(D2R2.fire(Data));

        }
        //teste le tir d'un roobot sur un autre
        @org.junit.jupiter.api.Test
        void TestFire(){
            //je reinitialise les points de vie des differents robots
            D2R2.setVie(10);
            Data.setVie(10);
            //j'effectue un tir sur Data
            D2R2.fire(Data);
            assertNotEquals(Data.getVie(),D2R2.getVie());
        }
        


}