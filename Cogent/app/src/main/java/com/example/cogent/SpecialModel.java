package com.example.cogent;

public class SpecialModel {
    private int game_icon;
    private String winningamount,entryamount,matchdetails;

    public SpecialModel(int game_icon, String winningamount, String entryamount, String matchdetails) {
        this.game_icon = game_icon;
        this.winningamount = winningamount;
        this.entryamount = entryamount;
        this.matchdetails = matchdetails;
    }
    public SpecialModel(){

    }
    public int getGame_icon() {
        return game_icon;
    }

    public void setGame_icon(int game_icon) {
        this.game_icon = game_icon;
    }

    public String getWinningamount() {
        return winningamount;
    }

    public void setWinningamount(String winningamount) {
        this.winningamount = winningamount;
    }

    public String getEntryamount() {
        return entryamount;
    }

    public void setEntryamount(String entryamount) {
        this.entryamount = entryamount;
    }

    public String getMatchdetails() {
        return matchdetails;
    }

    public void setMatchdetails(String matchdetails) {
        this.matchdetails = matchdetails;
    }
}
