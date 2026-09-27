package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tcg extends wcg implements Iterator {
    public ucg a;
    public ucg b;
    public final /* synthetic */ int c;

    public tcg(ucg ucgVar, ucg ucgVar2, int i) {
        this.c = i;
        this.a = ucgVar2;
        this.b = ucgVar;
    }

    @Override // defpackage.wcg
    public final void a(ucg ucgVar) {
        ucg ucgVar2;
        ucg ucgVar3 = this.a;
        ucg ucgVar4 = null;
        if (ucgVar3 == ucgVar && ucgVar == this.b) {
            this.b = null;
            this.a = null;
            ucgVar3 = null;
        }
        ucg ucgVar5 = ucgVar3;
        if (ucgVar3 == ucgVar) {
            switch (this.c) {
                case 0:
                    ucgVar2 = ucgVar3.d;
                    break;
                default:
                    ucgVar2 = ucgVar3.c;
                    break;
            }
            ucgVar5 = ucgVar2;
            this.a = ucgVar5;
        }
        ucg ucgVar6 = this.b;
        if (ucgVar6 == ucgVar) {
            if (ucgVar6 != ucgVar5 && ucgVar5 != null) {
                ucgVar4 = b(ucgVar6);
            }
            this.b = ucgVar4;
        }
    }

    public final ucg b(ucg ucgVar) {
        switch (this.c) {
            case 0:
                return ucgVar.c;
            default:
                return ucgVar.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ucg ucgVar;
        ucg ucgVar2 = this.b;
        ucg ucgVar3 = this.a;
        if (ucgVar2 != ucgVar3 && ucgVar3 != null) {
            ucgVar = b(ucgVar2);
        } else {
            ucgVar = null;
        }
        this.b = ucgVar;
        return ucgVar2;
    }
}
