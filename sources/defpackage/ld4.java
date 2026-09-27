package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ld4 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ld4[] $VALUES;
    public static final kd4 Companion;
    public static final ld4 First;
    public static final ld4 Last;
    public static final ld4 Middle;
    public static final ld4 Single;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ld4] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kd4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ld4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ld4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ld4] */
    static {
        ?? r0 = new Enum("Single", 0);
        Single = r0;
        ?? r1 = new Enum("First", 1);
        First = r1;
        ?? r2 = new Enum("Middle", 2);
        Middle = r2;
        ?? r3 = new Enum("Last", 3);
        Last = r3;
        ld4[] ld4VarArr = {r0, r1, r2, r3};
        $VALUES = ld4VarArr;
        $ENTRIES = new wg7(ld4VarArr);
        Companion = new Object();
    }

    public static ld4 valueOf(String str) {
        return (ld4) Enum.valueOf(ld4.class, str);
    }

    public static ld4[] values() {
        return (ld4[]) $VALUES.clone();
    }
}
