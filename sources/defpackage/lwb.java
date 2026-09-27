package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class lwb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ lwb[] $VALUES;
    public static final lwb Large;
    public static final lwb Medium;
    public static final lwb Small;
    private final float dimension;

    static {
        lwb lwbVar = new lwb(ufh.e(DesignTokens.Size.medium), 0, "Small");
        Small = lwbVar;
        lwb lwbVar2 = new lwb(ufh.e(DesignTokens.Size.xl), 1, "Medium");
        Medium = lwbVar2;
        lwb lwbVar3 = new lwb(ufh.e(DesignTokens.Size.twoXL), 2, "Large");
        Large = lwbVar3;
        lwb[] lwbVarArr = {lwbVar, lwbVar2, lwbVar3};
        $VALUES = lwbVarArr;
        $ENTRIES = new wg7(lwbVarArr);
    }

    public lwb(float f, int i, String str) {
        this.dimension = f;
    }

    public static lwb valueOf(String str) {
        return (lwb) Enum.valueOf(lwb.class, str);
    }

    public static lwb[] values() {
        return (lwb[]) $VALUES.clone();
    }

    public final float a() {
        return this.dimension;
    }
}
