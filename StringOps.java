public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String capVowelsLowRest (String string) {
        String help = "";
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)=='a' || string.charAt(i)=='A') help+='A'; 
            else if(string.charAt(i)=='e' || string.charAt(i)=='E') help+='E'; 
            else if(string.charAt(i)=='i' || string.charAt(i)=='I') help+='I'; 
            else if(string.charAt(i)=='o' || string.charAt(i)=='O') help+='O'; 
            else if(string.charAt(i)=='u' || string.charAt(i)=='U') help+='U'; 
            else if(string.charAt(i)==' ') help+=' ';
            else if (string.charAt(i)<=90 && string.charAt(i)>=65) help+=(char)(string.charAt(i)+32);
            else help+=string.charAt(i);
        }
        return help;
    }

    public static String camelCase (String string) {
        String help = "";
        boolean afterspace = false;
        boolean firstspace = false; 

        for(int i=0; i<string.length(); i++){ 
            if(string.charAt(i)==' '){
                if(i==0) firstspace = true;
                afterspace=true;
            } 
            else if(i==0){
                if (string.charAt(i)<=90 && string.charAt(i)>=65) help+=(char)(string.charAt(i)+32) ;
                else help+=string.charAt(i);
            }
            else if(afterspace==true && string.charAt(i)!=' '){
                if(firstspace==false){
                   if (string.charAt(i)<=90 && string.charAt(i)>=65) help+=string.charAt(i);
                   else help+=(char)(string.charAt(i)-32);
                   afterspace=false; 
                } 
                else if (firstspace=true){
                    if (string.charAt(i)<=90 && string.charAt(i)>=65) help+=(char)(string.charAt(i)+32) ;
                    else help+=string.charAt(i);
                    firstspace=false;
                    afterspace=false;
                }
            }
            else if (string.charAt(i)<=90 && string.charAt(i)>=65) help+=(char)(string.charAt(i)+32);
            else help+=string.charAt(i);
        }
        return help;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count=0;
        for(int i=0; i<string.length(); i++){
            if (string.charAt(i)==chr) count++;
        }

        int [] end =new int[count];
        boolean isin=false;
        int r=0;

        for(int j=0; j<end.length; j++){
            while (isin==false) {
                if (string.charAt(r)==chr){
                    end[j]=r;
                    isin=true;
                } 
                r++;
            }
            isin=false;
        }

        return end;
    }
}
