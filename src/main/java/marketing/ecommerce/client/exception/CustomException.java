package marketing.ecommerce.client.exception;
public class CustomException extends RuntimeException{
    private final ErrorCode errorCode;
    public CustomException(ErrorCode errorCode){
        super(errorCode.getDetail());
        this.errorCode=errorCode;}}