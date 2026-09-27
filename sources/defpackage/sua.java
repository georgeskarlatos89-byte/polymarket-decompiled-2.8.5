package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class sua {
    private static final /* synthetic */ sua[] $VALUES;
    public static final sua INVALID_RESPONSE_BODY;
    public static final sua NETWORK_FAILURE;
    public static final sua UNEXPECTED_RESPONSE_CODE;
    public static final sua UNEXPECTED_STREAM_ELEMENT_TYPE;
    public static final sua UNKNOWN_ERROR;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sua] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sua] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sua] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, sua] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, sua] */
    static {
        ?? r0 = new Enum("INVALID_RESPONSE_BODY", 0);
        INVALID_RESPONSE_BODY = r0;
        ?? r1 = new Enum("NETWORK_FAILURE", 1);
        NETWORK_FAILURE = r1;
        ?? r2 = new Enum("UNEXPECTED_STREAM_ELEMENT_TYPE", 2);
        UNEXPECTED_STREAM_ELEMENT_TYPE = r2;
        ?? r3 = new Enum("UNEXPECTED_RESPONSE_CODE", 3);
        UNEXPECTED_RESPONSE_CODE = r3;
        ?? r4 = new Enum("UNKNOWN_ERROR", 4);
        UNKNOWN_ERROR = r4;
        $VALUES = new sua[]{r0, r1, r2, r3, r4};
    }

    public static sua valueOf(String str) {
        return (sua) Enum.valueOf(sua.class, str);
    }

    public static sua[] values() {
        return (sua[]) $VALUES.clone();
    }
}
