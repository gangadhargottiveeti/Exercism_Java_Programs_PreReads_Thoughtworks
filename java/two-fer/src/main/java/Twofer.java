public class Twofer {
    public String twofer(String name) {
        if(name == null){
            String result = "One for you, one for me.";
            return result;
        }else{
            String result = "One for "+name+", one for me.";
            return result;
        }
    }
}
