package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iyj {
    private static final /* synthetic */ iyj[] $VALUES;
    public static final iyj ACTIVE;
    public static final iyj INACTIVE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, iyj] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, iyj] */
    static {
        ?? r0 = new Enum("ACTIVE", 0);
        ACTIVE = r0;
        ?? r1 = new Enum("INACTIVE", 1);
        INACTIVE = r1;
        $VALUES = new iyj[]{r0, r1};
    }

    public static iyj valueOf(String str) {
        return (iyj) Enum.valueOf(iyj.class, str);
    }

    public static iyj[] values() {
        return (iyj[]) $VALUES.clone();
    }
}
