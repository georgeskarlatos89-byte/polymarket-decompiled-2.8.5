package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vcg extends wcg implements Iterator {
    public ucg a;
    public boolean b = true;
    public final /* synthetic */ xcg c;

    public vcg(xcg xcgVar) {
        this.c = xcgVar;
    }

    @Override // defpackage.wcg
    public final void a(ucg ucgVar) {
        boolean z;
        ucg ucgVar2 = this.a;
        if (ucgVar == ucgVar2) {
            ucg ucgVar3 = ucgVar2.d;
            this.a = ucgVar3;
            if (ucgVar3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            if (this.c.a != null) {
                return true;
            }
            return false;
        }
        ucg ucgVar = this.a;
        if (ucgVar != null && ucgVar.c != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ucg ucgVar;
        if (this.b) {
            this.b = false;
            ucg ucgVar2 = this.c.a;
            this.a = ucgVar2;
            return ucgVar2;
        }
        ucg ucgVar3 = this.a;
        if (ucgVar3 != null) {
            ucgVar = ucgVar3.c;
        } else {
            ucgVar = null;
        }
        this.a = ucgVar;
        return ucgVar;
    }
}
