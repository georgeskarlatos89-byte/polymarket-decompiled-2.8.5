package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lqb {
    private static final /* synthetic */ lqb[] $VALUES;
    public static final lqb COMPUTING;
    public static final lqb NOT_COMPUTED;
    public static final lqb RECURSION_WAS_DETECTED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lqb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lqb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, lqb] */
    static {
        ?? r0 = new Enum("NOT_COMPUTED", 0);
        NOT_COMPUTED = r0;
        ?? r1 = new Enum("COMPUTING", 1);
        COMPUTING = r1;
        ?? r2 = new Enum("RECURSION_WAS_DETECTED", 2);
        RECURSION_WAS_DETECTED = r2;
        $VALUES = new lqb[]{r0, r1, r2};
    }

    public static lqb valueOf(String str) {
        return (lqb) Enum.valueOf(lqb.class, str);
    }

    public static lqb[] values() {
        return (lqb[]) $VALUES.clone();
    }
}
