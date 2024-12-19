package javamid.enumfile;

public enum HttpStatus {
    OK(200,"ok"),BAD_REQUEST(400,"Bad Request"),NOT_FOUND(404,"Not Found"), INTERNAL_SERVER_ERROR(500, "Iternal Server Error");
    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
        for (HttpStatus httpStatus : HttpStatus.values()) {
            if (httpStatus.code == httpCodeInput) {
                return httpStatus;
            }

        }
        return null;
    }

    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code>=200&&code <=299;
    }

}
