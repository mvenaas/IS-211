/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sailscore;


/**
 *
 * @author even
 */
public class Regatta {

    // oppgave 1
    public Regatta() {
    }


    public void addCompetitor(Boat c) {
        // oppgave 1
    }


    public Boat getCompetitor(int sailno) {
        // oppgave 1
        return null;
    }


    public Collection<Boat> getCompetitors() {
        // oppgave 1
        return null;
    }


    public void prepareNewRace() {
        // oppgave 2
    }


    public void registerFinish(int sailno) {
        // oppgave 2
    }


    // oppgave 2
    public void endRace() {
    }


    public void printResults() {
        // oppgave 3
    }


    /**
     * Skriver ut resultattabellen fra oppgaven
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Regatta nm = new Regatta();

        nm.addCompetitor(new Boat(42, "Dagros"));
        nm.addCompetitor(new Boat(314, "Pi"));
        nm.addCompetitor(new Boat(13, "Uflaks"));
        nm.addCompetitor(new Boat(999, "Sinka"));

        nm.prepareNewRace();
        nm.registerFinish(314);
        nm.registerFinish(999);
        nm.registerFinish(13);
        nm.registerFinish(42);
        nm.endRace();
        nm.printResults();

        nm.prepareNewRace();
        nm.registerFinish(999);
        nm.registerFinish(314);
        nm.registerFinish(13);
        nm.registerFinish(42);
        nm.endRace();
        nm.printResults();

        nm.prepareNewRace();
        nm.registerFinish(999);
        nm.registerFinish(314);
        nm.registerFinish(42);
        nm.registerFinish(13);
        nm.endRace();
        nm.printResults();

        nm.prepareNewRace();
        nm.registerFinish(314);
        nm.registerFinish(42);
        nm.registerFinish(999);
        nm.registerFinish(13);
        nm.endRace();
        nm.printResults();

        nm.prepareNewRace();
        nm.registerFinish(13);
        nm.registerFinish(999);
        nm.registerFinish(42);
        nm.registerFinish(314);
        nm.endRace();
        nm.printResults();
    }
}
