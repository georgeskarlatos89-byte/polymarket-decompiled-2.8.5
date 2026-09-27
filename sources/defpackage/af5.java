package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class af5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ af5[] $VALUES;
    public static final af5 COLLAPSED;
    public static final af5 CROSSED;
    public static final af5 NOT_CROSSED;

    /* JADX WARN: Type inference failed for: r0v0, types: [af5, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [af5, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [af5, java.lang.Enum] */
    static {
        ?? r0 = new Enum("CROSSED", 0);
        CROSSED = r0;
        ?? r1 = new Enum("NOT_CROSSED", 1);
        NOT_CROSSED = r1;
        ?? r2 = new Enum("COLLAPSED", 2);
        COLLAPSED = r2;
        af5[] af5VarArr = {r0, r1, r2};
        $VALUES = af5VarArr;
        $ENTRIES = new wg7(af5VarArr);
    }

    public static af5 valueOf(String str) {
        return (af5) Enum.valueOf(af5.class, str);
    }

    public static af5[] values() {
        return (af5[]) $VALUES.clone();
    }
}
