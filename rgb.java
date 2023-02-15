/**
 * rgb
 */
public class rgb {

    public static void main(String[] args) {

        //test for r=255, g=255, b=255 should retuen FFFFFF
        System.out.println(rgb(255, 255, 255));
    }

    public static String rgb(int r, int g, int b) {
        String hex;

        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
    
        String hexR = Integer.toHexString(r);
        String hexG = Integer.toHexString(g);
        String hexB = Integer.toHexString(b);
        if (hexR.length() == 1) {
            hexR = "0"+hexR;
        }
        if (hexG.length() == 1) {
            hexG = "0"+hexG;
        }
        if (hexB.length() == 1) {
            hexB = "0"+hexB;
        }

        hex = hexR+hexG+hexB;


        
        return hex.toUpperCase();
    }
}