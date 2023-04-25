package net.braniumacademy.exception;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class InvalidStudentIdException extends Exception {

    private String invalidStudentId;

    public InvalidStudentIdException() {
    }

    public InvalidStudentIdException(String invalidStudentId, String message) {
        super(message); // gọi constructor của lớp cha -> truyền vào đối số inva.ID -> lưu trữ, truy xuất
        this.invalidStudentId = invalidStudentId;
    }

    public String getInvalidStudentId() {
        return invalidStudentId;
    }

    public void setInvalidStudentId(String invalidStudentId) {
        this.invalidStudentId = invalidStudentId;
    }
}
