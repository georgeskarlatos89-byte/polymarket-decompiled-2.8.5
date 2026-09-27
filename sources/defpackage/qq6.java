package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qq6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qq6[] $VALUES;
    public static final qq6 LandscapeLeft;
    public static final qq6 LandscapeRight;
    public static final qq6 Portrait;
    public static final qq6 UpsideDown;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qq6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qq6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qq6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, qq6] */
    static {
        ?? r0 = new Enum("Portrait", 0);
        Portrait = r0;
        ?? r1 = new Enum("LandscapeLeft", 1);
        LandscapeLeft = r1;
        ?? r2 = new Enum("LandscapeRight", 2);
        LandscapeRight = r2;
        ?? r3 = new Enum("UpsideDown", 3);
        UpsideDown = r3;
        qq6[] qq6VarArr = {r0, r1, r2, r3};
        $VALUES = qq6VarArr;
        $ENTRIES = new wg7(qq6VarArr);
    }

    public static qq6 valueOf(String str) {
        return (qq6) Enum.valueOf(qq6.class, str);
    }

    public static qq6[] values() {
        return (qq6[]) $VALUES.clone();
    }
}
