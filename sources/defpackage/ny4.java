package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ny4 implements Sequence {
    public final AtomicReference a;

    public ny4(Sequence sequence) {
        this.a = new AtomicReference(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        dmk.n("This sequence can be consumed only once.");
        return null;
    }
}
