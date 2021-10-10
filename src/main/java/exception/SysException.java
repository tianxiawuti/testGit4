package exception;

/**
 * @author zhy
 * @create 2021-10-04 19:59
 */
public class SysException extends Exception{

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
