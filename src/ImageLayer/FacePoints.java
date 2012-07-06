/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageLayer;

import java.awt.Point;

/**
 *
 * @author power
 */
public class FacePoints {
    public static enum FeaturePoint {LEFT_EYE,RIGHT_EYE,LIP_CENTER,CHIN_EDGE,LEFT_CHIN_EDGE
                                    , RIGHT_CHIN_EDGE,LEFT_LIP_EDGE,RIGHT_LIP_EDGE};
    
    //PROPERTIES
    private Point[] points=new Point[10];
    
    //setters
    public void setFeaturePoint(FeaturePoint featurePointer, Point featurePoint){
        int i=getIndex(featurePointer);
        if(i>-1){
            points[i]=featurePoint;
        }
    }
    public void setFeaturePoint(Point []points){
        for(int i=0;i<points.length;i++){
            this.points[i]=points[i];
        }
    }
    
    //getters
    public Point getFeatrePoint(FeaturePoint pointer){
        return points[getIndex(pointer)];
    }
    public Point[] getFeaturePoints(){
        return points;
    }
    
    
    //helper methods
    private int getIndex(FeaturePoint featurePointer){
        int index=-1;
        if(featurePointer==FeaturePoint.LEFT_EYE){
            index=0;
        }else if(featurePointer==FeaturePoint.RIGHT_EYE){
            index=1;
        }else if(featurePointer==FeaturePoint.LIP_CENTER){
            index=2;
        }else if(featurePointer==FeaturePoint.CHIN_EDGE){
            index=3;
        }else if(featurePointer==FeaturePoint.LEFT_CHIN_EDGE){
            index=4;
        }else if(featurePointer==FeaturePoint.RIGHT_CHIN_EDGE){
            index=5;
        }else if(featurePointer==FeaturePoint.LEFT_LIP_EDGE){
            index=6;
        }else if(featurePointer==FeaturePoint.RIGHT_LIP_EDGE){
            index=7;
        }
        return index;
    }
}
