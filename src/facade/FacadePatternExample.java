/* Codigo tomado de:
 Sarcar, V. (2019). Java Design Patterns: A Hands-On Experience with Real-World Examples (2.a ed.).
 Recuperado de https://www.apress.com/gp/book/9781484240779
 Client code
 FacadePatternExample.java
*/
package facade;

public class FacadePatternExample {
	 public static void main(String[] args) { 
		 System.out.println("***Facade Pattern Demo***\n");
		 //Creating Robots 
		 RobotFacade RobotFacade = new RobotFacade();
		 RobotFacade.constructRobot();
		 RobotFacade robonautRobotFacade = new RobotFacade();
		 robonautRobotFacade.constructRobonautRobot();
		 //Destroying robots
		 RobotFacade.destroyRobot();
		 robonautRobotFacade.destroyRobonautRobot();
		 
	 }
	

}
