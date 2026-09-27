package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class bn2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ bn2[] $VALUES;
    public static final bn2 Large;
    public static final bn2 Standard;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bn2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, bn2] */
    static {
        ?? r0 = new Enum("Standard", 0);
        Standard = r0;
        ?? r1 = new Enum("Large", 1);
        Large = r1;
        bn2[] bn2VarArr = {r0, r1};
        $VALUES = bn2VarArr;
        $ENTRIES = new wg7(bn2VarArr);
    }

    public static bn2 valueOf(String str) {
        return (bn2) Enum.valueOf(bn2.class, str);
    }

    public static bn2[] values() {
        return (bn2[]) $VALUES.clone();
    }
}
