/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageLayer;

import ImageLayer.FacePoints.FeaturePoint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author power
 */
public class FRS_Image implements FRS_Image_Interface{
    
    String imagePath=null;
    BufferedImage originalImage=null;//originalImage
    FacePoints featurePoints=new FacePoints();//for the featurePoints
    java.awt.Rectangle faceRectangle=null;
    
    BufferedImage faceRegionOnly=null;//erect face according to eyes
    FaceMasks mask=new FaceMasks();//for Masks storage
    
    public void setImagePath(String path) {
        this.imagePath=path;
    }

    @Override
    public void setImage(BufferedImage image) {
        this.originalImage=image;
    }
    @Override
    public void setFaceRectangle(Rectangle faceRectangle) {
        this.faceRectangle=faceRectangle;
    }
    @Override
    public void setFeaturePoint(FeaturePoint FeaturePointPointer, Point point) {
        featurePoints.setFeaturePoint(FeaturePointPointer, point);
    }
    @Override
    public void setFeaturePoint(Point[] featurePointArray) {
        featurePoints.setFeaturePoint(featurePointArray);
    }
    @Override
    public BufferedImage getOriginalImage() {
        return this.originalImage;
    }
    @Override
    public BufferedImage getFaceImage() {
        //returns image clipped with faceRectangle
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public BufferedImage getFaceImageARGB() {
        //returns image clipped with faceRectangle
        //but filtering only the skin face region
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
