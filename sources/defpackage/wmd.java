package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wmd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wmd[] $VALUES;
    public static final wmd ANY;
    public static final wmd LANDSCAPE;
    public static final wmd PORTRAIT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wmd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wmd] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wmd] */
    static {
        ?? r0 = new Enum("PORTRAIT", 0);
        PORTRAIT = r0;
        ?? r1 = new Enum("LANDSCAPE", 1);
        LANDSCAPE = r1;
        ?? r2 = new Enum("ANY", 2);
        ANY = r2;
        wmd[] wmdVarArr = {r0, r1, r2};
        $VALUES = wmdVarArr;
        $ENTRIES = new wg7(wmdVarArr);
    }

    public static wmd valueOf(String str) {
        return (wmd) Enum.valueOf(wmd.class, str);
    }

    public static wmd[] values() {
        return (wmd[]) $VALUES.clone();
    }
}
