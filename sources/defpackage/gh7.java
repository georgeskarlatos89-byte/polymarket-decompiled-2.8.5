package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gh7 {
    private static final /* synthetic */ gh7[] $VALUES;
    public static final gh7 LIVE;
    public static final gh7 SANDBOX;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gh7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gh7] */
    static {
        ?? r0 = new Enum("LIVE", 0);
        LIVE = r0;
        ?? r1 = new Enum("SANDBOX", 1);
        SANDBOX = r1;
        $VALUES = new gh7[]{r0, r1};
    }

    public static gh7 valueOf(String str) {
        return (gh7) Enum.valueOf(gh7.class, str);
    }

    public static gh7[] values() {
        return (gh7[]) $VALUES.clone();
    }
}
