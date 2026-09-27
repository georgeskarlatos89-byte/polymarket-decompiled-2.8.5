package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class opa {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ opa[] $VALUES;
    public static final opa Factory;
    public static final opa Scoped;
    public static final opa Singleton;

    /* JADX WARN: Type inference failed for: r0v0, types: [opa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [opa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [opa, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Singleton", 0);
        Singleton = r0;
        ?? r1 = new Enum("Factory", 1);
        Factory = r1;
        ?? r2 = new Enum("Scoped", 2);
        Scoped = r2;
        opa[] opaVarArr = {r0, r1, r2};
        $VALUES = opaVarArr;
        $ENTRIES = new wg7(opaVarArr);
    }

    public static opa valueOf(String str) {
        return (opa) Enum.valueOf(opa.class, str);
    }

    public static opa[] values() {
        return (opa[]) $VALUES.clone();
    }
}
