/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageLayer;

/**
 *
 * @author power
 */
public class FaceMasks {
    public static enum MaskCode {SKIN_COLOR_MASK,FACE_MASK, HAIR_MASK, ENVIRONMENT_MASK}
    
    int [][] skinMask=null;
    int [][] faceMask=null;
    int [][] hairMask=null;
    int [][] environmentMask=null;
    
    public void setMask(MaskCode code, int[][] mask){
        if(code==MaskCode.SKIN_COLOR_MASK){
            skinMask=mask;
        }else if(code==MaskCode.FACE_MASK){
            faceMask=mask;
        }else if(code==MaskCode.HAIR_MASK){
            hairMask=mask;
        }else if(code==MaskCode.ENVIRONMENT_MASK){
            environmentMask=mask;
        }
    }
    public int [][]getMask(MaskCode code){
        int[][] ans=null;
        if(code==MaskCode.SKIN_COLOR_MASK){
            ans=skinMask;
        }else if(code==MaskCode.FACE_MASK){
            ans=faceMask;
        }else if(code==MaskCode.HAIR_MASK){
            ans=hairMask;
        }if(code==MaskCode.ENVIRONMENT_MASK){
            ans=environmentMask;
        }
        return ans;
    }
    
}
