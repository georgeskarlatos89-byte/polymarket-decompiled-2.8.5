package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zom implements pyf, yym, qhn {
    public Object a;

    public /* synthetic */ zom(Object obj) {
        this.a = obj;
    }

    public void a(int i, Object obj, g2n g2nVar) {
        gom gomVar = (gom) this.a;
        gomVar.l(i, 3);
        g2nVar.b((jzm) obj, gomVar.a);
        gomVar.l(i, 4);
    }

    @Override // defpackage.pyf
    public void accept(Object obj, Object obj2) {
        gtm gtmVar = (gtm) ((ltm) obj).getService();
        gpm gpmVar = new gpm((qrm) this.a, (epi) obj2);
        Parcel L = gtmVar.L();
        dhl.c(L, gpmVar);
        gtmVar.N(L, 27);
    }

    @Override // defpackage.qhn
    public void b(Bundle bundle, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        lgn lgnVar = (lgn) this.a;
        if (isEmpty) {
            kfm kfmVar = lgnVar.l;
            if (kfmVar != null) {
                c7m c7mVar = kfmVar.f;
                kfm.g(c7mVar);
                c7mVar.f.b(str2, "AppId not known when logging event");
                return;
            }
            return;
        }
        lgnVar.K().p1(new w93(this, str, str2, bundle, 13));
    }

    @Override // defpackage.yym
    public z1n c(Class cls) {
        for (int i = 0; i < 2; i++) {
            yym yymVar = ((yym[]) this.a)[i];
            if (yymVar.d(cls)) {
                return yymVar.c(cls);
            }
        }
        py2.f("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.yym
    public boolean d(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((yym[]) this.a)[i].d(cls)) {
                return true;
            }
        }
        return false;
    }

    public void e(int i, Object obj, g2n g2nVar) {
        jzm jzmVar = (jzm) obj;
        gom gomVar = (gom) this.a;
        gomVar.n((i << 3) | 2);
        gomVar.n(((djm) jzmVar).a(g2nVar));
        g2nVar.b(jzmVar, gomVar.a);
    }
}
