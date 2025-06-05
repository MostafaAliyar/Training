package aliyar.mostafa.training.exception;

public interface IranValidation {
    String validateNationalID(String ssn)
            throws BadNationalIDException;
    String validatePersianName(String name)
            throws RuntimeException;
    String validateDate(String date)
            throws PersianDateException;
}
