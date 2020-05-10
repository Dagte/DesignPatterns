package homework.three.after;

class AdmissionService {


    public void admitGuest(String name, String admissionDateTime) {
        // Some logic
        // ...
        int time = checkAdmissionData(admissionDateTime);
        int hours = 0;
        int minutes = 0;

        hours = time / 100;
        minutes = time % 100;

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

        time = checkAdmissionData(admissionDateTime);
        hours = time / 100;
        minutes = time % 100;

        // Some more logic
        // ...
        if (hours < 10 && minutes <30) {

        }
    }

    public int checkAdmissionData(String admissionDateTime) {
        int time;

        if (admissionDateTime != null && !admissionDateTime.isEmpty()) {
            try {
                time = Integer.parseInt(
                        admissionDateTime.replace(":", ""));


            } catch (Exception ex) {
                throw new IllegalArgumentException(
                        "Invalid admissionDateTime format");
            }
        } else
            throw new IllegalArgumentException(
                    "admissionDateTime can not be null");
    return time;
    }
}
