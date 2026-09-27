package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kd7 {
    private static final /* synthetic */ kd7[] $VALUES;
    public static final kd7 NONE;
    public static final kd7 SOURCE;
    public static final kd7 TRANSFORMED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kd7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kd7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kd7] */
    static {
        ?? r0 = new Enum("SOURCE", 0);
        SOURCE = r0;
        ?? r1 = new Enum("TRANSFORMED", 1);
        TRANSFORMED = r1;
        ?? r2 = new Enum("NONE", 2);
        NONE = r2;
        $VALUES = new kd7[]{r0, r1, r2};
    }

    public static kd7 valueOf(String str) {
        return (kd7) Enum.valueOf(kd7.class, str);
    }

    public static kd7[] values() {
        return (kd7[]) $VALUES.clone();
    }
}
