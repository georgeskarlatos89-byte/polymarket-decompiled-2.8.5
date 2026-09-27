package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class mvf {
    private static final /* synthetic */ mvf[] $VALUES;
    public static final mvf ALLOW;
    public static final mvf BLOCK_ALL;
    public static final mvf BLOCK_INACCESSIBLE;
    public static final mvf INDECISIVE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mvf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mvf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mvf] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, mvf] */
    static {
        ?? r0 = new Enum("ALLOW", 0);
        ALLOW = r0;
        ?? r1 = new Enum("INDECISIVE", 1);
        INDECISIVE = r1;
        ?? r2 = new Enum("BLOCK_INACCESSIBLE", 2);
        BLOCK_INACCESSIBLE = r2;
        ?? r3 = new Enum("BLOCK_ALL", 3);
        BLOCK_ALL = r3;
        $VALUES = new mvf[]{r0, r1, r2, r3};
    }

    public static mvf valueOf(String str) {
        return (mvf) Enum.valueOf(mvf.class, str);
    }

    public static mvf[] values() {
        return (mvf[]) $VALUES.clone();
    }
}
