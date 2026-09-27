package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zpb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zpb[] $VALUES;
    public static final zpb GPS;
    public static final zpb NETWORK;
    public static final zpb PASSIVE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zpb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zpb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zpb] */
    static {
        ?? r0 = new Enum("GPS", 0);
        GPS = r0;
        ?? r1 = new Enum("NETWORK", 1);
        NETWORK = r1;
        ?? r2 = new Enum("PASSIVE", 2);
        PASSIVE = r2;
        zpb[] zpbVarArr = {r0, r1, r2};
        $VALUES = zpbVarArr;
        $ENTRIES = new wg7(zpbVarArr);
    }

    public static zpb valueOf(String str) {
        return (zpb) Enum.valueOf(zpb.class, str);
    }

    public static zpb[] values() {
        return (zpb[]) $VALUES.clone();
    }
}
