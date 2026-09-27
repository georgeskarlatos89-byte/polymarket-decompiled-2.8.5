package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class el4 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final Lazy f;
    public final Lazy g;

    public el4(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = LazyKt.lazy(new Function0(this) { // from class: bl4
            public final /* synthetic */ el4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                el4 el4Var = this.b;
                switch (i2) {
                    case 0:
                        List list6 = el4Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            CollectionsKt.o(arrayList, (List) ((Function0) list6.get(i3)).invoke());
                            i3++;
                        }
                        el4Var.d = CollectionsKt.emptyList();
                        return arrayList;
                    default:
                        List list7 = el4Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            CollectionsKt.o(arrayList2, (List) ((Function0) list7.get(i3)).invoke());
                            i3++;
                        }
                        el4Var.e = CollectionsKt.emptyList();
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = LazyKt.lazy(new Function0(this) { // from class: bl4
            public final /* synthetic */ el4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                el4 el4Var = this.b;
                switch (i22) {
                    case 0:
                        List list6 = el4Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            CollectionsKt.o(arrayList, (List) ((Function0) list6.get(i3)).invoke());
                            i3++;
                        }
                        el4Var.d = CollectionsKt.emptyList();
                        return arrayList;
                    default:
                        List list7 = el4Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            CollectionsKt.o(arrayList2, (List) ((Function0) list7.get(i3)).invoke());
                            i3++;
                        }
                        el4Var.e = CollectionsKt.emptyList();
                        return arrayList2;
                }
            }
        });
    }
}
