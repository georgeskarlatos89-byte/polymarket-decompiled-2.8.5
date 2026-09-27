package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cy6 {
    private static final /* synthetic */ cy6[] $VALUES;
    public static final cy6 MEMORY;
    public static final cy6 QUALITY;

    /* JADX WARN: Type inference failed for: r0v0, types: [cy6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cy6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("MEMORY", 0);
        MEMORY = r0;
        ?? r1 = new Enum("QUALITY", 1);
        QUALITY = r1;
        $VALUES = new cy6[]{r0, r1};
    }

    public static cy6 valueOf(String str) {
        return (cy6) Enum.valueOf(cy6.class, str);
    }

    public static cy6[] values() {
        return (cy6[]) $VALUES.clone();
    }
}
