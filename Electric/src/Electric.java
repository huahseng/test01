import java.text.DecimalFormat;
import java.util.Scanner;

public class Electric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//С��ҽ����յ���һ�ݵ��֪ͨ����С�񿴵�����д�������۵�[2006]27�Ź涨��
//		���õ�����150ǧ��ʱ�����²��ְ�ÿǧ��ʱ0.4463Ԫִ�У�
//		���õ�����151~400ǧ��ʱ�Ĳ��ְ�ÿǧ��ʱ0.4663Ԫִ�У�
//		���õ�����401ǧ��ʱ�����ϲ��ְ�ÿǧ��ʱ0.5663Ԫִ��;
//		С�����Լ���֤һ�£����֪ͨ����Ӧ����ѵ���Ŀ�����Ƿ���ȷ�ء����дһ��������֪�õ��ܼƣ����ݵ�۹涨�������Ӧ���ĵ��Ӧ���Ƕ��١�
//		���������ʽ
//		�����ʽ��
//		����һ����������ʾ�õ��ܼƣ���λ��ǧ��ʱ�ƣ���������10000��
//		�����ʽ��
//		���һ������������С�����1λ����λ��Ԫ�ƣ�������С�����1λ����
//		�����������
//		��������#1�� 
//		267
//		�������#1�� 
//		121.5
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("���������õĵ�����");
		int power=input.nextInt();
		float money;
		DecimalFormat xx=new DecimalFormat("#.#");
		
		if(power<=10000 && power>=0) {
			if(power<=150) {
				money=(float) (power*0.4463);
				System.out.println("�����õ磺"+power+"ǧ��\n"+"���Ϊ��"+xx.format(money));
			}else if(power<=400) {
				money=(float) (66.945+(power-150)*0.4663);
				System.out.println("�����õ磺"+power+"ǧ��\n"+"���Ϊ��"+xx.format(money));
			}else if(power>400) {
				money=(float) (183.52+(power-400)*0.5663);
				System.out.println("�����õ磺"+power+"ǧ��\n"+"���Ϊ��"+String.format("%.1f", money));
				
			}
			
		}else {
			System.out.println("��������ȷ�ĵ���������");
		}
	}

}
