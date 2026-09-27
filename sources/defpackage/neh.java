package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class neh {
    private static final /* synthetic */ neh[] $VALUES;
    public static final neh INITIAL_VARIANTS;
    public static final neh LOCAL_STORAGE;

    /* JADX WARN: Type inference failed for: r0v0, types: [neh, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [neh, java.lang.Enum] */
    static {
        ?? r0 = new Enum("LOCAL_STORAGE", 0);
        LOCAL_STORAGE = r0;
        ?? r1 = new Enum("INITIAL_VARIANTS", 1);
        INITIAL_VARIANTS = r1;
        $VALUES = new neh[]{r0, r1};
    }

    public static neh valueOf(String str) {
        return (neh) Enum.valueOf(neh.class, str);
    }

    public static neh[] values() {
        return (neh[]) $VALUES.clone();
    }
}
