
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.PortConstants;

public class ArmSubsystem extends SubsystemBase {

    //declare motor variables
    private final CANSparkMax motorOne;
    private final CANSparkMax motorTwo;

    // arm subsystem
	public ArmSubsystem() {

        //actually initialize them
        this.motorOne = new CANSparkMax(PortConstants.ARM_MOTOR_ONE_PORT, MotorType.kBrushless);
        this.motorTwo = new CANSparkMax(PortConstants.ARM_MOTOR_TWO_PORT, MotorType.kBrushless);

    }

    //set speed of motor 1
    public void motorOneSpeed(double speed){
        this.motorOne.set(speed);
    }

    //set speed of motor 2
    public void motorTwoSpeed(double speed){
        this.motorOne.set(speed);
    }

    //set speed of both (independently)
    public void bothMotorSpeed(double speed1, double speed2){
        this.motorOne.set(speed1);
        this.motorTwo.set(speed2);
    }

    //stop both
    public void stopBothMotors(){
        this.bothMotorSpeed(0.0, 0.0);
    }


	@Override
	public void periodic() {
		// This method will be called once per scheduler run
	}

	@Override
	public void simulationPeriodic() {
		// This method will be called once per scheduler run during simulation
	}
}
