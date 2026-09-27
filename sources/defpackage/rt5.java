package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rt5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rt5[] $VALUES;
    public static final qt5 Companion;
    public static final rt5 DMY;
    public static final rt5 MDY;
    public static final rt5 YMD;
    private final List<zs5> fields;

    /* JADX WARN: Type inference failed for: r0v2, types: [qt5, java.lang.Object] */
    static {
        zs5 zs5Var = zs5.DAY;
        zs5 zs5Var2 = zs5.MONTH;
        zs5 zs5Var3 = zs5.YEAR;
        rt5 rt5Var = new rt5("DMY", 0, CollectionsKt.listOf(zs5Var, zs5Var2, zs5Var3));
        DMY = rt5Var;
        rt5 rt5Var2 = new rt5("MDY", 1, CollectionsKt.listOf(zs5Var2, zs5Var, zs5Var3));
        MDY = rt5Var2;
        rt5 rt5Var3 = new rt5("YMD", 2, CollectionsKt.listOf(zs5Var3, zs5Var2, zs5Var));
        YMD = rt5Var3;
        rt5[] rt5VarArr = {rt5Var, rt5Var2, rt5Var3};
        $VALUES = rt5VarArr;
        $ENTRIES = new wg7(rt5VarArr);
        Companion = new Object();
    }

    public rt5(String str, int i, List list) {
        this.fields = list;
    }

    public static rt5 valueOf(String str) {
        return (rt5) Enum.valueOf(rt5.class, str);
    }

    public static rt5[] values() {
        return (rt5[]) $VALUES.clone();
    }

    public final List a() {
        return this.fields;
    }
}
