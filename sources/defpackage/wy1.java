package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wy1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wy1[] $VALUES;
    public static final wy1 Rolling;
    public static final wy1 Scale;
    public static final wy1 Slide;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wy1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wy1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wy1] */
    static {
        ?? r0 = new Enum("Scale", 0);
        Scale = r0;
        ?? r1 = new Enum("Rolling", 1);
        Rolling = r1;
        ?? r2 = new Enum("Slide", 2);
        Slide = r2;
        wy1[] wy1VarArr = {r0, r1, r2};
        $VALUES = wy1VarArr;
        $ENTRIES = new wg7(wy1VarArr);
    }

    public static wy1 valueOf(String str) {
        return (wy1) Enum.valueOf(wy1.class, str);
    }

    public static wy1[] values() {
        return (wy1[]) $VALUES.clone();
    }
}
