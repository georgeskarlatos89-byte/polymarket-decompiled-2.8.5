package defpackage;

import kotlin.jvm.functions.Function1;
import skip.lib.Dictionary;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class os6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dictionary b;
    public final /* synthetic */ Object c;

    public /* synthetic */ os6(Dictionary dictionary, Object obj, int i) {
        this.a = i;
        this.b = dictionary;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Dictionary dictionary = this.b;
        switch (i) {
            case 0:
                return Dictionary.a(dictionary, obj2, obj);
            default:
                return Dictionary.b(dictionary, obj2, obj);
        }
    }
}
