package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class x85 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ x85[] $VALUES;
    public static final x85 ATOMIC;
    public static final x85 DEFAULT;
    public static final x85 LAZY;
    public static final x85 UNDISPATCHED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x85] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x85] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, x85] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, x85] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        DEFAULT = r0;
        ?? r1 = new Enum("LAZY", 1);
        LAZY = r1;
        ?? r2 = new Enum("ATOMIC", 2);
        ATOMIC = r2;
        ?? r3 = new Enum("UNDISPATCHED", 3);
        UNDISPATCHED = r3;
        x85[] x85VarArr = {r0, r1, r2, r3};
        $VALUES = x85VarArr;
        $ENTRIES = new wg7(x85VarArr);
    }

    public static x85 valueOf(String str) {
        return (x85) Enum.valueOf(x85.class, str);
    }

    public static x85[] values() {
        return (x85[]) $VALUES.clone();
    }
}
