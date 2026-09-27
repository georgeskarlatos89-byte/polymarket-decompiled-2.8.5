package defpackage;

import kotlin.text.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class rzf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rzf[] $VALUES;
    public static final rzf HTML;
    public static final rzf PLAIN;

    static {
        rzf rzfVar = new rzf() { // from class: qzf
            @Override // defpackage.rzf
            public final String a(String str) {
                return str;
            }
        };
        PLAIN = rzfVar;
        rzf rzfVar2 = new rzf() { // from class: pzf
            @Override // defpackage.rzf
            public final String a(String str) {
                return e.s(e.s(str, "<", "&lt;"), ">", "&gt;");
            }
        };
        HTML = rzfVar2;
        rzf[] rzfVarArr = {rzfVar, rzfVar2};
        $VALUES = rzfVarArr;
        $ENTRIES = new wg7(rzfVarArr);
    }

    public static rzf valueOf(String str) {
        return (rzf) Enum.valueOf(rzf.class, str);
    }

    public static rzf[] values() {
        return (rzf[]) $VALUES.clone();
    }

    public abstract String a(String str);
}
