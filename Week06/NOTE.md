学习笔记

本周学习动态规划
复习递归的伪代码
java
public void recur(int level, int param) { 
  // terminator 递归的结束条件
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic   处理当前节点
  process(level, param); 
  // drill down 进入下一节点
  recur( level: level + 1, newParam);  
  // restore current status  处理返回
 
}

分治的伪代码
C/C++
int divide_conquer(Problem *problem, int params) {
  // recursion terminator
  if (problem == nullptr) {
    process_result
    return return_result;
  } 

  // process current problem
  subproblems = split_problem(problem, data)
  subresult1 = divide_conquer(subproblem[0], p1)
  subresult2 = divide_conquer(subproblem[1], p1)
  subresult3 = divide_conquer(subproblem[2], p1)
  ...

  // merge
  result = process_result(subresult1, subresult2, subresult3)
  // revert the current level status
 
  return 0;
}


定义：讲一个复杂的问题，将它分解为简单的子问题（用递归的方式）
关键点：
1.动态规划与递归或者分治没有本质上的区别(关键看有无最优的子结构)
2.共性：找到重复子问题
3.差异性：最优子结构，中途可淘汰次优解
