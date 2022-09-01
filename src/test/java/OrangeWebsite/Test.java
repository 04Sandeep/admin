package OrangeWebsite;

public class Test extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        setup();
        pageFactory.getAdminPage().adminPage();
    }
}
