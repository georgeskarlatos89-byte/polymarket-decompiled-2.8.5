package defpackage;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qyk extends c9n {
    public static qyk l;
    public String c;
    public JSONObject d;
    public cxk e;
    public JSONArray f;
    public dxk g;
    public z3d h;
    public tzk i;
    public tzk j;
    public tzk k;

    public final void k(int i, z3d z3dVar) {
        try {
            Context context = (Context) z3dVar.d;
            if (i != 96) {
                if (i != 97) {
                    if (i == 102) {
                        this.e.getClass();
                        if (cxk.c.get(i)) {
                            this.k = new tzk(context, this.g, 2);
                            if (this.d.optBoolean(dwk.MG.toString(), false)) {
                                this.k.b();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.e.getClass();
                if (cxk.c.get(i)) {
                    this.j = new tzk(context, this.g, 4);
                    if (this.d.optBoolean(dwk.GY.toString(), false)) {
                        this.j.b();
                        return;
                    }
                    return;
                }
                return;
            }
            this.e.getClass();
            if (cxk.c.get(i)) {
                this.i = new tzk(context, this.g, 1);
                if (this.d.optBoolean(dwk.AC.toString(), false)) {
                    this.i.b();
                }
            }
        } catch (Exception e) {
            wsk.b(qyk.class, e);
        }
    }
}
