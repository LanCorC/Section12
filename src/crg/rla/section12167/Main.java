package crg.rla.section12167;

public class Main {

    public static void main(String[] args) {
        League<TfTeam> oceTourney = new League<>();
        TfTeam lagooners = new TfTeam("Lagooners");
        TfTeam nomsyHot = new TfTeam("NomsyHot");
        TfTeam heartZoeBBAbuser = new TfTeam("HeartZoeBBAbuser");
        oceTourney.addTeam(lagooners);
//        oceTourney.addTeam(new LolTeam("tox11c")); //foreign typeReject
        oceTourney.addTeam(nomsyHot);
        oceTourney.addTeam(heartZoeBBAbuser);
        oceTourney.addTeam(nomsyHot);

        lagooners.matchResult(nomsyHot, 2, 4);
        lagooners.matchResult(heartZoeBBAbuser, 5, 5);
        nomsyHot.matchResult(heartZoeBBAbuser, 2, 2);

        oceTourney.printRated();

//        LolTeam hateSelf = new LolTeam("hateSelf");
//        nomsyHot.matchResult(hateSelf); //foreign typeReject
    }
}
