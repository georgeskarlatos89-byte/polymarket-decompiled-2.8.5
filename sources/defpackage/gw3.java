package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gw3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ gw3[] $VALUES;
    public static final gw3 AUTOMATIC_RECONNECTION;
    public static final gw3 FORCE_RECONNECTION;
    public static final gw3 INITIAL_CONNECTION;

    /* JADX WARN: Type inference failed for: r0v0, types: [gw3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gw3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [gw3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("INITIAL_CONNECTION", 0);
        INITIAL_CONNECTION = r0;
        ?? r1 = new Enum("AUTOMATIC_RECONNECTION", 1);
        AUTOMATIC_RECONNECTION = r1;
        ?? r2 = new Enum("FORCE_RECONNECTION", 2);
        FORCE_RECONNECTION = r2;
        gw3[] gw3VarArr = {r0, r1, r2};
        $VALUES = gw3VarArr;
        $ENTRIES = new wg7(gw3VarArr);
    }

    public static gw3 valueOf(String str) {
        return (gw3) Enum.valueOf(gw3.class, str);
    }

    public static gw3[] values() {
        return (gw3[]) $VALUES.clone();
    }
}
