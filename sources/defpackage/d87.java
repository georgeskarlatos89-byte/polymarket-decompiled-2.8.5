package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class d87 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kgf b;

    public /* synthetic */ d87(kgf kgfVar, int i) {
        this.a = i;
        this.b = kgfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        kgf kgfVar = this.b;
        switch (i) {
            case 0:
                Object obj = kgfVar.get();
                obj.getClass();
                return (String) obj;
            case 1:
                return ((m2e) kgfVar.get()).a;
            case 2:
                return ((m2e) kgfVar.get()).b;
            case 3:
                return ((m2e) kgfVar.get()).a;
            default:
                return ((m2e) kgfVar.get()).b;
        }
    }
}
