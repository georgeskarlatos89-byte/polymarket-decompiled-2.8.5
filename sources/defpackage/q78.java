package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class q78 implements Sequence {
    public final Sequence a;
    public final Function1 b;
    public final Function1 c;

    public q78(Sequence sequence, Function1 function1, Function1 function12) {
        sequence.getClass();
        function1.getClass();
        this.a = sequence;
        this.b = function1;
        this.c = function12;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new q18(this);
    }
}
