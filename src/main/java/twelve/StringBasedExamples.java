package twelve;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

public class StringBasedExamples {

    /**
     * Problem :
     *
     *
     */

    public static void main(String[] args) {

        System.out.println(joinWithApacheCommon());
    }

    //isNotEmpty
    public static boolean isEmptyWithApacheCommon(){
        return StringUtils.isEmpty(null);
    }
    public static boolean isEmptyWithoutLibrariesWithException(){
        String nullForTest = null;
        return nullForTest.isEmpty();
    }
    // isNotBlank
    public static boolean isBlankWithApache(){
        return StringUtils.isBlank("    \t  \n");
    }

    public static boolean isNullOrEmptyWithGuava(){
        return Strings.isNullOrEmpty(null);
    }

    public static boolean isBlankWithoutLibraries(){
        String blank = "    \t  \n";
        return blank == null || "".equals(blank.trim());
    }

    public static String joinWithApacheCommon(){
        String[] joiners = {"one", "two", "three"};
        return StringUtils.join(joiners,",");
    }
    public static String joinWithGuava(){
        String[] joiners = {"John", "Jane", "Adam", "Tom"};
        return Joiner.on(",").join(joiners);
    }
    public static String joinWithoutLibraries(){
        String[] joiners = {"one", "two", "three"};
        StringBuffer stringBuffer = new StringBuffer();
        for (String join:joiners) {
            stringBuffer.append(join);
            stringBuffer.append(",");
            // also if check needed
        }
        return stringBuffer.toString();
    }

    public static boolean isNumericWithStringUtils(){
        return StringUtils.isNumeric("fjSMl34");
    }

    // Regex here!!!
    // d+ : one or more digit
    // - : negative
    // ? : optional
    public static boolean isNumericWithoutStringUtils(){
        String check = "";
        return check.matches("-?\\\\d+(\\\\.\\\\d+)?");
    }


}
