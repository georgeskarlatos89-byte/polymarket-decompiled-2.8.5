package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ftk extends h1l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ftk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.h1l
    public final void b() {
        switch (this.b) {
            case 0:
                htk htkVar = (htk) ((dnc) this.c).b;
                htkVar.b.b("unlinkToDeath", new Object[0]);
                htkVar.n.asBinder().unlinkToDeath(htkVar.k, 0);
                htkVar.n = null;
                htkVar.g = false;
                return;
            default:
                synchronized (((htk) this.c).f) {
                    try {
                        if (((htk) this.c).l.get() > 0 && ((htk) this.c).l.decrementAndGet() > 0) {
                            ((htk) this.c).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        htk htkVar2 = (htk) this.c;
                        if (htkVar2.n != null) {
                            htkVar2.b.b("Unbind from service.", new Object[0]);
                            htk htkVar3 = (htk) this.c;
                            htkVar3.a.unbindService(htkVar3.m);
                            htkVar2 = (htk) this.c;
                            htkVar2.g = false;
                            htkVar2.n = null;
                            htkVar2.m = null;
                        }
                        htkVar2.d();
                        return;
                    } finally {
                    }
                }
        }
    }
}
