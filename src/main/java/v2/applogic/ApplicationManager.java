package v2.applogic;

public class ApplicationManager {

    public HeaderHelper header;
    public AuthHelper auth;

    public ApplicationManager() {
        this.header = new HeaderHelper(this);
        this.auth = new AuthHelper(this);
    }
}
