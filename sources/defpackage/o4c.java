package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class o4c {
    private static final /* synthetic */ o4c[] $VALUES;
    public static final o4c DAY;
    public static final o4c YEAR;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o4c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, o4c] */
    static {
        ?? r0 = new Enum("DAY", 0);
        DAY = r0;
        ?? r1 = new Enum("YEAR", 1);
        YEAR = r1;
        $VALUES = new o4c[]{r0, r1};
    }

    public static o4c valueOf(String str) {
        return (o4c) Enum.valueOf(o4c.class, str);
    }

    public static o4c[] values() {
        return (o4c[]) $VALUES.clone();
    }
}
