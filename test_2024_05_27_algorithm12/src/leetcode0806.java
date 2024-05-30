import java.util.List;
/**
 * stackover内存泄漏->超内存
 */
public class leetcode0806 {
	public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
		//将A中的盘子通过B，移动到C
		/**
		 * 将n-1个盘子移动到B
		 * 将第n个盘子移动到C
		 * 将n-1个盘子移动到C
		 */
		if (A.size() == 1) {
			C.add(A.remove(0));
			return;
		}
		Integer remove = A.remove(0);
		hanota(A, C, B);
		C.add(remove);
		hanota(B, A, C);
		
    }
	
}
