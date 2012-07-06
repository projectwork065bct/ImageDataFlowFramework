/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContainer;

import ImageLayer.FacePoints;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author power
 */
public interface GuiDataConnector_interface {
    /*
     * This interface contains the declaration of all possible
     * methods the gui needs to manipulate the data through the
     * GuiDataConnector class
     */
    //ImageIdentifier
    public static  enum ImageIdentifier {SOURCE_IMAGE,TERGET_IMAGE,RESULT_IMAGE};
    
    public void setImage(ImageIdentifier imageIdentifier,BufferedImage image);
    public void setImage(ImageIdentifier imageIdentifier,String path);
    
    public BufferedImage getImage(ImageIdentifier imageIdentifier);
    
    public void setFeaturePoint(ImageIdentifier id, FacePoints.FeaturePoint featurePointId, Point point);
    public void setFeaturePoint(ImageIdentifier id, FacePoints.FeaturePoint featurePointId, Point[] points);
    public void setFaceRectangle(ImageIdentifier id,Rectangle rectangle);
}
