package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xib extends yib {
    @Override // defpackage.yib
    public final void a(long j, Object obj) {
        ((u4) ((b5a) nvj.j(j, obj))).a = false;
    }

    @Override // defpackage.yib
    public final void b(long j, Object obj, Object obj2) {
        b5a b5aVar = (b5a) nvj.j(j, obj);
        b5a b5aVar2 = (b5a) nvj.j(j, obj2);
        int size = b5aVar.size();
        int size2 = b5aVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((u4) b5aVar).a) {
                b5aVar = b5aVar.q0(size2 + size);
            }
            b5aVar.addAll(b5aVar2);
        }
        if (size > 0) {
            b5aVar2 = b5aVar;
        }
        nvj.q(j, obj, b5aVar2);
    }

    @Override // defpackage.yib
    public final List c(long j, Object obj) {
        int i;
        b5a b5aVar = (b5a) nvj.j(j, obj);
        if (!((u4) b5aVar).a) {
            int size = b5aVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            b5a q0 = b5aVar.q0(i);
            nvj.q(j, obj, q0);
            return q0;
        }
        return b5aVar;
    }
}
