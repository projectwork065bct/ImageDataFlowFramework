/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageLayer;

/**
 *
 * @author power
 */
public interface FRS_Image_Interface {
    
    //setting the image
    public void setImage(java.awt.image.BufferedImage image);
    
    public void setFaceRectangle(java.awt.Rectangle faceRectangle);
    public void setFeaturePoint(FacePoints.FeaturePoint FeaturePointPointer, java.awt.Point point);
    public void setFeaturePoint(java.awt.Point[] featurePointArray);
    
    public java.awt.image.BufferedImage getOriginalImage();//return originalImage
    public java.awt.image.BufferedImage getFaceImage();//subImage within faceRectangle
    public java.awt.image.BufferedImage getFaceImageARGB();//with in face rectangle
}
