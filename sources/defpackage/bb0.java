package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bb0 {
    private static final /* synthetic */ bb0[] $VALUES;
    public static final bb0 FUNCTION;
    public static final bb0 PROPERTY;
    public static final bb0 PROPERTY_GETTER;
    public static final bb0 PROPERTY_SETTER;

    /* JADX WARN: Type inference failed for: r0v0, types: [bb0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bb0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bb0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [bb0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("FUNCTION", 0);
        FUNCTION = r0;
        ?? r1 = new Enum("PROPERTY", 1);
        PROPERTY = r1;
        ?? r2 = new Enum("PROPERTY_GETTER", 2);
        PROPERTY_GETTER = r2;
        ?? r3 = new Enum("PROPERTY_SETTER", 3);
        PROPERTY_SETTER = r3;
        $VALUES = new bb0[]{r0, r1, r2, r3};
    }

    public static bb0 valueOf(String str) {
        return (bb0) Enum.valueOf(bb0.class, str);
    }

    public static bb0[] values() {
        return (bb0[]) $VALUES.clone();
    }
}
