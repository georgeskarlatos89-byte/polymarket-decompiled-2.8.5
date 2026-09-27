package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jxd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ jxd[] $VALUES;
    public static final jxd Clockwise;
    public static final jxd CounterClockwise;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jxd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jxd] */
    static {
        ?? r0 = new Enum("CounterClockwise", 0);
        CounterClockwise = r0;
        ?? r1 = new Enum("Clockwise", 1);
        Clockwise = r1;
        jxd[] jxdVarArr = {r0, r1};
        $VALUES = jxdVarArr;
        $ENTRIES = new wg7(jxdVarArr);
    }

    public static jxd valueOf(String str) {
        return (jxd) Enum.valueOf(jxd.class, str);
    }

    public static jxd[] values() {
        return (jxd[]) $VALUES.clone();
    }
}
