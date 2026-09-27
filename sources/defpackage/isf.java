package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class isf {
    private static final /* synthetic */ isf[] $VALUES;
    public static final isf ALLOW;
    public static final isf PREVENT;
    public static final isf PREVENT_WHEN_EMPTY;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, isf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, isf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, isf] */
    static {
        ?? r0 = new Enum("ALLOW", 0);
        ALLOW = r0;
        ?? r1 = new Enum("PREVENT_WHEN_EMPTY", 1);
        PREVENT_WHEN_EMPTY = r1;
        ?? r2 = new Enum("PREVENT", 2);
        PREVENT = r2;
        $VALUES = new isf[]{r0, r1, r2};
    }

    public static isf valueOf(String str) {
        return (isf) Enum.valueOf(isf.class, str);
    }

    public static isf[] values() {
        return (isf[]) $VALUES.clone();
    }
}
