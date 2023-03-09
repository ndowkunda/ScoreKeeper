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

}
