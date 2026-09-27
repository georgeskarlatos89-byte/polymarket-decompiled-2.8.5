package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eo8 extends pcj {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ go8 e;

    public eo8(go8 go8Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = go8Var;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.pcj, defpackage.fcj
    public final void e(gcj gcjVar) {
        gcjVar.B(this);
    }

    @Override // defpackage.pcj, defpackage.fcj
    public final void f(gcj gcjVar) {
        go8 go8Var = this.e;
        Object obj = this.a;
        if (obj != null) {
            go8Var.z(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            go8Var.z(obj2, this.d, null);
        }
    }
}
