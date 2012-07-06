/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContainer;

import ImageLayer.FRS_Image;

/**
 *
 * @author power
 */
public class Data_001 {
    /*
     * The image datas have the general methods of set and get
     * of BufferedImage as well as featurePoints
     */
    public static FRS_Image sourceImage=new FRS_Image();
    public static FRS_Image targetImage=new FRS_Image();
    public static FRS_Image resultImage=new FRS_Image();
    /*
     * General procedure is that
     * -user loads images //GUI Part
     * -declared featurepoints and face rectangle//gui to frs_image
     * -then press replace button   //gui calls the helper methods passes the image data
     * -system does its job automatically and then ask for users edit or conformation//gui
     * -user can manually edit some sections of the image//gui and then update the main images
     * -user press save option and the image is saved//
     */
    
}
