//palindrome of a string

class Palindrome {
    private char[] str;
    private int l = 0;
    boolean pal = true;

    public void setString(char str[]) {
        this.str = str;
    }

    public void length() {
        for (int i = 0; str[i] != '\0'; i++)
            l++;
    }

    public void check() {
        for (int i = 0; i < l/2; i++) {
            if (str[i] != str[l - i - 1]) {
                pal = false;
                break;
            }
        }
    }

    public void print() {
        if (pal) 
            System.out.println("The string is palindrome");
        else
            System.out.println("The string is not palindrome");
    }
}

public class Palindromeobject {
    public static void main(String[] args) {
        char[] str = {'m', 'a', 'l', 'a', 'y', 'a', 'l', 'a', 'm', '\0'};
        Palindrome pali = new Palindrome();
        pali.setString(str);
        pali.length();
        pali.check();
        pali.print();
    }
}
