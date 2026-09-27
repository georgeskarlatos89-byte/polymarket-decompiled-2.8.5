package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wff {
    private static final /* synthetic */ wff[] $VALUES;
    public static final wff DEFAULT;
    public static final wff FIXED;
    public static final wff SIGNED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wff] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wff] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wff] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        DEFAULT = r0;
        ?? r1 = new Enum("SIGNED", 1);
        SIGNED = r1;
        ?? r2 = new Enum("FIXED", 2);
        FIXED = r2;
        $VALUES = new wff[]{r0, r1, r2};
    }

    public static wff valueOf(String str) {
        return (wff) Enum.valueOf(wff.class, str);
    }

    public static wff[] values() {
        return (wff[]) $VALUES.clone();
    }
}
