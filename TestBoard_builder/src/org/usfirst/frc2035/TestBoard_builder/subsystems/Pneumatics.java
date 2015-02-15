// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2035.TestBoard_builder.subsystems;

import org.usfirst.frc2035.TestBoard_builder.RobotMap;
import org.usfirst.frc2035.TestBoard_builder.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Pneumatics extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Compressor compressor1 = RobotMap.pneumaticsCompressor1;
    DoubleSolenoid doubleSolenoid1 = RobotMap.pneumaticsDoubleSolenoid1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	doubleSolenoid1.set(DoubleSolenoid.Value.kOff);
    	compressor1.start();
		
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void forward() {
    	doubleSolenoid1.set(DoubleSolenoid.Value.kForward);
    }

    public void reverse() {
    	doubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
    }
}

