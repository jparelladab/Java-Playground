package Languages;

class SinoTibetan extends Language {

    SinoTibetan(String nom, int numParl){
        super(nom, numParl,"Asia","subject-object-verb");
        if (this.name.contains("Chinese")) {
            this.wordOrder = "subject-ver-object";
        }
    }
}

