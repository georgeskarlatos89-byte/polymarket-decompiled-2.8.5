package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vz2 {
    private static final /* synthetic */ vz2[] $VALUES;
    public static final vz2 CONVERGED;
    public static final vz2 FLASH_REQUIRED;
    public static final vz2 INACTIVE;
    public static final vz2 LOCKED;
    public static final vz2 SEARCHING;
    public static final vz2 UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vz2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vz2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vz2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, vz2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, vz2] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, vz2] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        UNKNOWN = r0;
        ?? r1 = new Enum("INACTIVE", 1);
        INACTIVE = r1;
        ?? r2 = new Enum("SEARCHING", 2);
        SEARCHING = r2;
        ?? r3 = new Enum("FLASH_REQUIRED", 3);
        FLASH_REQUIRED = r3;
        ?? r4 = new Enum("CONVERGED", 4);
        CONVERGED = r4;
        ?? r5 = new Enum("LOCKED", 5);
        LOCKED = r5;
        $VALUES = new vz2[]{r0, r1, r2, r3, r4, r5};
    }

    public static vz2 valueOf(String str) {
        return (vz2) Enum.valueOf(vz2.class, str);
    }

    public static vz2[] values() {
        return (vz2[]) $VALUES.clone();
    }
}
