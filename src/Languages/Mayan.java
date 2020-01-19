package Languages;

class Mayan extends Language {

    Mayan(String nom, int numParl) {
        super(nom, numParl, "Centeral America","verb-object-subject");
    }

    protected void getInfo() {
        System.out.println(this.name + " is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+". The language follows the word order: "+this.wordOrder+"\nFun fact: "+this.name+" is an ergative language.");
    }

    void mayanUnique() {
        System.out.println("I'm a unique Mayan method, only for pure Mayan objects");
    }
}
