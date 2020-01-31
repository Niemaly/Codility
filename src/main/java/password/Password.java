package password;



import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public int solution(String string){

        String [] passwords = string.split(" ");

        Pattern pattern = Pattern.compile("[A-Za-z0-9]{1,200}");

        Arrays.sort(passwords, (a,b)->Integer.compare(b.length(), a.length()));

        for (String password: passwords) {
            Matcher matcher = pattern.matcher(password);

            if(password.length() % 2 != 0){

                if (matcher.matches()){
                    String pas = password;

                    int numberOfLetters = password.replaceAll("[0-9]", "").length();
                    System.out.println(numberOfLetters);

                    if (numberOfLetters % 2 == 0)
                        return pas.length();

                }

            }
        }


        return -1;
    }

}
