package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bl6 implements Sequence {
    public final CharSequence a;
    public final int b;
    public final Function2 c;

    public bl6(CharSequence charSequence, int i, Function2 function2) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new al6(this);
    }
}
