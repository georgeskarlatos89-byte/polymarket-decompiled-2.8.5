package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class iwm {
    public static final KSerializer[] a = new KSerializer[0];

    /* JADX WARN: Multi-variable type inference failed */
    public static final ita a(ita itaVar) {
        itaVar.getClass();
        if (itaVar instanceof oij) {
            return ((oij) itaVar).n();
        }
        return null;
    }

    public static final dwj b(dwj dwjVar, ita itaVar) {
        dwjVar.getClass();
        itaVar.getClass();
        return c(dwjVar, a(itaVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final dwj c(dwj dwjVar, ita itaVar) {
        dwjVar.getClass();
        if (dwjVar instanceof oij) {
            return c(((oij) dwjVar).G(), itaVar);
        }
        if (itaVar != null && !Intrinsics.areEqual(itaVar, dwjVar)) {
            if (dwjVar instanceof s7h) {
                return new w7h((s7h) dwjVar, itaVar);
            }
            if (dwjVar instanceof s78) {
                return new w78((s78) dwjVar, itaVar);
            }
            dmk.a();
            return null;
        }
        return dwjVar;
    }
}
