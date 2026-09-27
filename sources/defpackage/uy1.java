package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class uy1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ uy1[] $VALUES;
    public static final uy1 Scale;
    public static final uy1 Truncate;
    public static final uy1 Visible;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, uy1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, uy1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, uy1] */
    static {
        ?? r0 = new Enum("Visible", 0);
        Visible = r0;
        ?? r1 = new Enum("Truncate", 1);
        Truncate = r1;
        ?? r2 = new Enum("Scale", 2);
        Scale = r2;
        uy1[] uy1VarArr = {r0, r1, r2};
        $VALUES = uy1VarArr;
        $ENTRIES = new wg7(uy1VarArr);
    }

    public static uy1 valueOf(String str) {
        return (uy1) Enum.valueOf(uy1.class, str);
    }

    public static uy1[] values() {
        return (uy1[]) $VALUES.clone();
    }
}
