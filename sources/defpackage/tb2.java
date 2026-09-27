package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tb2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tb2[] $VALUES;
    public static final tb2 Contained;
    public static final tb2 Glass;
    public static final tb2 Overlay;
    public static final tb2 Simple;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tb2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tb2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tb2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, tb2] */
    static {
        ?? r0 = new Enum("Simple", 0);
        Simple = r0;
        ?? r1 = new Enum("Contained", 1);
        Contained = r1;
        ?? r2 = new Enum("Glass", 2);
        Glass = r2;
        ?? r3 = new Enum("Overlay", 3);
        Overlay = r3;
        tb2[] tb2VarArr = {r0, r1, r2, r3};
        $VALUES = tb2VarArr;
        $ENTRIES = new wg7(tb2VarArr);
    }

    public static tb2 valueOf(String str) {
        return (tb2) Enum.valueOf(tb2.class, str);
    }

    public static tb2[] values() {
        return (tb2[]) $VALUES.clone();
    }
}
