package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class pwg extends mwg {
    public static int g(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                CollectionsKt.F0();
                throw null;
            }
        }
        return i;
    }

    public static Sequence h(Sequence sequence, int i) {
        sequence.getClass();
        if (i >= 0) {
            if (i == 0) {
                return sequence;
            }
            if (sequence instanceof t27) {
                return ((t27) sequence).a(i);
            }
            return new o27(sequence, i, 0);
        }
        f27.q(sv6.j(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static r18 i(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new r18(sequence, false, function1);
    }

    public static Object j(Sequence sequence) {
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static q78 k(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new q78(sequence, function1, owg.f);
    }

    public static String l(Sequence sequence, String str, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        sequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : sequence) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            l2i.a(sb, obj, function1);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object m(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        ahh.i("Sequence is empty.");
        return null;
    }

    public static tbj n(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new tbj(sequence, function1);
    }

    public static r18 o(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new r18(new tbj(sequence, function1), false, new zog(21));
    }

    public static Sequence p(Sequence sequence, int i) {
        sequence.getClass();
        if (i >= 0) {
            if (i == 0) {
                return ed7.a;
            }
            if (sequence instanceof t27) {
                return ((t27) sequence).b(i);
            }
            return new o27(sequence, i, 1);
        }
        f27.q(sv6.j(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List q(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return eb4.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
