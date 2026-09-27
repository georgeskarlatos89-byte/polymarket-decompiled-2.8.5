package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l13 {
    private static final /* synthetic */ l13[] $VALUES;
    public static final l13 CLOSED;
    public static final l13 CLOSING;
    public static final l13 OPEN;
    public static final l13 OPENING;
    public static final l13 PENDING_OPEN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l13] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l13] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l13] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, l13] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, l13] */
    static {
        ?? r0 = new Enum("PENDING_OPEN", 0);
        PENDING_OPEN = r0;
        ?? r1 = new Enum("OPENING", 1);
        OPENING = r1;
        ?? r2 = new Enum("OPEN", 2);
        OPEN = r2;
        ?? r3 = new Enum("CLOSING", 3);
        CLOSING = r3;
        ?? r4 = new Enum("CLOSED", 4);
        CLOSED = r4;
        $VALUES = new l13[]{r0, r1, r2, r3, r4};
    }

    public static l13 valueOf(String str) {
        return (l13) Enum.valueOf(l13.class, str);
    }

    public static l13[] values() {
        return (l13[]) $VALUES.clone();
    }
}
