package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b9d {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ b9d[] $VALUES;
    public static final b9d Height;
    public static final b9d Width;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b9d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b9d] */
    static {
        ?? r0 = new Enum("Width", 0);
        Width = r0;
        ?? r1 = new Enum("Height", 1);
        Height = r1;
        b9d[] b9dVarArr = {r0, r1};
        $VALUES = b9dVarArr;
        $ENTRIES = new wg7(b9dVarArr);
    }

    public static b9d valueOf(String str) {
        return (b9d) Enum.valueOf(b9d.class, str);
    }

    public static b9d[] values() {
        return (b9d[]) $VALUES.clone();
    }
}
