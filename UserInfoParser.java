import java.util.*;

public class UserInfoParser{
    public static void main (String [] args){
    String userData = "USERID: ROHAN123 | FULLNAME: ROHAN BELSARE | ROLE: STUDENT ";
    String fullNameLable = "FULLNAME: ";
    int fullNameStartIndex = userData.indexOf(fullNameLable);
    int nameStart = fullNameStartIndex + fullNameLable.length();

    String roleSeprator = "| ROLE:";
    int fullNameEndIndex = userData.indexOf(roleSeprator);
    String fullname = userData.substring(nameStart, fullNameEndIndex). trim();

    String roleLable = "ROLE:";
    int roleStartIndex = userData.indexOf(roleLable);
    int roleStart = roleStartIndex + roleLable.length();

    String role = userData.substring(roleStart).trim();

    System.out.println("Fullname: "+ fullname);
    System.out.println("Role: "+role.toLowerCase());

    }
}