package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xpk {
    private static final /* synthetic */ xpk[] $VALUES;
    public static final xpk ASCENDING;
    public static final xpk DESCENDING;

    /* JADX WARN: Type inference failed for: r0v0, types: [xpk, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xpk, java.lang.Enum] */
    static {
        ?? r0 = new Enum("ASCENDING", 0);
        ASCENDING = r0;
        ?? r1 = new Enum("DESCENDING", 1);
        DESCENDING = r1;
        $VALUES = new xpk[]{r0, r1};
    }

    public static xpk valueOf(String str) {
        return (xpk) Enum.valueOf(xpk.class, str);
    }

    public static xpk[] values() {
        return (xpk[]) $VALUES.clone();
    }
}
