package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hha {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ hha[] $VALUES;
    public static final hha FALLBACK;
    public static final hha FROM_CLASS_LOADER;
    public static final hha FROM_DEPENDENCIES;

    /* JADX WARN: Type inference failed for: r0v0, types: [hha, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hha, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hha, java.lang.Enum] */
    static {
        ?? r0 = new Enum("FROM_DEPENDENCIES", 0);
        FROM_DEPENDENCIES = r0;
        ?? r1 = new Enum("FROM_CLASS_LOADER", 1);
        FROM_CLASS_LOADER = r1;
        ?? r2 = new Enum("FALLBACK", 2);
        FALLBACK = r2;
        hha[] hhaVarArr = {r0, r1, r2};
        $VALUES = hhaVarArr;
        $ENTRIES = new wg7(hhaVarArr);
    }

    public static hha valueOf(String str) {
        return (hha) Enum.valueOf(hha.class, str);
    }

    public static hha[] values() {
        return (hha[]) $VALUES.clone();
    }
}
