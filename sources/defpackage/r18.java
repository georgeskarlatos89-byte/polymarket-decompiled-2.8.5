package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r18 implements Sequence {
    public final Sequence a;
    public final boolean b;
    public final Function1 c;

    public r18(Sequence sequence, boolean z, Function1 function1) {
        sequence.getClass();
        this.a = sequence;
        this.b = z;
        this.c = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new q18(this);
    }
}
