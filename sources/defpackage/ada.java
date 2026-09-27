package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ada {
    public static final yca d = new ada(new oda(false, false, false, false, true, "    ", false, "type", false, true, y34.POLYMORPHIC), uxg.a);
    public final oda a;
    public final sxg b;
    public final uhl c = new uhl(28);

    public ada(oda odaVar, sxg sxgVar) {
        this.a = odaVar;
        this.b = sxgVar;
    }

    public final Object a(KSerializer kSerializer, bea beaVar) {
        Decoder mfaVar;
        beaVar.getClass();
        if (beaVar instanceof bfa) {
            mfaVar = new fga(this, (bfa) beaVar, (String) null, 12);
        } else if (beaVar instanceof fda) {
            mfaVar = new gga(this, (fda) beaVar);
        } else {
            if (!(beaVar instanceof uea) && !Intrinsics.areEqual(beaVar, xea.INSTANCE)) {
                dmk.a();
                return null;
            }
            mfaVar = new mfa(this, (kfa) beaVar, null);
        }
        return mfaVar.q(kSerializer);
    }

    public final Object b(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        str.getClass();
        t1i t1iVar = new t1i(str);
        Object q = new a1i(this, upk.OBJ, t1iVar, kSerializer.getDescriptor(), null).q(kSerializer);
        t1iVar.o();
        return q;
    }

    public final String c(KSerializer kSerializer, Object obj) {
        char[] cArr;
        Object removeLast;
        kSerializer.getClass();
        v0h v0hVar = new v0h((char) 0, 9);
        ui3 ui3Var = ui3.c;
        synchronized (ui3Var) {
            vk0 vk0Var = ui3Var.a;
            cArr = null;
            if (vk0Var.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = vk0Var.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                ui3Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        v0hVar.c = cArr;
        try {
            upk upkVar = upk.OBJ;
            jea[] jeaVarArr = new jea[upk.a().size()];
            upkVar.getClass();
            new c1i(new a56(v0hVar), this, upkVar, jeaVarArr).o(kSerializer, obj);
            return v0hVar.toString();
        } finally {
            v0hVar.v();
        }
    }
}
