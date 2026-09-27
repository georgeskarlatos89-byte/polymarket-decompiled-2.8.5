package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class sw3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sw3[] $VALUES;
    public static final sw3 LIFECYCLE_RESUME;
    public static final sw3 NETWORK_AVAILABLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sw3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sw3] */
    static {
        ?? r0 = new Enum("LIFECYCLE_RESUME", 0);
        LIFECYCLE_RESUME = r0;
        ?? r1 = new Enum("NETWORK_AVAILABLE", 1);
        NETWORK_AVAILABLE = r1;
        sw3[] sw3VarArr = {r0, r1};
        $VALUES = sw3VarArr;
        $ENTRIES = new wg7(sw3VarArr);
    }

    public static sw3 valueOf(String str) {
        return (sw3) Enum.valueOf(sw3.class, str);
    }

    public static sw3[] values() {
        return (sw3[]) $VALUES.clone();
    }
}
