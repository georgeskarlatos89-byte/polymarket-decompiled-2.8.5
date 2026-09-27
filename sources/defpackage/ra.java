package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ra extends ka {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ga d;

    public /* synthetic */ ra(sa saVar, String str, ga gaVar, int i) {
        this.a = i;
        this.b = saVar;
        this.c = str;
        this.d = gaVar;
    }

    @Override // defpackage.ka
    public final void a(Object obj, r9 r9Var) {
        int i = this.a;
        ga gaVar = this.d;
        String str = this.c;
        sa saVar = this.b;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = saVar.b;
                ArrayList arrayList = saVar.d;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    arrayList.add(str);
                    try {
                        saVar.b(intValue, gaVar, obj, r9Var);
                        return;
                    } catch (Exception e) {
                        arrayList.remove(str);
                        throw e;
                    }
                }
                xbc.h(gaVar, " and input ", "Attempting to launch an unregistered ActivityResultLauncher with contract ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            default:
                ArrayList arrayList2 = saVar.d;
                Object obj3 = saVar.b.get(str);
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    arrayList2.add(str);
                    try {
                        saVar.b(intValue2, gaVar, obj, r9Var);
                        return;
                    } catch (Exception e2) {
                        arrayList2.remove(str);
                        throw e2;
                    }
                }
                xbc.h(gaVar, " and input ", "Attempting to launch an unregistered ActivityResultLauncher with contract ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
        }
    }

    @Override // defpackage.ka
    public final void b() {
        int i = this.a;
        String str = this.c;
        sa saVar = this.b;
        switch (i) {
            case 0:
                saVar.f(str);
                return;
            default:
                saVar.f(str);
                return;
        }
    }
}
