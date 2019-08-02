import java.text.DecimalFormat;
import java.util.Scanner;

public class Electric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//小玉家今天收到了一份电费通知单。小玉看到上面写：据闽价电[2006]27号规定，
//		月用电量在150千瓦时及以下部分按每千瓦时0.4463元执行，
//		月用电量在151~400千瓦时的部分按每千瓦时0.4663元执行，
//		月用电量在401千瓦时及以上部分按每千瓦时0.5663元执行;
//		小玉想自己验证一下，电费通知单上应交电费的数目到底是否正确呢。请编写一个程序，已知用电总计，根据电价规定，计算出应交的电费应该是多少。
//		输入输出格式
//		输入格式：
//		输入一个整数，表示用电总计（单位以千瓦时计），不超过10000。
//		输出格式：
//		输出一个数，保留到小数点后1位（单位以元计，保留到小数点后1位）。
//		输入输出样例
//		输入样例#1： 
//		267
//		输出样例#1： 
//		121.5
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入所用的电量：");
		int power=input.nextInt();
		float money;
		DecimalFormat xx=new DecimalFormat("#.#");
		
		if(power<=10000 && power>=0) {
			if(power<=150) {
				money=(float) (power*0.4463);
				System.out.println("本月用电："+power+"千瓦\n"+"电费为："+xx.format(money));
			}else if(power<=400) {
				money=(float) (66.945+(power-150)*0.4663);
				System.out.println("本月用电："+power+"千瓦\n"+"电费为："+xx.format(money));
			}else if(power>400) {
				money=(float) (183.52+(power-400)*0.5663);
				System.out.println("本月用电："+power+"千瓦\n"+"电费为："+String.format("%.1f", money));
				
			}
			
		}else {
			System.out.println("请输入正确的电量！！！");
		}
	}

}
