package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lka {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ lka[] $VALUES;
    public static final lka CONTEXT;
    public static final lka EXTENSION_RECEIVER;
    public static final lka INSTANCE;
    public static final lka VALUE;

    /* JADX WARN: Type inference failed for: r0v0, types: [lka, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [lka, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [lka, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [lka, java.lang.Enum] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        INSTANCE = r0;
        ?? r1 = new Enum("CONTEXT", 1);
        CONTEXT = r1;
        ?? r2 = new Enum("EXTENSION_RECEIVER", 2);
        EXTENSION_RECEIVER = r2;
        ?? r3 = new Enum("VALUE", 3);
        VALUE = r3;
        lka[] lkaVarArr = {r0, r1, r2, r3};
        $VALUES = lkaVarArr;
        $ENTRIES = new wg7(lkaVarArr);
    }

    public static lka valueOf(String str) {
        return (lka) Enum.valueOf(lka.class, str);
    }

    public static lka[] values() {
        return (lka[]) $VALUES.clone();
    }
}
