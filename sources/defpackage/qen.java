package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class qen {
    public static int a(wgd wgdVar, boolean z) {
        int i;
        byte b;
        int i2 = wgdVar.b;
        int i3 = wgdVar.c;
        if (z) {
            i = i3;
        } else {
            i = i2;
        }
        if (!z) {
            i2 = i3;
        }
        byte[][] bArr = (byte[][]) wgdVar.d;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            byte b2 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                if (z) {
                    b = bArr[i5][i7];
                } else {
                    b = bArr[i7][i5];
                }
                if (b == b2) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b2 = b;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }

    public static Drawable b(Context context, int i) {
        return z3g.b().c(context, i);
    }

    public static boolean c(uzg uzgVar, Collection collection) {
        collection.getClass();
        if (collection instanceof hjl) {
            collection = ((hjl) collection).zza();
        }
        boolean z = false;
        if ((collection instanceof Set) && collection.size() > uzgVar.size()) {
            Iterator<E> it = uzgVar.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            z |= uzgVar.remove(it2.next());
        }
        return z;
    }
}
