package java1_lab8;

public final class XPoLy {
    public static double sum(double...x){
        double result = 0.0;
        
        for(double a : x){
            result += a;
        }
        
        return result;
    }
    
    public static double min(double...x){
        double result = x[0];
        
        for(int i = 1; i < x.length; i++){
            if(x[i] < result){
                result = x[i];
            }
        }
        
        return result;
    }
    
    public static double max(double...x){
        double result = x[0];
        
        for(int i = 1; i < x.length; i++){
            if(x[i] > result){
                result = x[i];
            }
        }
        
        return result;
    }
    
    public static String toUpperFirstChar(String s){
        String[] words = s.split(" ");
        
        for(int i = 0; i < words.length; i++){
            char firstChar = words[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            words[i] = upperFirstChar + words[i].substring(1);
        }
        
        s = String.join(" ", words);
        return s;
    }
}