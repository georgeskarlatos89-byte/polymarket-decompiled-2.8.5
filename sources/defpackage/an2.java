package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class an2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ an2[] $VALUES;
    public static final an2 Large;
    public static final an2 Medium;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, an2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, an2] */
    static {
        ?? r0 = new Enum("Large", 0);
        Large = r0;
        ?? r1 = new Enum("Medium", 1);
        Medium = r1;
        an2[] an2VarArr = {r0, r1};
        $VALUES = an2VarArr;
        $ENTRIES = new wg7(an2VarArr);
    }

    public static an2 valueOf(String str) {
        return (an2) Enum.valueOf(an2.class, str);
    }

    public static an2[] values() {
        return (an2[]) $VALUES.clone();
    }
}
