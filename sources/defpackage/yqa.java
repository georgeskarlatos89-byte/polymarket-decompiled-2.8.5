package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yqa {
    public final ArrayList a;
    public final ArrayList b;

    public yqa(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                this.b = new ArrayList();
                return;
            default:
                this.a = new ArrayList(0);
                this.b = new ArrayList(0);
                return;
        }
    }

    public void a(ArrayList arrayList) {
        this.b.add(arrayList);
    }

    public void b(bpb bpbVar) {
        this.a.addAll(bpbVar.b);
        this.b.addAll(bpbVar.c);
    }
}
