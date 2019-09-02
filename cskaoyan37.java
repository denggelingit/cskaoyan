package cskaoyan;

public class cskaoyan37 {
	@org.junit.Test
	public void countOff() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int[] num = new int[50];
		int n, loop, i, m, k;
		System.out.println("请输入这一圈人的数量:");
		n = in.nextInt();
		// 开始给这些人编号
		for (i = 0; i < n; i++) {
			num[i] = i + 1;
		}
		i = 0;// i用于计数,即让指针后移
		m = 0;// m记录退出圈子的人数
		k = 0;// k报数1,2,3
		while (m < n - 1)// 当退出的人数不大于总人数时，即留下的人数至少是一个人
		// 这句不能写成m<n,因为假设有8人，当退出了6人时，此时还是进行人数退出，即m++，
		// 这时是7<8，剩下的一个人自己喊1，2,3那么他也就退出了，将不会有输出
		{
			if (num[i] != 0)// 如果这个人的头上编号不是0就开始报数加1，这里采用的方法是报数为3的人头上编号重置为0
			{
				k++;
			}
			if (k == 3) {
				k = 0; // 报数清零，即下一个人从1开始报数
				num[i] = 0;// 将报数为3的人编号重置为0
				m++; // 退出人数加1
			}
			i++; // 指针后移
			if (i == n)// 这句很关键，如果到了队尾，就要使指针重新指向对头
			// 并且它只能放在i++后面，因为只有i++了才有可能i==n
			{
				i = 0;
			}
		}
		System.out.print("现在剩下的人是:");
		for (loop = 0; loop < n; loop++) {
			if (num[loop] != 0) {
				System.out.println(num[loop] + "号");
			}
		}
		in.close();
	}
}