package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class grh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ grh[] $VALUES;
    public static final grh Glass;
    public static final grh Surface;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, grh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, grh] */
    static {
        ?? r0 = new Enum("Glass", 0);
        Glass = r0;
        ?? r1 = new Enum("Surface", 1);
        Surface = r1;
        grh[] grhVarArr = {r0, r1};
        $VALUES = grhVarArr;
        $ENTRIES = new wg7(grhVarArr);
    }

    public static grh valueOf(String str) {
        return (grh) Enum.valueOf(grh.class, str);
    }

    public static grh[] values() {
        return (grh[]) $VALUES.clone();
    }

    public final float a() {
        int i = frh.a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 16.0f;
            }
            dmk.a();
            return 0.0f;
        }
        return 20.0f;
    }
}
