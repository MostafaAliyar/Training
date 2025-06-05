package aliyar.mostafa.training.exception;

import java.util.regex.Pattern;

public class Person implements IranValidation{
    private String name;
    private String ID;
    private String Date;

    public void setName(String name) {
        this.name = validatePersianName(name);
    }
    public void setID(String ID) {
        this.ID = validateNationalID(ID);
    }
    public void setDate(String Date) {
        this.Date = validateDate(Date);
    }
    public String getName() {
        return name;
    }
    public String getID() {
        return ID;
    }
    public String getDate() {
        return Date;
    }

    @Override
    public String validateNationalID(String ssn) throws BadNationalIDException {
        if (ssn.length() != 11) {
            throw new BadNationalIDException("شماره ملی معتبر نیست");
        } else return ssn;
    }

    @Override
    public String validatePersianName(String name) throws RuntimeException {
        String persianPattern = "^[\\u0600-\\u06FF\\s]+$";
        if (!Pattern.matches(persianPattern, name)){
            throw new RuntimeException("نام فارسی نیست !");
        } else if (name.matches(".*\\d.*")) {
            throw new RuntimeException("داخل اسم نباید از عدد استفاده کرد");
        }else return name;
    }

    @Override
    public String validateDate(String date) throws PersianDateException {
        String persianDatePattern = "^\\d{4}/\\d{2}/\\d{2}$"; // قالب YYYY/MM/DD
        if (!Pattern.matches(persianDatePattern, date)){
            throw new PersianDateException("قالب تاریخ استفاده میباشد!");
        }else return date;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", ID=" + ID + ", Date=" + Date + "]";
    }
}
