package com.saintsrobotics.oedipal.bot.subsystems;

import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.camera.AxisCameraException;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.image.BinaryImage;
import edu.wpi.first.wpilibj.image.ColorImage;
import edu.wpi.first.wpilibj.image.CriteriaCollection;
import edu.wpi.first.wpilibj.image.NIVision;
import edu.wpi.first.wpilibj.image.NIVisionException;
import edu.wpi.first.wpilibj.image.ParticleAnalysisReport;

public class VisionSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    AxisCamera camera;
    CriteriaCollection cc;
    
    public void init() {
        camera = AxisCamera.getInstance();
        cc = new CriteriaCollection();
        cc.addCriteria(NIVision.MeasurementType.IMAQ_MT_AREA, 200, 65536, false);
    }
    
    public void getParticle() {
        try {
            ColorImage colorImage = camera.getImage();
            BinaryImage colorThreshold = colorImage.thresholdHSV(105, 137, 230, 255, 133, 183);
            BinaryImage particleFiltered = colorThreshold.particleFilter(cc);
            
            int numParticles = particleFiltered.getNumberParticles();
            
            for (int i=0;i<numParticles;i++) {
                ParticleAnalysisReport report = particleFiltered.getParticleAnalysisReport(i);
            }
        } catch (AxisCameraException e) {
            e.printStackTrace();
        } catch (NIVisionException e) {
            e.printStackTrace();
        }
    }
}

