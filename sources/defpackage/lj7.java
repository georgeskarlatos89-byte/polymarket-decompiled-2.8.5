package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class lj7 {
    private static final /* synthetic */ lj7[] $VALUES;
    public static final lj7 CONTINUE;
    public static final lj7 THROW;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lj7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lj7] */
    static {
        ?? r0 = new Enum("THROW", 0);
        THROW = r0;
        ?? r1 = new Enum("CONTINUE", 1);
        CONTINUE = r1;
        $VALUES = new lj7[]{r0, r1};
    }

    public static lj7 valueOf(String str) {
        return (lj7) Enum.valueOf(lj7.class, str);
    }

    public static lj7[] values() {
        return (lj7[]) $VALUES.clone();
    }
}
