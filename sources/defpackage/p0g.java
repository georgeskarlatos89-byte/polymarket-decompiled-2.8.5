package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class p0g {
    private static final /* synthetic */ p0g[] $VALUES;
    public static final p0g Stderr;
    public static final p0g Stdout;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p0g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p0g] */
    static {
        ?? r0 = new Enum("Stderr", 0);
        Stderr = r0;
        ?? r1 = new Enum("Stdout", 1);
        Stdout = r1;
        $VALUES = new p0g[]{r0, r1};
    }

    public static p0g valueOf(String str) {
        return (p0g) Enum.valueOf(p0g.class, str);
    }

    public static p0g[] values() {
        return (p0g[]) $VALUES.clone();
    }
}
