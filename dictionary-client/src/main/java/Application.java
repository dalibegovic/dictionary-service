import dictionary.DictionaryService;

public class Application {
    public static void main(String[] args) {
        String cloud = "cloud";
        String amazon = "amazon";
        String rest = "rest";
        String xml = "xml";

        DictionaryService dictionaryService = new DictionaryService();

        System.out.println(cloud + ": " + dictionaryService.getDefinition(cloud));
        System.out.println(amazon + ": " + dictionaryService.getDefinition(amazon));
        System.out.println(rest + ": " + dictionaryService.getDefinition(rest));
        System.out.println(xml + ": " + dictionaryService.getDefinition(xml));
    }
}
