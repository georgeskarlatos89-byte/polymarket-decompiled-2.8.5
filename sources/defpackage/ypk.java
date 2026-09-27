package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ypk {
    private static final /* synthetic */ ypk[] $VALUES;
    public static final ypk ASCENDING;
    public static final ypk DESCENDING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ypk] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ypk] */
    static {
        ?? r0 = new Enum("ASCENDING", 0);
        ASCENDING = r0;
        ?? r1 = new Enum("DESCENDING", 1);
        DESCENDING = r1;
        $VALUES = new ypk[]{r0, r1};
    }

    public static ypk valueOf(String str) {
        return (ypk) Enum.valueOf(ypk.class, str);
    }

    public static ypk[] values() {
        return (ypk[]) $VALUES.clone();
    }
}
