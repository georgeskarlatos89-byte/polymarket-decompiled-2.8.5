package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pje {
    private static final /* synthetic */ pje[] $VALUES;
    public static final pje ATTEMPT_MIGRATION;
    public static final pje NOT_GENERATED;
    public static final pje REGISTERED;
    public static final pje REGISTER_ERROR;
    public static final pje UNREGISTERED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pje] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pje] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pje] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, pje] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, pje] */
    static {
        ?? r0 = new Enum("ATTEMPT_MIGRATION", 0);
        ATTEMPT_MIGRATION = r0;
        ?? r1 = new Enum("NOT_GENERATED", 1);
        NOT_GENERATED = r1;
        ?? r2 = new Enum("UNREGISTERED", 2);
        UNREGISTERED = r2;
        ?? r3 = new Enum("REGISTERED", 3);
        REGISTERED = r3;
        ?? r4 = new Enum("REGISTER_ERROR", 4);
        REGISTER_ERROR = r4;
        $VALUES = new pje[]{r0, r1, r2, r3, r4};
    }

    public static pje valueOf(String str) {
        return (pje) Enum.valueOf(pje.class, str);
    }

    public static pje[] values() {
        return (pje[]) $VALUES.clone();
    }
}
