

// *Annonomous class in java:
// 1. No name
// 2. Creaing object[class,Interface]
// 3.methods()
// =>only relate to one object which created


interface CallListener{
	public void actionEvent1();
	public void actionEvent2();
}  
class Xyz{  
 	public static void main(String[] args) {
 		CallListener o1 = new CallListener(){
 			public void actionEvent1(){
 				System.out.println("o1: actionEvent1");
 			}
 			public void actionEvent2(){
 				System.out.println("o1: actionEvent2");
 			}
 		};
 		CallListener o2 = new CallListener(){
 			public void actionEvent1(){
 				System.out.println("o2: actionEvent1");
 			}
 			public void actionEvent2(){
 				System.out.println("o2: actionEvent2");
 			}
 		};

 		o1.actionEvent1();
 		o1.actionEvent2();
 		o2.actionEvent1();
 		o2.actionEvent2();
 		
 	}
}
