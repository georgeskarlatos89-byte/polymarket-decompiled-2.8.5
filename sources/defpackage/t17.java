package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t17 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ t17[] $VALUES;
    public static final t17 Closed;
    public static final t17 Open;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t17] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t17] */
    static {
        ?? r0 = new Enum("Closed", 0);
        Closed = r0;
        ?? r1 = new Enum("Open", 1);
        Open = r1;
        t17[] t17VarArr = {r0, r1};
        $VALUES = t17VarArr;
        $ENTRIES = new wg7(t17VarArr);
    }

    public static t17 valueOf(String str) {
        return (t17) Enum.valueOf(t17.class, str);
    }

    public static t17[] values() {
        return (t17[]) $VALUES.clone();
    }
}
