package defpackage;

import com.checkout.components.wallet.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m4e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ m4e[] $VALUES;
    public static final m4e Deferred;
    public static final m4e Standard;
    private final String paramValue;

    static {
        m4e m4eVar = new m4e("Standard", 0, BuildConfig.FLAVOR);
        Standard = m4eVar;
        m4e m4eVar2 = new m4e("Deferred", 1, "deferred");
        Deferred = m4eVar2;
        m4e[] m4eVarArr = {m4eVar, m4eVar2};
        $VALUES = m4eVarArr;
        $ENTRIES = new wg7(m4eVarArr);
    }

    public m4e(String str, int i, String str2) {
        this.paramValue = str2;
    }

    public static m4e valueOf(String str) {
        return (m4e) Enum.valueOf(m4e.class, str);
    }

    public static m4e[] values() {
        return (m4e[]) $VALUES.clone();
    }

    public final String a() {
        return this.paramValue;
    }
}
