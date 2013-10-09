package p15invokeLater;

/**
 * @author nik
 */
public abstract class Idleness {
    public void doIt() {
        //call this later on Event Dispatch Thread using SwingUtilities.invokeLater
        doItNow();
    }

    protected abstract void doItNow();
}