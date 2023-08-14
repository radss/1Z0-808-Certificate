package ce.examples.chapter4.my.city;

import ce.examples.chapter4.my.school.ClassRoom;

/*
 * Tyto dv� t��dy ClassRoom a School jsou v r�zn�ch bal��c�ch, co� znamen�:
 * a) private int roomNumber se nezkompiluje
 * 	=> p��stup k prom�nn� pouze uvnit� classy ClassRoom
   b) defualtn� static int globalKey=54321 (soukrom� p��stup k bal��ku) se nezkompiluje
    =>pouze pokud by classy byly ve stejn�m package
  c) nezkompiluje se protected String teacherName
    =>clazz School ned�d� z ClassRoom
 */

public class School {

	public static void main(String[] args) {
		System.out.println(ClassRoom.globalKey); 
		ClassRoom room = new ClassRoom(101, "Mrs. Anderson");//lez vytvo�it instanci, importoval se package
				System.out.println(room.roomNumber);
				System.out.println(room.floor); //pouze public instan�n� prom�nn� se kompiluje
				System.out.println(room.teacherName); } 

	}


