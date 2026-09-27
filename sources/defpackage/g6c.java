package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g6c {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ g6c[] $VALUES;
    public static final g6c Height;
    public static final g6c Width;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g6c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g6c] */
    static {
        ?? r0 = new Enum("Width", 0);
        Width = r0;
        ?? r1 = new Enum("Height", 1);
        Height = r1;
        g6c[] g6cVarArr = {r0, r1};
        $VALUES = g6cVarArr;
        $ENTRIES = new wg7(g6cVarArr);
    }

    public static g6c valueOf(String str) {
        return (g6c) Enum.valueOf(g6c.class, str);
    }

    public static g6c[] values() {
        return (g6c[]) $VALUES.clone();
    }
}
