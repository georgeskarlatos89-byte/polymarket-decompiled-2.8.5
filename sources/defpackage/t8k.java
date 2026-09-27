package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t8k {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ t8k[] $VALUES;
    public static final t8k OFF;
    public static final t8k ON;
    public static final t8k PREVIEW;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t8k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t8k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, t8k] */
    static {
        ?? r0 = new Enum("OFF", 0);
        OFF = r0;
        ?? r1 = new Enum("ON", 1);
        ON = r1;
        ?? r2 = new Enum("PREVIEW", 2);
        PREVIEW = r2;
        t8k[] t8kVarArr = {r0, r1, r2};
        $VALUES = t8kVarArr;
        $ENTRIES = new wg7(t8kVarArr);
    }

    public static t8k valueOf(String str) {
        return (t8k) Enum.valueOf(t8k.class, str);
    }

    public static t8k[] values() {
        return (t8k[]) $VALUES.clone();
    }
}
