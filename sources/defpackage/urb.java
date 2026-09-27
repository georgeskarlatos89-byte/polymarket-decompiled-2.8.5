package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class urb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ urb[] $VALUES;
    public static final urb DEBUG;
    public static final urb ERROR;
    public static final urb INFO;
    public static final urb OFF;
    public static final urb WARN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, urb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, urb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, urb] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, urb] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, urb] */
    static {
        ?? r0 = new Enum("DEBUG", 0);
        DEBUG = r0;
        ?? r1 = new Enum("INFO", 1);
        INFO = r1;
        ?? r2 = new Enum("WARN", 2);
        WARN = r2;
        ?? r3 = new Enum("ERROR", 3);
        ERROR = r3;
        ?? r4 = new Enum("OFF", 4);
        OFF = r4;
        urb[] urbVarArr = {r0, r1, r2, r3, r4};
        $VALUES = urbVarArr;
        $ENTRIES = new wg7(urbVarArr);
    }

    public static urb valueOf(String str) {
        return (urb) Enum.valueOf(urb.class, str);
    }

    public static urb[] values() {
        return (urb[]) $VALUES.clone();
    }
}
