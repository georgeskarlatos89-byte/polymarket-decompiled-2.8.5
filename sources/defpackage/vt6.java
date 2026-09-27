package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vt6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vt6[] $VALUES;
    public static final vt6 Both;
    public static final vt6 Horizontal;
    public static final vt6 Vertical;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vt6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vt6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vt6] */
    static {
        ?? r0 = new Enum("Vertical", 0);
        Vertical = r0;
        ?? r1 = new Enum("Horizontal", 1);
        Horizontal = r1;
        ?? r2 = new Enum("Both", 2);
        Both = r2;
        vt6[] vt6VarArr = {r0, r1, r2};
        $VALUES = vt6VarArr;
        $ENTRIES = new wg7(vt6VarArr);
    }

    public static vt6 valueOf(String str) {
        return (vt6) Enum.valueOf(vt6.class, str);
    }

    public static vt6[] values() {
        return (vt6[]) $VALUES.clone();
    }
}
