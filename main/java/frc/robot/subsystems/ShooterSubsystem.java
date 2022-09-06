package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.ShooterConstants.SHOOTER_OFF_SPEED;
import static frc.robot.Constants.ShooterConstants.SHOOTER_ON_SPEED;
import static frc.robot.Constants.ShooterConstants.SHOOTER_DRIVE_ID;

public class ShooterSubsystem extends SubsystemBase {
  

    private final TalonSRX shooterMotor = new TalonSRX(SHOOTER_DRIVE_ID);

  public ShooterSubsystem() {}
    
    public void setPosition(boolean run) {
        if (run){
            shooterMotor.set(TalonSRXControlMode.PercentOutput, SHOOTER_ON_SPEED);
        
        } else {
            shooterMotor.set(TalonSRXControlMode.PercentOutput, SHOOTER_OFF_SPEED);
        }
    }

}
