package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bga implements Sequence {
    public final /* synthetic */ int a;
    public final /* synthetic */ Iterator b;

    public /* synthetic */ bga(int i, Iterator it) {
        this.a = i;
        this.b = it;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i = this.a;
        return this.b;
    }
}
