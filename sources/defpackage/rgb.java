package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rgb {
    public StringBuilder e;
    public String f;
    public char g;
    public StringBuilder h;
    public qgb a = qgb.START_DEFINITION;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean i = false;

    /* JADX WARN: Type inference failed for: r3v0, types: [o8d, java.lang.Object, ogb] */
    public final void a() {
        String str;
        if (!this.i) {
            return;
        }
        String b = wj7.b(this.f);
        StringBuilder sb = this.h;
        if (sb != null) {
            str = wj7.b(sb.toString());
        } else {
            str = null;
        }
        String sb2 = this.e.toString();
        ?? o8dVar = new o8d();
        o8dVar.g = sb2;
        o8dVar.h = b;
        o8dVar.i = str;
        ArrayList arrayList = this.d;
        o8dVar.d(arrayList);
        arrayList.clear();
        this.c.add(o8dVar);
        this.e = null;
        this.i = false;
        this.f = null;
        this.h = null;
    }
}
