package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xg2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xg2[] $VALUES;
    public static final xg2 Filled;
    public static final xg2 Stroked;

    /* JADX WARN: Type inference failed for: r0v0, types: [xg2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xg2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Filled", 0);
        Filled = r0;
        ?? r1 = new Enum("Stroked", 1);
        Stroked = r1;
        xg2[] xg2VarArr = {r0, r1};
        $VALUES = xg2VarArr;
        $ENTRIES = new wg7(xg2VarArr);
    }

    public static xg2 valueOf(String str) {
        return (xg2) Enum.valueOf(xg2.class, str);
    }

    public static xg2[] values() {
        return (xg2[]) $VALUES.clone();
    }
}
