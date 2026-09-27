package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class er4 extends zak {
    public final /* synthetic */ int a;
    public final Object b;

    public er4() {
        this.a = 0;
        this.b = new ArrayList(3);
    }

    @Override // defpackage.zak
    public final void onPageScrollStateChanged(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((zak) it.next()).onPageScrollStateChanged(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    fi9.n("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            default:
                ((ln8) obj).b(false);
                return;
        }
    }

    @Override // defpackage.zak
    public void onPageScrolled(int i, float f, int i2) {
        switch (this.a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((zak) it.next()).onPageScrolled(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    fi9.n("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            default:
                super.onPageScrolled(i, f, i2);
                return;
        }
    }

    @Override // defpackage.zak
    public final void onPageSelected(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((zak) it.next()).onPageSelected(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    fi9.n("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            default:
                ((ln8) obj).b(false);
                return;
        }
    }

    public er4(ln8 ln8Var) {
        this.a = 1;
        this.b = ln8Var;
    }
}
