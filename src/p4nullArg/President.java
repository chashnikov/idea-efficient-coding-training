package p4nullArg;

/**
 * @author nik
 */
public abstract class President {
  private final President predecessor;

  protected President(President predecessor) {
    this.predecessor = predecessor;
  }

  public President getPredecessor() {
    return predecessor;
  }
}
