package com.example.bang;

public class department {

    private int flagID;
    private int nameID;
    private int abbreviationID;

    private int CapitalID;

    public department (int _flagID, int _nameID, int _abbreviationID, int _CapitalID){
        flagID = _flagID;
        nameID = _nameID;
        abbreviationID = _abbreviationID;
        CapitalID = _CapitalID;
    }

    public int getFlagID(){
        return flagID;
    }

    public int getNameID(){
        return nameID;
    }

    public int getAbbreviationID() {
        return abbreviationID;
    }

    public int getCapitalID() {
        return CapitalID;
    }
}

