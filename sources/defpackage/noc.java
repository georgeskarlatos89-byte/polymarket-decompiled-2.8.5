package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class noc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ noc[] $VALUES;
    public static final noc MUTABLE;
    public static final noc READ_ONLY;

    /* JADX WARN: Type inference failed for: r0v0, types: [noc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [noc, java.lang.Enum] */
    static {
        ?? r0 = new Enum("READ_ONLY", 0);
        READ_ONLY = r0;
        ?? r1 = new Enum("MUTABLE", 1);
        MUTABLE = r1;
        noc[] nocVarArr = {r0, r1};
        $VALUES = nocVarArr;
        $ENTRIES = new wg7(nocVarArr);
    }

    public static noc valueOf(String str) {
        return (noc) Enum.valueOf(noc.class, str);
    }

    public static noc[] values() {
        return (noc[]) $VALUES.clone();
    }
}
