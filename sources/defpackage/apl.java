package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class apl {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];

    public static final int a(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    public static final int b(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 > j) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return ~i3;
    }

    public static final ita c(lhj lhjVar) {
        lhjVar.getClass();
        tw5 e = lhjVar.e();
        e.getClass();
        if (e instanceof v44) {
            List parameters = ((v44) e).d().getParameters();
            parameters.getClass();
            List list = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.w(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((lhj) it.next()).d());
            }
            List upperBounds = lhjVar.getUpperBounds();
            upperBounds.getClass();
            int i = co6.a;
            ujc c2 = zn6.c(lhjVar);
            c2.getClass();
            ksa b2 = c2.b();
            ita h = new fij(new kvh(arrayList, 0)).h((ita) CollectionsKt.E(upperBounds), e4k.OUT_VARIANCE);
            if (h == null) {
                return b2.o();
            }
            return h;
        }
        if (e instanceof aq8) {
            List typeParameters = ((aq8) e).getTypeParameters();
            typeParameters.getClass();
            List list2 = typeParameters;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.w(list2));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((lhj) it2.next()).d());
            }
            List upperBounds2 = lhjVar.getUpperBounds();
            upperBounds2.getClass();
            int i2 = co6.a;
            ujc c3 = zn6.c(lhjVar);
            c3.getClass();
            ksa b3 = c3.b();
            ita h2 = new fij(new kvh(arrayList2, 0)).h((ita) CollectionsKt.E(upperBounds2), e4k.OUT_VARIANCE);
            if (h2 == null) {
                return b3.o();
            }
            return h2;
        }
        dmk.v("Unsupported descriptor type to build star projection type based on type parameters of it");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(int i, Object obj, u3g u3gVar, qi8 qi8Var, int i2) {
        boolean z;
        boolean z2;
        int i3;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z3 = false;
        if ((i & 1) != 0 && !Intrinsics.areEqual(u3gVar.b, qi8Var)) {
            qi8 qi8Var2 = qi8.b;
            qi8 qi8Var3 = qi8.d;
            if (qi8Var.a(qi8Var3) >= 0 && u3gVar.b.a(qi8Var3) < 0) {
                z = true;
                if ((i & 2) == 0 && i2 != u3gVar.c) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && !z) {
                    return obj;
                }
                if (!z) {
                    i3 = qi8Var.a;
                } else {
                    i3 = u3gVar.b.a;
                }
                if (z2 ? u3gVar.c == 1 : i2 == 1) {
                    z3 = true;
                }
                return Typeface.create((Typeface) obj, i3, z3);
            }
        }
        z = false;
        if ((i & 2) == 0) {
        }
        z2 = false;
        if (z2) {
        }
        if (!z) {
        }
        if (z2) {
            z3 = true;
            return Typeface.create((Typeface) obj, i3, z3);
        }
        z3 = true;
        return Typeface.create((Typeface) obj, i3, z3);
    }
}
