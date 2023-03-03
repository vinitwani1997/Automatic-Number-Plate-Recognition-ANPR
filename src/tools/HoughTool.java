
package tools;

import java.io.IOException;
import javaanpr.imageanalysis.HoughTransformation;
import javaanpr.imageanalysis.Photo;

public class HoughTool {
    
    public static void main(String[] args) throws IOException {
        Photo p = new Photo(args[0]);
        HoughTransformation hough = p.getHoughTransformation();
        new Photo(hough.render(HoughTransformation.RENDER_TRANSFORMONLY, 
                               HoughTransformation.COLOR_HUE)
                 ).saveImage(args[1]);
    }
    
    public HoughTool() {
    }
    
}
