package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lgh {
    private static final /* synthetic */ lgh[] $VALUES;
    public static final lgh ADDING;
    public static final lgh NONE;
    public static final lgh REMOVING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lgh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lgh] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, lgh] */
    static {
        ?? r0 = new Enum("NONE", 0);
        NONE = r0;
        ?? r1 = new Enum("ADDING", 1);
        ADDING = r1;
        ?? r2 = new Enum("REMOVING", 2);
        REMOVING = r2;
        $VALUES = new lgh[]{r0, r1, r2};
    }

    public static lgh valueOf(String str) {
        return (lgh) Enum.valueOf(lgh.class, str);
    }

    public static lgh[] values() {
        return (lgh[]) $VALUES.clone();
    }
}
