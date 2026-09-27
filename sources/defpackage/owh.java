package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class owh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ owh[] $VALUES;
    public static final owh MatchFound;
    public static final owh NoMatchFound;
    public static final owh NoRequest;
    public static final owh VisibleContentAbsentDuringTransition;

    /* JADX WARN: Type inference failed for: r0v0, types: [owh, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [owh, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [owh, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [owh, java.lang.Enum] */
    static {
        ?? r0 = new Enum("NoRequest", 0);
        NoRequest = r0;
        ?? r1 = new Enum("MatchFound", 1);
        MatchFound = r1;
        ?? r2 = new Enum("VisibleContentAbsentDuringTransition", 2);
        VisibleContentAbsentDuringTransition = r2;
        ?? r3 = new Enum("NoMatchFound", 3);
        NoMatchFound = r3;
        owh[] owhVarArr = {r0, r1, r2, r3};
        $VALUES = owhVarArr;
        $ENTRIES = new wg7(owhVarArr);
    }

    public static owh valueOf(String str) {
        return (owh) Enum.valueOf(owh.class, str);
    }

    public static owh[] values() {
        return (owh[]) $VALUES.clone();
    }
}
