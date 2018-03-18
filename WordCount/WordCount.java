import java.util.HashMap;
import java.util.Map;


public class WordCount {

    private String input;

    WordCount(String input){
        this.input = input;
    }

    public String count(){
        Map<String, Integer> dic = new HashMap<String, Integer>();

        String[] words = this.input.split(" ");

        for( String word : words ){
            if( !dic.containsKey(word) ){
                dic.put(word, 1);
            }
            else{
                dic.put( word, dic.get(word) + 1 );
            }
        }

        String print = "";
    
        for( String key : dic.keySet() ){
            print += (key + ": " + dic.get(key) + "\n");
        }
        
        return print;

    }


}
