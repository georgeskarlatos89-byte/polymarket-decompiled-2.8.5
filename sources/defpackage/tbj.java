package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tbj implements Sequence {
    public final Sequence a;
    public final Function1 b;

    public tbj(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        this.a = sequence;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new tj6(this);
    }
}
