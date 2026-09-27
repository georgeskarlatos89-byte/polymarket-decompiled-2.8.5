package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qs8 {
    private static final /* synthetic */ qs8[] $VALUES;
    public static final qs8 BUILD_MESSAGE_INFO;
    public static final qs8 GET_DEFAULT_INSTANCE;
    public static final qs8 GET_MEMOIZED_IS_INITIALIZED;
    public static final qs8 GET_PARSER;
    public static final qs8 NEW_BUILDER;
    public static final qs8 NEW_MUTABLE_INSTANCE;
    public static final qs8 SET_MEMOIZED_IS_INITIALIZED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qs8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qs8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qs8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, qs8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, qs8] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, qs8] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, qs8] */
    static {
        ?? r0 = new Enum("GET_MEMOIZED_IS_INITIALIZED", 0);
        GET_MEMOIZED_IS_INITIALIZED = r0;
        ?? r1 = new Enum("SET_MEMOIZED_IS_INITIALIZED", 1);
        SET_MEMOIZED_IS_INITIALIZED = r1;
        ?? r2 = new Enum("BUILD_MESSAGE_INFO", 2);
        BUILD_MESSAGE_INFO = r2;
        ?? r3 = new Enum("NEW_MUTABLE_INSTANCE", 3);
        NEW_MUTABLE_INSTANCE = r3;
        ?? r4 = new Enum("NEW_BUILDER", 4);
        NEW_BUILDER = r4;
        ?? r5 = new Enum("GET_DEFAULT_INSTANCE", 5);
        GET_DEFAULT_INSTANCE = r5;
        ?? r6 = new Enum("GET_PARSER", 6);
        GET_PARSER = r6;
        $VALUES = new qs8[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static qs8 valueOf(String str) {
        return (qs8) Enum.valueOf(qs8.class, str);
    }

    public static qs8[] values() {
        return (qs8[]) $VALUES.clone();
    }
}
