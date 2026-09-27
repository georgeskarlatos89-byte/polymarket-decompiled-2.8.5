package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class z2 {
    private static final /* synthetic */ z2[] $VALUES;
    public static final z2 DONE;
    public static final z2 FAILED;
    public static final z2 NOT_READY;
    public static final z2 READY;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, z2] */
    static {
        ?? r0 = new Enum("READY", 0);
        READY = r0;
        ?? r1 = new Enum("NOT_READY", 1);
        NOT_READY = r1;
        ?? r2 = new Enum("DONE", 2);
        DONE = r2;
        ?? r3 = new Enum("FAILED", 3);
        FAILED = r3;
        $VALUES = new z2[]{r0, r1, r2, r3};
    }

    public static z2 valueOf(String str) {
        return (z2) Enum.valueOf(z2.class, str);
    }

    public static z2[] values() {
        return (z2[]) $VALUES.clone();
    }
}
