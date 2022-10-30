public class AStarNodeWrapper<N extends Comparable<N>>
    implements Comparable<AStarNodeWrapper<N>> {
  private final N node;
  private AStarNodeWrapper<N> predecessor;
  private double totalCostFromStart;
  private final double minimumRemainingCostToTarget;
  private double costSum;

  public AStarNodeWrapper(
      N node,
      AStarNodeWrapper<N> predecessor,
      double totalCostFromStart,
      double minimumRemainingCostToTarget) {
    this.node = node;
    this.predecessor = predecessor;
    this.totalCostFromStart = totalCostFromStart;
    this.minimumRemainingCostToTarget = minimumRemainingCostToTarget;
    calculateCostSum();
  }

  private void calculateCostSum() {
    this.costSum = this.totalCostFromStart + this.minimumRemainingCostToTarget;
  }

  // getter for node
  // getters and setters for predecessor

  public void setTotalCostFromStart(double totalCostFromStart) {
    this.totalCostFromStart = totalCostFromStart;
    calculateCostSum();
  }

  // getter for totalCostFromStart

  @Override
  public int compareTo(AStarNodeWrapper<N> o) {
    int compare = Double.compare(this.costSum, o.costSum);
    if (compare == 0) {
      compare = node.compareTo(o.node);
    }
    return compare;
  }

  
  // equals(), hashCode()