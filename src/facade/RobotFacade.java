
// RobotFacade.java 
package facade;

public class RobotFacade {
	
	 RobotColor rColor; 
	 RobotHands rHands ;  
	 RobotBody rBody;   
	 public RobotFacade() 
	 {
		 rColor = new RobotColor();
		 rHands = new RobotHands();
		 rBody = new RobotBody();
		 
	 }
	 //Constructing a Robot
	 public void constructRobot()
	 { 
		 RobotBody.createRobot();
		 System.out.println("Creation of a Robot Start.");
		 rColor.setDefaultColor();
		 rHands.setHands();
		 rBody.createHands();
		 rBody.createRemainingParts();
		 System.out.println(" Robot Creation End.");
		 System.out.println();
	 }

	//Constructing a Robonaut Robot 
	 public void constructRobonautRobot()
	 {
		 RobotBody.createRobot();
		 System.out.println("Initiating the creational process of a Robonaut Robot.");
		 rColor.setGreenColor();
		 rHands.setRobonautHands();
		 rBody.createHands();
		 rBody.createRemainingParts();
		 System.out.println("A Robonaut Robot is created.");
		 System.out.println();
	 }
	 
	 //Destroying a Robot
	 public void destroyRobot()
	 { 
		 RobotBody.destroyRobot();
		 System.out.println(" Robot's destruction process is started.");
		 rHands.resetHands();
		 rBody.destroyHands();
		 rBody.destroyRemainingParts();
		 System.out.println(" Robot's destruction process is over.");
		 System.out.println(); 
	 }
	 
	 //Destroying a Robonaut Robot 
	 public void destroyRobonautRobot()
	 {
		 RobotBody.destroyRobot();
		 System.out.println(" Initiating a Robonaut Robot's destruction process.");
		 rHands.resetRobonautHands();
		 rBody.destroyHands();
		 rBody.destroyRemainingParts();
		 System.out.println(" A Robonaut Robot is destroyed.");
		 System.out.println();

	 }
	 
	 
	 
}
