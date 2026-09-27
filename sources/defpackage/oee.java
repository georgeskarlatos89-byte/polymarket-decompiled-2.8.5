package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class oee {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ oee[] $VALUES;
    public static final oee AUTOMATIC;
    public static final oee NEVER;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, oee] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, oee] */
    static {
        ?? r0 = new Enum("AUTOMATIC", 0);
        AUTOMATIC = r0;
        ?? r1 = new Enum("NEVER", 1);
        NEVER = r1;
        oee[] oeeVarArr = {r0, r1};
        $VALUES = oeeVarArr;
        $ENTRIES = new wg7(oeeVarArr);
    }

    public static oee valueOf(String str) {
        return (oee) Enum.valueOf(oee.class, str);
    }

    public static oee[] values() {
        return (oee[]) $VALUES.clone();
    }
}
