package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vm2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vm2[] $VALUES;
    public static final vm2 Leading;
    public static final vm2 Trailing;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vm2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vm2] */
    static {
        ?? r0 = new Enum("Leading", 0);
        Leading = r0;
        ?? r1 = new Enum("Trailing", 1);
        Trailing = r1;
        vm2[] vm2VarArr = {r0, r1};
        $VALUES = vm2VarArr;
        $ENTRIES = new wg7(vm2VarArr);
    }

    public static vm2 valueOf(String str) {
        return (vm2) Enum.valueOf(vm2.class, str);
    }

    public static vm2[] values() {
        return (vm2[]) $VALUES.clone();
    }
}
