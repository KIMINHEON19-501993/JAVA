package month;

/*
 30 
April, June, September,November
4, 6, 9, 11

31 
January, March, May,
July, August, October,
December
1, 3, 5, 7, 8, 10, 12

28 February 2
 */
public class Months {
	public int getDays(int months) {
		
		int day = 0;
		
		switch(months) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: day = 30; break;
		case 4:
		case 6:
		case 9:
		case 11: day = 31; break;
		case 2: day = 28; break;
		}
		
		return day;
		
	}
}
