package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class beh {
    private static final /* synthetic */ beh[] $VALUES;
    public static final beh CONSTANT;
    public static final beh ERROR;
    public static final beh SLACK;
    public static final beh UNKNOWN;
    public static final beh UNRESTRICTED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, beh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, beh] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, beh] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, beh] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, beh] */
    static {
        ?? r0 = new Enum("UNRESTRICTED", 0);
        UNRESTRICTED = r0;
        ?? r1 = new Enum("CONSTANT", 1);
        CONSTANT = r1;
        ?? r2 = new Enum("SLACK", 2);
        SLACK = r2;
        ?? r3 = new Enum("ERROR", 3);
        ERROR = r3;
        ?? r4 = new Enum("UNKNOWN", 4);
        UNKNOWN = r4;
        $VALUES = new beh[]{r0, r1, r2, r3, r4};
    }

    public static beh valueOf(String str) {
        return (beh) Enum.valueOf(beh.class, str);
    }

    public static beh[] values() {
        return (beh[]) $VALUES.clone();
    }
}
