package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xs8 implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public xs8(Sequence sequence, Function1 function1) {
        this.a = 2;
        sequence.getClass();
        this.b = sequence;
        this.c = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ws8(this);
            case 1:
                Sequence sequence = (Sequence) this.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = sequence.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                gb4.g(arrayList, (Comparator) this.c);
                return arrayList.iterator();
            case 2:
                return new q18(this);
            default:
                return new ws8(this, (byte) 0);
        }
    }

    public /* synthetic */ xs8(Sequence sequence, Object obj, int i) {
        this.a = i;
        this.b = sequence;
        this.c = obj;
    }

    public xs8(Function0 function0, Function1 function1) {
        this.a = 0;
        function1.getClass();
        this.b = function0;
        this.c = function1;
    }
}
