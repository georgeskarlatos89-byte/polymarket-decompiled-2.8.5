package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kij {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kij[] $VALUES;
    public static final kij COMMON;
    public static final kij SUPERTYPE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kij] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kij] */
    static {
        ?? r0 = new Enum("SUPERTYPE", 0);
        SUPERTYPE = r0;
        ?? r1 = new Enum("COMMON", 1);
        COMMON = r1;
        kij[] kijVarArr = {r0, r1};
        $VALUES = kijVarArr;
        $ENTRIES = new wg7(kijVarArr);
    }

    public static kij valueOf(String str) {
        return (kij) Enum.valueOf(kij.class, str);
    }

    public static kij[] values() {
        return (kij[]) $VALUES.clone();
    }
}
