package leetcodeproblems

class MinimumCostToConnectStick {
  /***
   * In order to decorate your new house, you need to process some sticks with positive integer length.
   * You can connect any two sticks of lengths X and Y into one stick by paying a cost of X + Y. Due to the construction needs, you must connect all the bars into one.
   * Return the minimum cost of connecting all the given sticks into one stick in this way.
   * Please note that you can choose any order of sticks connection
   * Example
   * Example 1:
   * Input:
   * [2,4,3]
   * Output:
   * 14
   * Explanation:
   * First connect 2 and 3 to 5 and cost 5; then connect 5 and 4 to 9; total cost is 14
   * Example 2:
   * Input: [1,8,3,5]
   * Output: 30
   */

  def MinimumCost(sticks: List[Int]) : Int = {
    // write your code here
      sticks.sorted.foldLeft(List.empty[Int])((a,b) => {
        if(a.isEmpty)
          a :+ b
        else a :+ (a.last + b)
      }).drop(1).sum
  }
}
