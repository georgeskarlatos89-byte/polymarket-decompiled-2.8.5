package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ep5 {
    private static final /* synthetic */ ep5[] $VALUES;
    public static final ep5 DATA_DISK_CACHE;
    public static final ep5 LOCAL;
    public static final ep5 MEMORY_CACHE;
    public static final ep5 REMOTE;
    public static final ep5 RESOURCE_DISK_CACHE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ep5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ep5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ep5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ep5] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ep5] */
    static {
        ?? r0 = new Enum("LOCAL", 0);
        LOCAL = r0;
        ?? r1 = new Enum("REMOTE", 1);
        REMOTE = r1;
        ?? r2 = new Enum("DATA_DISK_CACHE", 2);
        DATA_DISK_CACHE = r2;
        ?? r3 = new Enum("RESOURCE_DISK_CACHE", 3);
        RESOURCE_DISK_CACHE = r3;
        ?? r4 = new Enum("MEMORY_CACHE", 4);
        MEMORY_CACHE = r4;
        $VALUES = new ep5[]{r0, r1, r2, r3, r4};
    }

    public static ep5 valueOf(String str) {
        return (ep5) Enum.valueOf(ep5.class, str);
    }

    public static ep5[] values() {
        return (ep5[]) $VALUES.clone();
    }
}
