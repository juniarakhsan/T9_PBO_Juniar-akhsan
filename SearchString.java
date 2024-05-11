public class SearchString {
    public static void main(String[] args) {
        String[] stringArray = {"violin", "viola", "cello", "double bass"};
        String searchString = "cello";
        for (String s : stringArray) {
            if (s.equals(searchString)) {
                System.out.println("Found: " + s);
                break;
            }
        }
    }
}
