package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class yd2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ yd2[] $VALUES;
    public static final yd2 Bounce;
    public static final yd2 Continuous;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, yd2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yd2] */
    static {
        ?? r0 = new Enum("Bounce", 0);
        Bounce = r0;
        ?? r1 = new Enum("Continuous", 1);
        Continuous = r1;
        yd2[] yd2VarArr = {r0, r1};
        $VALUES = yd2VarArr;
        $ENTRIES = new wg7(yd2VarArr);
    }

    public static yd2 valueOf(String str) {
        return (yd2) Enum.valueOf(yd2.class, str);
    }

    public static yd2[] values() {
        return (yd2[]) $VALUES.clone();
    }
}
