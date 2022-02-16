package object;
/*
 * Ŭ������ : Sales
 * -item :  String
 * -qty : int
 * cost : int
 * +setter
 * +getter
 * +toString() : String <-- ��� ����
 * +getPrice : int <--���� * �ܰ� �� ���
 * 
 * ǰ�� : apple  <--toString�� �̿��Ͽ� main()���� ���
 * ���� : 5
 * �ܰ� : 1200��
 * �ݾ� : 6000��
 *
 * apple 1200�� ¥���� 5�� �����Ϸ��� 6000�� �ʿ��� <-- getter�� �̿��Ͽ� main()���� ���
 */


public class ObjectEx5 {

	public static void main(String[] args) {
		Sales sa = new Sales();
		
		sa.setItem("apple");
		sa.setQty(5);
		sa.setCost(1200);
		 
		System.out.println(sa.toString()); //toString ��������
		System.out.printf("%s %d�� ¥�� %d�� �����Ϸ��� %d���� �ʿ���.",
						sa.getItem(),sa.getCost(),sa.getQty(),sa.getPrice());
		
	}

}
