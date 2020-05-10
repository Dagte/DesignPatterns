package homework.three.before;

class AdmissionService{


    public void admitGuest(String name, String admissionDateTime) {
        // Some logic
        // ...
        int time;
        int hours = 0;
        int minutes = 0;

        if (admissionDateTime != null && !admissionDateTime.isEmpty()) {
            try {
                time = Integer.parseInt(admissionDateTime.replace
                        (":", ""));
                hours = time / 100;
                minutes = time % 100;

            } catch (Exception ex) {
                throw new IllegalArgumentException
                        ("Invalid admissionDateTime format");
            }
        } else
            throw new IllegalArgumentException(
                    "admissionDateTime can not be null");

        // Some more logic
        // ...
        if (hours < 10 && minutes <30) {
            // do some operation
        }
    }

    public void updateAdmission(int admissionId, String name,
                                String admissionDateTime) {
        // Some logic
        // ...
        int time;
        int hours = 0;
        int minutes = 0;
        if (admissionDateTime != null && !admissionDateTime.isEmpty()) {
            try {
                time = Integer.parseInt(
                        admissionDateTime.replace(":", ""));
                hours = time / 100;
                minutes = time % 100;

            } catch (Exception ex) {
                throw new IllegalArgumentException(
                        "Invalid admissionDateTime format");
            }
        } else
            throw new IllegalArgumentException(
                    "admissionDateTime can not be null");

        // Some more logic
        // ...
        if (hours < 10 && minutes <30) {

        }
    }
}
