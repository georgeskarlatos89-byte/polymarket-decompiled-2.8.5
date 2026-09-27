package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class s25 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ s25[] $VALUES;
    public static final s25 Email;
    public static final s25 Name;
    public static final s25 Phone;

    static {
        s25 s25Var = new s25() { // from class: q25
            @Override // defpackage.s25
            public final sce a(uce uceVar) {
                uceVar.getClass();
                return uceVar.a;
            }

            @Override // defpackage.s25
            public final umg b(LinkedHashMap linkedHashMap) {
                return new lsc().c.g(linkedHashMap);
            }
        };
        Name = s25Var;
        s25 s25Var2 = new s25() { // from class: r25
            @Override // defpackage.s25
            public final sce a(uce uceVar) {
                uceVar.getClass();
                return uceVar.b;
            }

            @Override // defpackage.s25
            public final umg b(LinkedHashMap linkedHashMap) {
                return new vle().g(linkedHashMap);
            }
        };
        Phone = s25Var2;
        s25 s25Var3 = new s25() { // from class: p25
            @Override // defpackage.s25
            public final sce a(uce uceVar) {
                uceVar.getClass();
                return uceVar.c;
            }

            @Override // defpackage.s25
            public final umg b(LinkedHashMap linkedHashMap) {
                return new g97().g(linkedHashMap);
            }
        };
        Email = s25Var3;
        s25[] s25VarArr = {s25Var, s25Var2, s25Var3};
        $VALUES = s25VarArr;
        $ENTRIES = new wg7(s25VarArr);
    }

    public static ug7 c() {
        return $ENTRIES;
    }

    public static s25 valueOf(String str) {
        return (s25) Enum.valueOf(s25.class, str);
    }

    public static s25[] values() {
        return (s25[]) $VALUES.clone();
    }

    public abstract sce a(uce uceVar);

    public abstract umg b(LinkedHashMap linkedHashMap);
}
