package seven.after;

public class MagicNumbers {

    // Most probably you are gonna say WTF is this SHIT!

    /**
     * Problem:
     * do approve document operations regarding it's status
     *
     */
    public void approveDocument(int status)
    {
        if (status == 1) // Draft
        {
            // ...
        }
        else if (status == 2) // Lodged
        {
            // ...
        }
        else if (status == 3) // Sent
        {
            // ...
        }
    }

    public void rejectDocument(String status)
    {
        switch (status)
        {
            case "1":
                // ...
                break;
            case "2":
                // ...
                break;
        }
    }


    private static final int STATUS_DRAFT = 1;
    private static final int STATUS_LODGED = 2;
    private static final int STATUS_SENT = 3;

    public void approveDocumentFirstRefactoring(int status)
    {
        if (status == STATUS_DRAFT)
        {
            // ...
        }
        else if (status == STATUS_LODGED) // Lodged
        {
            // ...
        }
        else if (status == STATUS_SENT) // Sent
        {
            // ...
        }
    }

    public void approveDocumentSecondRefactoring(int status) {
        if (status == DocumentStatus.Draft.getValue()) // Draft
        {
            // ...
        }
        else if (status == DocumentStatus.Lodged.getValue()) // Lodged
        {
            // ...
        }
        else if (status == DocumentStatus.Sent.getValue()) // Sent
        {
            // ...
        }
    }
}

