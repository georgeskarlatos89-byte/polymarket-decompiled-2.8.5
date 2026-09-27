package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class vca extends wca {
    public final /* synthetic */ wca b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vca(wca wcaVar, wca wcaVar2) {
        super(wcaVar2);
        this.b = wcaVar;
    }

    @Override // defpackage.wca
    public final void a(StringBuilder sb, Iterator it) {
        brn.m(it, "parts");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                sb.append(wca.d(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                sb.append((CharSequence) this.b.a);
                sb.append(wca.d(next2));
            }
        }
    }
}
