package Controllers.DTO;

public class Response {
    private Boolean status;
    private String msg;
    private String responseCode;
    public Response(Boolean status,String msg,String responseCode){
        this.status=status;
        this.msg=msg;
        this.responseCode=responseCode;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
}
