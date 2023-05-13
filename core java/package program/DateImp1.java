package mypack;
import mypack.myDate;
import java.util.*;
public class DateImp1 implements myDate{
	public void showDate(){
		Date d = new Date();
		System.out.println(d);
	}

}

// import mypack.DateImp1;
// class DateA{
// 	public static void main(String args[]){
// 		DateImp1 obj1 = new DateImp1();
// 		obj1.showDate();
// 	}
// }