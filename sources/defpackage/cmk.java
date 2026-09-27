package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class cmk {
    public static final bpc a;
    public static final amk[] b;

    static {
        bpc bpcVar = new bpc(8);
        amk.a.getClass();
        bmk bmkVar = zlk.g;
        bpcVar.i(1, bmkVar);
        bmk bmkVar2 = zlk.f;
        bpcVar.i(2, bmkVar2);
        bmk bmkVar3 = zlk.b;
        bpcVar.i(4, bmkVar3);
        bmk bmkVar4 = zlk.d;
        bpcVar.i(8, bmkVar4);
        bmk bmkVar5 = zlk.h;
        bpcVar.i(16, bmkVar5);
        bmk bmkVar6 = zlk.e;
        bpcVar.i(32, bmkVar6);
        bmk bmkVar7 = zlk.i;
        bpcVar.i(64, bmkVar7);
        bmk bmkVar8 = zlk.c;
        bpcVar.i(128, bmkVar8);
        a = bpcVar;
        b = new amk[]{bmkVar, bmkVar2, bmkVar3, bmkVar7, bmkVar5, bmkVar6, bmkVar4, zlk.j, bmkVar8};
    }

    public static final void a(jub jubVar, lx9 lx9Var, long j, int i, int i2) {
        if (!c3n.b(j, -1L)) {
            float f = (int) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
            float f2 = (int) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
            float f3 = i - ((int) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
            float f4 = i2 - ((int) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX));
            jubVar.b(lx9Var.b, f);
            jubVar.b(lx9Var.c, f2);
            jubVar.b(lx9Var.d, f3);
            jubVar.b(lx9Var.e, f4);
        }
    }
}
