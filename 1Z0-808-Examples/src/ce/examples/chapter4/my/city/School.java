package ce.examples.chapter4.my.city;

import ce.examples.chapter4.my.school.ClassRoom;

/*
 * Tyto dvì tøídy ClassRoom a School jsou v rùzných balíècích, což znamená:
 * a) private int roomNumber se nezkompiluje
 * 	=> pøístup k promìnné pouze uvnitø classy ClassRoom
   b) defualtní static int globalKey=54321 (soukromý pøístup k balíèku) se nezkompiluje
    =>pouze pokud by classy byly ve stejném package
  c) nezkompiluje se protected String teacherName
    =>clazz School nedìdí z ClassRoom
 */

public class School {

	public static void main(String[] args) {
		System.out.println(ClassRoom.globalKey); 
		ClassRoom room = new ClassRoom(101, "Mrs. Anderson");//lez vytvoøit instanci, importoval se package
				System.out.println(room.roomNumber);
				System.out.println(room.floor); //pouze public instanèní promìnná se kompiluje
				System.out.println(room.teacherName); } 

	}


