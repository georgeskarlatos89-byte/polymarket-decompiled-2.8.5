package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class y3f extends ThreadLocal {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y3f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                z3f z3fVar = (z3f) obj;
                try {
                    oe7 oe7Var = oe7.c;
                    Mac mac = (Mac) oe7Var.a.getInstance(z3fVar.b);
                    mac.init(z3fVar.c);
                    return mac;
                } catch (GeneralSecurityException e) {
                    xbc.m(e);
                    return null;
                }
            default:
                return ((Function0) ((qje) obj).b).invoke();
        }
    }
}
