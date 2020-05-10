package seven.after;

enum DocumentStatus{
    Draft(1),
    Lodged(2),
    Sent(3);

    private final int status;
    DocumentStatus(int i) {
        this.status = i;
    }
    public int getValue() {
        return status;
    }
}
