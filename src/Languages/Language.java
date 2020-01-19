package Languages;

class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String nom, int numParl, String regions, String ordre){
        name = nom;
        numSpeakers = numParl;
        regionsSpoken = regions;
        wordOrder = ordre;
    }

    protected void getInfo() {
        System.out.println(this.name + " is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+". The language follows the word order: "+this.wordOrder);
    }

    void languageUnique() {
        System.out.println("I'm a generic Language method, only for pure Language instances and polymorphisms on Languages");
    }

    public static void main(String[] args){
        Language catalan = new Language("Catalan", 9000000,"many","subject - verb - object");
        catalan.getInfo();
        catalan.languageUnique();
        Language tzotzil = new Mayan("Tzotzil", 404000);
        tzotzil.getInfo();
        Mayan chontal = new Mayan("Chontal", 36000);
        chontal.getInfo();
        chontal.mayanUnique();
        Language mandarin = new SinoTibetan("Mandarin Chinese",1200000000);
        Language burmese = new SinoTibetan("Burmese", 3000000);
        mandarin.getInfo();
        burmese.getInfo();
    }
}