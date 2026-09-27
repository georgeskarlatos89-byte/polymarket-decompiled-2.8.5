package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class eaa {
    private static final /* synthetic */ eaa[] $VALUES;
    public static final eaa DECRYPTED;
    public static final eaa ENCRYPTED;
    public static final eaa UNENCRYPTED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eaa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eaa] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, eaa] */
    static {
        ?? r0 = new Enum("UNENCRYPTED", 0);
        UNENCRYPTED = r0;
        ?? r1 = new Enum("ENCRYPTED", 1);
        ENCRYPTED = r1;
        ?? r2 = new Enum("DECRYPTED", 2);
        DECRYPTED = r2;
        $VALUES = new eaa[]{r0, r1, r2};
    }

    public static eaa valueOf(String str) {
        return (eaa) Enum.valueOf(eaa.class, str);
    }

    public static eaa[] values() {
        return (eaa[]) $VALUES.clone();
    }
}
