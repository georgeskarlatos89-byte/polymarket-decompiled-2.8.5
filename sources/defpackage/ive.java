package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ive {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ive[] $VALUES;
    public static final ive Filled;
    public static final ive Outline;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ive] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ive] */
    static {
        ?? r0 = new Enum("Outline", 0);
        Outline = r0;
        ?? r1 = new Enum("Filled", 1);
        Filled = r1;
        ive[] iveVarArr = {r0, r1};
        $VALUES = iveVarArr;
        $ENTRIES = new wg7(iveVarArr);
    }

    public static ive valueOf(String str) {
        return (ive) Enum.valueOf(ive.class, str);
    }

    public static ive[] values() {
        return (ive[]) $VALUES.clone();
    }
}
