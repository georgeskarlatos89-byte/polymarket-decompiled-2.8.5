package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z25 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ z25[] $VALUES;
    public static final z25 VIEW_APPEAR;
    public static final z25 VIEW_DISAPPEAR;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z25] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z25] */
    static {
        ?? r0 = new Enum("VIEW_APPEAR", 0);
        VIEW_APPEAR = r0;
        ?? r1 = new Enum("VIEW_DISAPPEAR", 1);
        VIEW_DISAPPEAR = r1;
        z25[] z25VarArr = {r0, r1};
        $VALUES = z25VarArr;
        $ENTRIES = new wg7(z25VarArr);
    }

    public static z25 valueOf(String str) {
        return (z25) Enum.valueOf(z25.class, str);
    }

    public static z25[] values() {
        return (z25[]) $VALUES.clone();
    }
}
