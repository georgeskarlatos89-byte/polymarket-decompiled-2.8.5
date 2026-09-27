package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.polymarket.android.R;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class c5n {
    public static final rbm a = new rbm(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID);
    public static final rbm b = new rbm("type");

    /* JADX WARN: Type inference failed for: r0v6, types: [apc, z0a] */
    public static final List a(uyh uyhVar, int i, int i2, ArrayList arrayList, z0a z0aVar, int i3, int i4, int i5, Function1 function1) {
        int i6;
        apc apcVar;
        p1b p1bVar;
        long j;
        long j2;
        int i7;
        Object obj;
        int i8;
        int max;
        long j3;
        if (uyhVar != null && !arrayList.isEmpty() && (i6 = z0aVar.b) != 0) {
            int i9 = -1;
            if (i2 - i >= 0 && i6 != 0) {
                IntRange k = lnf.k(0, i6);
                int i10 = k.a;
                int i11 = k.b;
                int i12 = -1;
                if (i10 <= i11) {
                    while (z0aVar.a(i10) <= i) {
                        i12 = z0aVar.a(i10);
                        if (i10 == i11) {
                            break;
                        }
                        i10++;
                    }
                }
                if (i12 == -1) {
                    apcVar = a1a.a;
                } else {
                    apc apcVar2 = a1a.a;
                    ?? z0aVar2 = new z0a(1, null);
                    z0aVar2.c(i12);
                    apcVar = z0aVar2;
                }
            } else {
                apcVar = a1a.a;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object obj2 = arrayList.get(i13);
                int index = ((p1b) obj2).getIndex();
                int[] iArr = z0aVar.a;
                int i14 = z0aVar.b;
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        break;
                    }
                    if (iArr[i15] == index) {
                        arrayList3.add(obj2);
                        break;
                    }
                    i15++;
                }
            }
            int[] iArr2 = apcVar.a;
            int i16 = apcVar.b;
            int i17 = 0;
            while (i17 < i16) {
                int i18 = iArr2[i17];
                Iterator it = arrayList.iterator();
                int i19 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((p1b) it.next()).getIndex() == i18) {
                            break;
                        }
                        i19++;
                    } else {
                        i19 = i9;
                        break;
                    }
                }
                if (i19 == i9) {
                    p1bVar = (p1b) function1.invoke(Integer.valueOf(i18));
                } else {
                    p1bVar = (p1b) arrayList.remove(i19);
                }
                int i20 = p1bVar.i();
                if (i19 == i9) {
                    i7 = Integer.MIN_VALUE;
                    j = 4294967295L;
                } else {
                    long l = p1bVar.l(0);
                    if (p1bVar.h()) {
                        j = 4294967295L;
                        j2 = l & 4294967295L;
                    } else {
                        j = 4294967295L;
                        j2 = l >> 32;
                    }
                    i7 = (int) j2;
                }
                int size2 = arrayList3.size();
                int i21 = 0;
                while (true) {
                    if (i21 < size2) {
                        obj = arrayList3.get(i21);
                        if (((p1b) obj).getIndex() != i18) {
                            break;
                        }
                        i21++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                p1b p1bVar2 = (p1b) obj;
                if (p1bVar2 != null) {
                    long l2 = p1bVar2.l(0);
                    if (p1bVar2.h()) {
                        j3 = l2 & j;
                    } else {
                        j3 = l2 >> 32;
                    }
                    i8 = (int) j3;
                } else {
                    i8 = Integer.MIN_VALUE;
                }
                if (i7 == Integer.MIN_VALUE) {
                    max = -i3;
                } else {
                    max = Math.max(-i3, i7);
                }
                if (i8 != Integer.MIN_VALUE) {
                    max = Math.min(max, i8 - i20);
                }
                p1bVar.k();
                p1bVar.d(max, 0, i4, i5);
                arrayList2.add(p1bVar);
                i17++;
                i9 = -1;
            }
            return arrayList2;
        }
        return CollectionsKt.emptyList();
    }

    public static final ViewParent b(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }
}
