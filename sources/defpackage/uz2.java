package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uz2 {
    private static final /* synthetic */ uz2[] $VALUES;
    public static final uz2 OFF;
    public static final uz2 ON;
    public static final uz2 ON_ALWAYS_FLASH;
    public static final uz2 ON_AUTO_FLASH;
    public static final uz2 ON_AUTO_FLASH_REDEYE;
    public static final uz2 ON_EXTERNAL_FLASH;
    public static final uz2 UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, uz2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, uz2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, uz2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, uz2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, uz2] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, uz2] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, uz2] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        UNKNOWN = r0;
        ?? r1 = new Enum("OFF", 1);
        OFF = r1;
        ?? r2 = new Enum("ON", 2);
        ON = r2;
        ?? r3 = new Enum("ON_AUTO_FLASH", 3);
        ON_AUTO_FLASH = r3;
        ?? r4 = new Enum("ON_ALWAYS_FLASH", 4);
        ON_ALWAYS_FLASH = r4;
        ?? r5 = new Enum("ON_AUTO_FLASH_REDEYE", 5);
        ON_AUTO_FLASH_REDEYE = r5;
        ?? r6 = new Enum("ON_EXTERNAL_FLASH", 6);
        ON_EXTERNAL_FLASH = r6;
        $VALUES = new uz2[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static uz2 valueOf(String str) {
        return (uz2) Enum.valueOf(uz2.class, str);
    }

    public static uz2[] values() {
        return (uz2[]) $VALUES.clone();
    }
}
