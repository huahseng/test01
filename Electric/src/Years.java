import java.util.Scanner;

public class Years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入年份、月份，判断这个月有多少天,闰年能被4整除，不能被100整除
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year=input.nextInt();
		System.out.println("请输入月份：");
		int month=input.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year+"年"+month+"月"+"有31天");
			break;
		case 4:
		case 6:
		case 9:			
		case 11:
			System.out.println(year+"年"+month+"月"+"有30天");
			break;
		case 2:
			//闰年的判断
			if((year%4==0 && year%100 !=0 )|| year%400==0) {
				System.out.println(year+"年"+month+"月"+"是闰年，有29天");
			}else {
				System.out.println(year+"年"+month+"月"+"不是闰年，有28天");
			}
			break;
		default:
			System.out.println("请输入正确的日期！！！");
			break;
		}
	}

}
