package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qee {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qee[] $VALUES;
    public static final qee AlwaysDark;
    public static final qee AlwaysLight;
    public static final qee Automatic;
    public static final pee Companion;

    /* renamed from: default, reason: not valid java name */
    private static final qee f414default;

    /* JADX WARN: Type inference failed for: r0v0, types: [qee, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qee, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v3, types: [pee, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qee, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Automatic", 0);
        Automatic = r0;
        ?? r1 = new Enum("AlwaysLight", 1);
        AlwaysLight = r1;
        ?? r2 = new Enum("AlwaysDark", 2);
        AlwaysDark = r2;
        qee[] qeeVarArr = {r0, r1, r2};
        $VALUES = qeeVarArr;
        $ENTRIES = new wg7(qeeVarArr);
        Companion = new Object();
        f414default = r0;
    }

    public static final /* synthetic */ qee a() {
        return f414default;
    }

    public static qee valueOf(String str) {
        return (qee) Enum.valueOf(qee.class, str);
    }

    public static qee[] values() {
        return (qee[]) $VALUES.clone();
    }
}
