package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g48 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ g48[] $VALUES;
    public static final g48 ForData;
    public static final g48 ForInstantDebits;
    public static final g48 ForToken;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g48] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g48] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g48] */
    static {
        ?? r0 = new Enum("ForData", 0);
        ForData = r0;
        ?? r1 = new Enum("ForInstantDebits", 1);
        ForInstantDebits = r1;
        ?? r2 = new Enum("ForToken", 2);
        ForToken = r2;
        g48[] g48VarArr = {r0, r1, r2};
        $VALUES = g48VarArr;
        $ENTRIES = new wg7(g48VarArr);
    }

    public static g48 valueOf(String str) {
        return (g48) Enum.valueOf(g48.class, str);
    }

    public static g48[] values() {
        return (g48[]) $VALUES.clone();
    }
}
