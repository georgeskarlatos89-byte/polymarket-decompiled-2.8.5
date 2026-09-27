package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class buc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ttc b;

    public /* synthetic */ buc(ttc ttcVar, int i) {
        this.a = i;
        this.b = ttcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.a;
        ttc ttcVar = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                contains = ttcVar.c().contains(str);
                break;
            default:
                str.getClass();
                contains = ttcVar.c().contains(str);
                break;
        }
        return Boolean.valueOf(!contains);
    }
}
