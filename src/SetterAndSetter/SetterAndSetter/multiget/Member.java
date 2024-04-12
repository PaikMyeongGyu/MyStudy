package SetterAndSetter.SetterAndSetter.multiget;

import java.util.Date;

public class Member {

    private Date expireDate;
    private Gender gender;

    // 문제가 잘 보이지 않는 코드
    public boolean isExpired() {
        if (gender.equals(Gender.MALE) && expireDate.getDate() < System.currentTimeMillis())
            return false;
        else if (gender.equals(Gender.FEMALE) && (expireDate.getDate() + 30 < System.currentTimeMillis()))
            return false;
        else if(gender.equals(Gender.MALE) && expireDate.getDate() >= System.currentTimeMillis())
            return true;
        else if (gender.equals(Gender.FEMALE) && (expireDate.getDate() + 30 >= System.currentTimeMillis()))
            return true;
        else
            return false;
    }

    // 문제가 잘 보이는 코드
    public boolean isExpired2() {
        int date = expireDate.getDate();
        if (gender.equals(Gender.MALE) && date < System.currentTimeMillis())
            return false;
        else if (gender.equals(Gender.FEMALE) && (date + 30 < System.currentTimeMillis()))
            return false;
        else if(gender.equals(Gender.MALE) && date >= System.currentTimeMillis())
            return true;
        else if (gender.equals(Gender.FEMALE) && (date + 30 >= System.currentTimeMillis()))
            return true;
        else
            return false;
    }
}
