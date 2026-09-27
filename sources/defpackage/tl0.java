package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tl0 implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;

    public tl0() {
        this.a = 7;
        this.b = new ArrayList();
    }

    public void c(Object obj, String str) {
        ((ArrayList) this.b).add(new m3k(str, obj));
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return wen.f((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new n27(this);
            case 3:
                return new c9b(this);
            case 4:
                return iwg.a((Function2) obj);
            case 5:
                return new kwg(obj, 0);
            case 6:
                return new b9b((CharSequence) obj);
            default:
                return ((ArrayList) obj).iterator();
        }
    }

    public /* synthetic */ tl0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
