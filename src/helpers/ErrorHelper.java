package helpers;

public class ErrorHelper {

    private static ErrorHelper instance;

    public static ErrorHelper getInstance(){
        if(instance==null){
            instance = new ErrorHelper();
        }
        return instance;
    }

    private String errorSyntax;

    public String getErrorSyntax() {
        return errorSyntax;
    }

    public void setErrorSyntax(String errorSyntax) {
        this.errorSyntax = errorSyntax;
    }
}
