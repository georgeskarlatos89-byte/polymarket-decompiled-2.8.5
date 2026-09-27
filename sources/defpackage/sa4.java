package defpackage;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class sa4 {
    public static final Collector a;

    static {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 1;
        a = Collector.of(new Supplier() { // from class: oa4
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i) {
                    case 0:
                        return jr9.k();
                    case 1:
                        rr9 rr9Var = rr9.b;
                        return new qr9();
                    default:
                        int i4 = tr9.c;
                        return new wq9(4);
                }
            }
        }, new BiConsumer() { // from class: pa4
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        qr9 qr9Var = (qr9) obj;
                        jnf jnfVar = (jnf) obj2;
                        qr9Var.getClass();
                        brn.e(jnfVar, "range must not be empty, but was %s", !jnfVar.a.equals(jnfVar.b));
                        qr9Var.a.add(jnfVar);
                        return;
                    case 1:
                        ((dr9) obj).a(obj2);
                        return;
                    default:
                        ((sr9) obj).g(obj2);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: qa4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        qr9 qr9Var = (qr9) obj;
                        qr9Var.getClass();
                        Iterator it = ((qr9) obj2).a.iterator();
                        while (it.hasNext()) {
                            jnf jnfVar = (jnf) it.next();
                            brn.e(jnfVar, "range must not be empty, but was %s", !jnfVar.a.equals(jnfVar.b));
                            qr9Var.a.add(jnfVar);
                        }
                        return qr9Var;
                    case 1:
                        dr9 dr9Var = (dr9) obj;
                        dr9 dr9Var2 = (dr9) obj2;
                        dr9Var.getClass();
                        dr9Var.c(dr9Var2.b, dr9Var2.a);
                        return dr9Var;
                    default:
                        return ((sr9) obj).i((sr9) obj2);
                }
            }
        }, new ra4(1), new Collector.Characteristics[0]);
        final int i4 = 2;
        final int i5 = 2;
        final int i6 = 2;
        Collector.of(new Supplier() { // from class: oa4
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i4) {
                    case 0:
                        return jr9.k();
                    case 1:
                        rr9 rr9Var = rr9.b;
                        return new qr9();
                    default:
                        int i42 = tr9.c;
                        return new wq9(4);
                }
            }
        }, new BiConsumer() { // from class: pa4
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        qr9 qr9Var = (qr9) obj;
                        jnf jnfVar = (jnf) obj2;
                        qr9Var.getClass();
                        brn.e(jnfVar, "range must not be empty, but was %s", !jnfVar.a.equals(jnfVar.b));
                        qr9Var.a.add(jnfVar);
                        return;
                    case 1:
                        ((dr9) obj).a(obj2);
                        return;
                    default:
                        ((sr9) obj).g(obj2);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: qa4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i6) {
                    case 0:
                        qr9 qr9Var = (qr9) obj;
                        qr9Var.getClass();
                        Iterator it = ((qr9) obj2).a.iterator();
                        while (it.hasNext()) {
                            jnf jnfVar = (jnf) it.next();
                            brn.e(jnfVar, "range must not be empty, but was %s", !jnfVar.a.equals(jnfVar.b));
                            qr9Var.a.add(jnfVar);
                        }
                        return qr9Var;
                    case 1:
                        dr9 dr9Var = (dr9) obj;
                        dr9 dr9Var2 = (dr9) obj2;
                        dr9Var.getClass();
                        dr9Var.c(dr9Var2.b, dr9Var2.a);
                        return dr9Var;
                    default:
                        return ((sr9) obj).i((sr9) obj2);
                }
            }
        }, new ra4(2), new Collector.Characteristics[0]);
        final int i7 = 1;
        final int i8 = 0;
        final int i9 = 0;
        Collector.of(new Supplier() { // from class: oa4
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i7) {
                    case 0:
                        return jr9.k();
                    case 1:
                        rr9 rr9Var = rr9.b;
                        return new qr9();
                    default:
                        int i42 = tr9.c;
                        return new wq9(4);
                }
            }
        }, new BiConsumer() { // from class: pa4
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i8) {
                    case 0:
                        qr9 qr9Var = (qr9) obj;
                        jnf jnfVar = (jnf) obj2;
                        qr9Var.getClass();
                        brn.e(jnfVar, "range must not be empty, but was %s", !jnfVar.a.equals(jnfVar.b));
                        qr9Var.a.add(jnfVar);
                        return;
                    case 1:
                        ((dr9) obj).a(obj2);
                        return;
                    default:
                        ((sr9) obj).g(obj2);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: qa4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        qr9 qr9Var = (qr9) obj;
                        qr9Var.getClass();
                        Iterator it = ((qr9) obj2).a.iterator();
                        while (it.hasNext()) {
                            jnf jnfVar = (jnf) it.next();
                            brn.e(jnfVar, "range must not be empty, but was %s", !jnfVar.a.equals(jnfVar.b));
                            qr9Var.a.add(jnfVar);
                        }
                        return qr9Var;
                    case 1:
                        dr9 dr9Var = (dr9) obj;
                        dr9 dr9Var2 = (dr9) obj2;
                        dr9Var.getClass();
                        dr9Var.c(dr9Var2.b, dr9Var2.a);
                        return dr9Var;
                    default:
                        return ((sr9) obj).i((sr9) obj2);
                }
            }
        }, new ra4(0), new Collector.Characteristics[0]);
    }
}
