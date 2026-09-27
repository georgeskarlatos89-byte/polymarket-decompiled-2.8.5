package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class c07 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c07[] $VALUES;
    public static final c07 None;
    public static final c07 Overlay;
    public static final c07 Stacked;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c07] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c07] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c07] */
    static {
        ?? r0 = new Enum("None", 0);
        None = r0;
        ?? r1 = new Enum("Stacked", 1);
        Stacked = r1;
        ?? r2 = new Enum("Overlay", 2);
        Overlay = r2;
        c07[] c07VarArr = {r0, r1, r2};
        $VALUES = c07VarArr;
        $ENTRIES = new wg7(c07VarArr);
    }

    public static c07 valueOf(String str) {
        return (c07) Enum.valueOf(c07.class, str);
    }

    public static c07[] values() {
        return (c07[]) $VALUES.clone();
    }
}
