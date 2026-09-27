package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j14 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ j14[] $VALUES;
    public static final j14 BILLING;
    public static final j14 SHIPPING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j14] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j14] */
    static {
        ?? r0 = new Enum("SHIPPING", 0);
        SHIPPING = r0;
        ?? r1 = new Enum("BILLING", 1);
        BILLING = r1;
        j14[] j14VarArr = {r0, r1};
        $VALUES = j14VarArr;
        $ENTRIES = new wg7(j14VarArr);
    }

    public static j14 valueOf(String str) {
        return (j14) Enum.valueOf(j14.class, str);
    }

    public static j14[] values() {
        return (j14[]) $VALUES.clone();
    }
}
