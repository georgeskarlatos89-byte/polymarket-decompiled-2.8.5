package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k5j extends ibk {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public k5j(gbk gbkVar) {
        this.a = 1;
        this.d = gbkVar;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.ibk, defpackage.hbk
    public void a() {
        switch (this.a) {
            case 0:
                this.b = true;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ibk, defpackage.hbk
    public final void b() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((l5j) obj).a.setVisibility(0);
                return;
            default:
                if (!this.b) {
                    this.b = true;
                    hbk hbkVar = ((gbk) obj).d;
                    if (hbkVar != null) {
                        hbkVar.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.hbk
    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((l5j) obj).a.setVisibility(this.c);
                    return;
                }
                return;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                gbk gbkVar = (gbk) obj;
                if (i2 == gbkVar.a.size()) {
                    hbk hbkVar = gbkVar.d;
                    if (hbkVar != null) {
                        hbkVar.c();
                    }
                    this.c = 0;
                    this.b = false;
                    gbkVar.e = false;
                    return;
                }
                return;
        }
    }

    public k5j(l5j l5jVar, int i) {
        this.a = 0;
        this.d = l5jVar;
        this.c = i;
        this.b = false;
    }
}
