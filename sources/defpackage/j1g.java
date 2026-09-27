package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j1g {
    private static final /* synthetic */ j1g[] $VALUES;
    public static final j1g HIGH;
    public static final j1g IMMEDIATE;
    public static final j1g LOW;
    public static final j1g NORMAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [j1g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j1g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [j1g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [j1g, java.lang.Enum] */
    static {
        ?? r0 = new Enum("LOW", 0);
        LOW = r0;
        ?? r1 = new Enum("NORMAL", 1);
        NORMAL = r1;
        ?? r2 = new Enum("HIGH", 2);
        HIGH = r2;
        ?? r3 = new Enum("IMMEDIATE", 3);
        IMMEDIATE = r3;
        $VALUES = new j1g[]{r0, r1, r2, r3};
    }

    public static j1g valueOf(String str) {
        return (j1g) Enum.valueOf(j1g.class, str);
    }

    public static j1g[] values() {
        return (j1g[]) $VALUES.clone();
    }
}
