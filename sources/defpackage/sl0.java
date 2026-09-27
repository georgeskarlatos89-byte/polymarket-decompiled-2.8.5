package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.c;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sl0 implements Iterable, xja {
    public final /* synthetic */ int a;
    public final Object b;

    public sl0() {
        this.a = 1;
        this.b = new CopyOnWriteArrayList();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return wen.f((Object[]) obj);
            case 1:
                Iterator it = ((CopyOnWriteArrayList) obj).iterator();
                it.getClass();
                return it;
            case 2:
                return new c((Iterator) ((Function0) obj).invoke());
            case 3:
                return ((Sequence) obj).iterator();
            case 4:
                return new i3((tg7) obj);
            default:
                return new q2i((String) obj);
        }
    }

    public /* synthetic */ sl0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
