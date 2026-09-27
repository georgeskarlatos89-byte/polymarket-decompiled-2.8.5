package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gb0 implements CharSequence {
    public final List a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    static {
        zcg zcgVar = zgg.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [apc, z0a] */
    public gb0(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                fb0 fb0Var = (fb0) list.get(i);
                Object obj = fb0Var.a;
                if (obj instanceof vfh) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(fb0Var);
                } else if (obj instanceof aud) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(fb0Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        if (arrayList2 != null) {
            list2 = CollectionsKt.z0(arrayList2, new y36(10));
        } else {
            list2 = null;
        }
        List list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            int i2 = ((fb0) CollectionsKt.E(list2)).c;
            apc apcVar = a1a.a;
            ?? z0aVar = new z0a(1, null);
            z0aVar.c(i2);
            int size2 = list2.size();
            for (int i3 = 1; i3 < size2; i3++) {
                fb0 fb0Var2 = (fb0) list2.get(i3);
                while (true) {
                    if (z0aVar.b != 0) {
                        int b = z0aVar.b();
                        int i4 = fb0Var2.b;
                        int i5 = fb0Var2.c;
                        if (i4 >= b) {
                            z0aVar.e(z0aVar.b - 1);
                        } else if (i5 > b) {
                            lw9.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + b);
                        }
                    }
                }
                z0aVar.c(fb0Var2.c);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public final List a(int i) {
        ?? emptyList;
        List list = this.a;
        if (list != null) {
            emptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                fb0 fb0Var = (fb0) obj;
                if ((fb0Var.a instanceof qab) && hb0.c(0, i, fb0Var.b, fb0Var.c)) {
                    emptyList.add(obj);
                }
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        emptyList.getClass();
        return emptyList;
    }

    public final List b(int i, int i2) {
        List list = this.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                fb0 fb0Var = (fb0) list.get(i3);
                Object obj = fb0Var.a;
                int i4 = fb0Var.c;
                int i5 = fb0Var.b;
                if ((obj instanceof m1i) && hb0.c(i, i2, i5, i4)) {
                    Object obj2 = fb0Var.a;
                    obj2.getClass();
                    arrayList.add(new fb0(fb0Var.d, i5, i4, ((m1i) obj2).a));
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    public final List c(int i, int i2, String str) {
        List list = this.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                fb0 fb0Var = (fb0) list.get(i3);
                Object obj = fb0Var.a;
                int i4 = fb0Var.c;
                int i5 = fb0Var.b;
                String str2 = fb0Var.d;
                if ((obj instanceof m1i) && Intrinsics.areEqual(str, str2) && hb0.c(i, i2, i5, i4)) {
                    Object obj2 = fb0Var.a;
                    obj2.getClass();
                    arrayList.add(new fb0(str2, i5, i4, ((m1i) obj2).a));
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final gb0 d(Function1 function1) {
        eb0 eb0Var = new eb0(this);
        ArrayList arrayList = eb0Var.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fb0 fb0Var = (fb0) function1.invoke(((db0) arrayList.get(i)).a(Integer.MIN_VALUE));
            Object obj = fb0Var.a;
            arrayList.set(i, new db0(fb0Var.d, fb0Var.b, fb0Var.c, obj));
        }
        return eb0Var.k();
    }

    public final gb0 e(int i, int i2) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lw9.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        gb0 gb0Var = hb0.a;
        if (i > i2) {
            lw9.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.a;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                fb0 fb0Var = (fb0) list.get(i3);
                int i4 = fb0Var.b;
                int i5 = fb0Var.c;
                if (hb0.c(i, i2, i4, i5)) {
                    arrayList2.add(new fb0(fb0Var.d, Math.max(i, fb0Var.b) - i, Math.min(i2, i5) - i, fb0Var.a));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new gb0(arrayList, substring);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb0)) {
            return false;
        }
        gb0 gb0Var = (gb0) obj;
        if (Intrinsics.areEqual(this.b, gb0Var.b) && Intrinsics.areEqual(this.a, gb0Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        List list = this.a;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ /* synthetic */ CharSequence subSequence(int i, int i2) {
        return e(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gb0(String str, List list, List list2) {
        this(list, str);
        gb0 gb0Var = hb0.a;
        if (list.isEmpty() && list2.isEmpty()) {
            list = null;
        } else if (!list2.isEmpty()) {
            if (list.isEmpty()) {
                list = list2;
            } else {
                ArrayList arrayList = new ArrayList(list2.size() + list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add((fb0) list.get(i));
                }
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add((fb0) list2.get(i2));
                }
                list = arrayList;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public /* synthetic */ gb0(String str, ArrayList arrayList, List list, int i) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : arrayList, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public /* synthetic */ gb0(String str) {
        this(str, CollectionsKt.emptyList());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gb0(String str, List list) {
        this(r3.isEmpty() ? null : r3, str);
        List list2 = list;
    }
}
