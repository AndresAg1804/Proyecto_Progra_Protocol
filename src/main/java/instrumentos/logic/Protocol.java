package instrumentos.logic;

public class Protocol {

    public static final String SERVER = "localhost";
    public static final int PORT = 1234;

    public static final int CREATETI=100;
    public static final int READTI=101;
    public static final int UPDATETI=102;
    public static final int DELETETI=103;
    public static final int SEARCHTI=104;

    public static final int CREATEI=200;
    public static final int READI=201;
    public static final int UPDATEI=202;
    public static final int DELETEI=203;
    public static final int SEARCHI=204;

    public static final int CREATEC=300;
    public static final int READC=301;
    public static final int UPDATEC=302;
    public static final int DELETEC=303;
    public static final int SEARCHC=304;
    public static final int SEARCHCBI=305;

    public static final int CREATEM=400;
    public static final int READM=401;
    public static final int UPDATEM=402;
    public static final int DELETEM=403;
    public static final int SEARCHM=404;
    public static final int SEARCHMBC=405;

    public static final int DELIVER=10;
    public static final int DISCONNECT=11;
    public static final int ERROR_NO_ERROR=0;
    public static final int ERROR_ERROR=1;
}