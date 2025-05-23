package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String msg;

    HttpStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static HttpStatus findCode(int code){
        for(HttpStatus status : values()){
            if(status.getCode() == code){
                return status;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public boolean isSuccess(){
        return code >= 200 && code <= 299;
    }

}
