public class ScoreKeeper {

    private String score = "000:000";

    public String getScore() {
        return score;
    }

    public void scoreTeamA1() {
        String scoreTeamA = score.substring(0, 3);
        int scoreTeamAInt = Integer.parseInt(scoreTeamA);
        int scoreLimit = 999;
        if(scoreTeamAInt < scoreLimit) {
            scoreTeamAInt++;
        }
        String scoreTeamAStr = String.format("%03d",scoreTeamAInt);
        String scoreTeamBStr = score.substring(3);
        score = scoreTeamAStr + scoreTeamBStr;
    }

    public void scoreTeamB1() {
        String scoreTeamB = score.substring( 4);
        int scoreTeamBInt = Integer.parseInt(scoreTeamB);
        int scoreLimit = 999;
        if(scoreTeamBInt < scoreLimit) {
            scoreTeamBInt++;
        }
        String scoreTeamBStr = String.format("%03d", scoreTeamBInt);
        String scoreTeamAStr = score.substring(0,4);
        score = scoreTeamAStr + scoreTeamBStr;
    }
}
